package com.example.CS310_WEATHERAPP.repo;

import Model.Location;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends MongoRepository<Location,String> {
	
	public List<Location> findByProvince(String province);
	
	
	
}
