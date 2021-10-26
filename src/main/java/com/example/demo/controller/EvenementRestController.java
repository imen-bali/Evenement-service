package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Evenement;
import com.example.demo.service.IEvennementService;

public class EvenementRestController {
	@Autowired
	IEvennementService evenementService;

	@RequestMapping(value = "/evenements", method = RequestMethod.GET)
	public List<Evenement> findEvenements() {
		return evenementService.findAll();
	}

	@GetMapping(value = "/evenement/{id}")

	public Evenement findOneEvenementById(@PathVariable Long id) {

		return evenementService.findEvenement(id);
	}

	@GetMapping(value = "/evenement/search/titre")

	public Evenement findOneEvenementByTitre(@RequestParam String titre)

	{
		return evenementService.findByTitre(titre);
	}

	@GetMapping(value = "/evenement/search/date")

	public Evenement findOneEvenementByDate(@RequestParam Date Date)

	{
		return evenementService.findByDate(Date);
	}

	@GetMapping(value = "/evenement/search/lieu")

	public Evenement findOneEvenementByLieu(@RequestParam String lieu)

	{
		return evenementService.findByLieu(lieu);
	}

	@PostMapping(value = "/evenement")

	public Evenement addEvenement(@RequestBody Evenement e)

	{
		return evenementService.addEvenement(e);

	}

	@DeleteMapping(value = "/evenement/{id}")

	public void deleteEvenement(@PathVariable Long id)

	{

		evenementService.deleteEvenement(id);

	}

	@PutMapping(value = "/evenements/etudiant/{id}")

	public Evenement updateEvenement(@PathVariable Long id, Evenement e)

	{

		e.setId(id);
		return evenementService.updateEvenement(e);

	}

}
