package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Destinazione;
import com.example.demo.repository.DestinazioneRepository;

@RestController
@RequestMapping("/destinations")
public class DestinazioneController {

    @Autowired
    private DestinazioneRepository destinazioneRepository;
    
    @GetMapping
    public List<Destinazione> getAllDestinazioni() {
        return destinazioneRepository.findAll();
    }
    
	@PostMapping
	public Destinazione createCategory(@RequestBody Destinazione destinazione) {
		return destinazioneRepository.save(destinazione);
	}
}

