package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@RestController
@RequestMapping("/users")
public class UtenteController {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@GetMapping
	public List<Utente> getAllUtenti() {
		return utenteRepository.findAll();
	}
}
