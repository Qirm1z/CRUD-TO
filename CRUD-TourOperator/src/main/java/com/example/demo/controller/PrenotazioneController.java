package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Prenotazione;
import com.example.demo.repository.PrenotazioneRepository;

@RestController
@RequestMapping("/reservations")
public class PrenotazioneController {
	
	@Autowired
	private PrenotazioneRepository prenotazioneRepository;
	
	@GetMapping
	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneRepository.findAll();
	}
}
