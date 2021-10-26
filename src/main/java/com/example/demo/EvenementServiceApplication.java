package com.example.demo;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entity.Evenement;
import com.example.demo.service.IEvennementService;

@SpringBootApplication
public class EvenementServiceApplication implements CommandLineRunner {
	@Autowired
	EvenementRepository evenementRepository;

	@Autowired
	IEvennementService evenementService;

	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormatter.parse("2020-05-01");
		Date date2 = dateFormatter.parse("2020-05-02");

		Evenement event1 = new Evenement();
		event1.setTitre("titre1");
		event1.setLieu("Tunis");
		event1.setDate(date1);
		evenementRepository.save(event1);
		System.out.println(event1);

		Evenement event2 = new Evenement();
		event2.setTitre("titre2");
		event2.setLieu("Sfax");
		event2.setDate(date2);
		evenementRepository.save(event2); // Update event Evenement e =
		evenementService.findEvenement(1L);

		event1.setTitre("Le titre du 1er evenement");
		evenementService.updateEvenement(event1);
		/*
		 * delete evenementService.deleteEvenement(1L);
		*/
		Evenement e = evenementRepository.findByLieu("sfax");
		System.out.println(e); 
	}
}
