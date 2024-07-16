package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
	//trova tutte le categorie per nome
	List<Utente> findByName(String name);
	
	//trova tutte le categorie che contengono una determinata stringa nel nome
	List<Utente> findByNameContaining(String namePart);
}
