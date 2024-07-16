package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
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
	
	@GetMapping("/{id}")
	public Utente getUtentiById(@PathVariable Long Id){
		return utenteRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}
	
	@PutMapping("/{id}")
	public Utente updateUtente(@PathVariable Long Id, @RequestBody Utente utenteDetails) {
		Utente utente = utenteRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
		
		
		return utenteRepository.save(utente);
	}
	
	@DeleteMapping("/{id}") 
		public void deleteUtente(@PathVariable Long id) {
		Utente utente = utenteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
			
		utenteRepository.delete(utente);
		}
	
	//metodo personalizzato per trovare categorie per nome
	// localhost:8080/categories/searchByName?name=horror
	@GetMapping("/searchByName")
	public List<Utente> getUtentiByName(@RequestParam String name) {
		return utenteRepository.findByName(name);
	}
	
	//metodo personalizzato per trovare categorie che contengono una stringa nel nome
	// localhost:8080/categories/searchByName?name=fanta -- mi restituirà fantasy e fantascienza
	@GetMapping("/searchByNameContaining")
	public List<Utente> getUtentiByNameContaining(@RequestParam String namePart) {
		return utenteRepository.findByNameContaining(namePart);
	}
}
