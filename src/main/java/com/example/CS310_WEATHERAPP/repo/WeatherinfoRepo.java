package com.example.CS310_WEATHERAPP.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Model.Weatherinfo;

@Repository
public interface WeatherinfoRepo extends MongoRepository<Weatherinfo, String> {

}
