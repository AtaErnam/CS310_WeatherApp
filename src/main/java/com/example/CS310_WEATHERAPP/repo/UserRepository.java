package com.example.CS310_WEATHERAPP.repo;


import com.example.CS310_WEATHERAPP.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
