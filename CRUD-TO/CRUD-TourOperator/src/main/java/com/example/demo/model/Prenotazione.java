package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pren;
	
	private Short num_viaggiatori, giorni;
	
	private Date data_nascita;
	
	private Double totale;
	
	private String nome, cognome, indirizzo, partenza, destinazione, sistemazione;

	public Long getId_pren() {
		return id_pren;
	}

	public void setId_pren(Long id_pren) {
		this.id_pren = id_pren;
	}

	public Short getNum_viaggiatori() {
		return num_viaggiatori;
	}

	public void setNum_viaggiatori(Short num_viaggiatori) {
		this.num_viaggiatori = num_viaggiatori;
	}

	public Short getGiorni() {
		return giorni;
	}

	public void setGiorni(Short giorni) {
		this.giorni = giorni;
	}

	public Date getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}

	public Double getTotale() {
		return totale;
	}

	public void setTotale(Double totale) {
		this.totale = totale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getSistemazione() {
		return sistemazione;
	}

	public void setSistemazione(String sistemazione) {
		this.sistemazione = sistemazione;
	}
}
