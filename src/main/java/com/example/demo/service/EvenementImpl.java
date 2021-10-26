package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entity.Evenement;

@Service
public class EvenementImpl implements IEvennementService {
	@Autowired
	EvenementRepository evenementRepository;

	@Override
	public Evenement addEvenement(Evenement e) {
		evenementRepository.save(e);
		return e;
	}

	@Override
	public void deleteEvenement(Long id) {
		evenementRepository.deleteById(id);

	}

	@Override
	public Evenement updateEvenement(Evenement e) {
		return evenementRepository.saveAndFlush(e);

	}

	@Override
	public Evenement findEvenement(Long id) {
		Evenement e = (Evenement) evenementRepository.findById(id).get();
		return e;
	}

	@Override
	public List<Evenement> findAll() {
		return evenementRepository.findAll();
	}

	@Override
	public Evenement findByTitre(String titre) {
		return evenementRepository.findByTitreStartingWith(titre);
	}

	@Override
	public Evenement findByLieu(String lieu) {
		return evenementRepository.findByLieu(lieu);

	}

	@Override
	public Evenement findByDate(Date Date) {
		return evenementRepository.findByDate(Date);
	}

}
