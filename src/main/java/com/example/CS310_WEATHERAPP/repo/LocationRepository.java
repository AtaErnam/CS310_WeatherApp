package com.example.CS310_WEATHERAPP.repo;

import com.example.CS310_WEATHERAPP.Model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<Location,String> {

}
