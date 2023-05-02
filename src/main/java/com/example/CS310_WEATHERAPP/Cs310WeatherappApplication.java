package com.example.CS310_WEATHERAPP;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.CS310_WEATHERAPP.repo.LocationRepo;

import Model.Location;

@SpringBootApplication
public class Cs310WeatherappApplication implements CommandLineRunner {

	public static final Logger mylogger = LoggerFactory.getLogger(Cs310WeatherappApplication.class);
	
	@Autowired LocationRepo locRepo;
	/*@Autowired MongoTemplate mongoTemplate;*/
	
	
	public static void main(String[] args) {
		SpringApplication.run(Cs310WeatherappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		long count = locRepo.count();
		
		mylogger.info("Count of data rows: " + count);
		
		if (locRepo.count() == 0) {
			
			List<Location> locToSave = new ArrayList<>();
			Location l1 = new Location("Adana", "Cloudy", 8, 32);
			Location l2 = new Location("Istanbul","Rainy", -2,24);
			locToSave.add(l1);
			locToSave.add(l2);
			
			locRepo.insert(locToSave);
			
			mylogger.info("Location is saved!");
			mylogger.info(locRepo.findAll().toString());
			
		}
		else {
			mylogger.info("Already inserted!");
			mylogger.info(locRepo.findAll().toString());
		}
		
		mylogger.info("-----------------");
		
	}
	
	
}
