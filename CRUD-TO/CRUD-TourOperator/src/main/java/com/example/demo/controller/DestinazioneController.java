package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Destinazione;
import com.example.demo.repository.DestinazioneRepository;

@RestController
@RequestMapping("/destinations")
public class DestinazioneController {

    @Autowired
    private DestinazioneRepository destinazioneRepository;

    // tutte le destinazioni
    @GetMapping
    public List<Destinazione> getAllDestinazioni() {
        return destinazioneRepository.findAll();
    }

    // seleziona una dest con l'id
    @GetMapping("/{id}")
    public ResponseEntity<Destinazione> getDestinazione(@PathVariable Long id) {
        
    }

    

}
