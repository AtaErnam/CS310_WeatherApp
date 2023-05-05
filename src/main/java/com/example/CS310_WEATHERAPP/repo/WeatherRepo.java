package com.example.CS310_WEATHERAPP.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Model.Weather;

@Repository
public interface WeatherRepo extends MongoRepository<Weather, String> {

}
