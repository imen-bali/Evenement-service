package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

	Evenement findByTitreStartingWith(String caractere);

	Evenement findByLieu(String Lieu);

	Evenement findByDate(Date Date);
}
