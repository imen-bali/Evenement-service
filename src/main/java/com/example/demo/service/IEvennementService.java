package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Evenement;

public interface IEvennementService {
	// Crud sur les evenements
	public Evenement addEvenement(Evenement e);

	public void deleteEvenement(Long id);

	public Evenement updateEvenement(Evenement e);

	public Evenement findEvenement(Long id);

	public List<Evenement> findAll();

	// Filtrage par propriété
	public Evenement findByTitre(String titre);

	public Evenement findByLieu(String lieu);

	public Evenement findByDate(Date Date);

	// other ...

}
