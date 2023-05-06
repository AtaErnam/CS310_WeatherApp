package com.example.CS310_WEATHERAPP.Service;

import com.example.CS310_WEATHERAPP.Model.User;
import com.example.CS310_WEATHERAPP.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // ADMIN SERVICE
    public User saveUser(User user){
        return  repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public ResponseEntity<User> getUserbyId(String id) throws ResourceNotFoundException {
        User user = repository.findById(id).orElseThrow(() ->
                new  ResourceNotFoundException((String.format("User doesnt exist for id = %s!", id))));
        return ResponseEntity.ok(user);
    }

    public String deleteUser(String id){
        repository.deleteById(id);
        return "User with id:" + id + " is removed!";
    }

    public ResponseEntity<User> updateUser(User user) throws ResourceNotFoundException {
        User existingUser = repository.findById(user.getId()).orElseThrow(() -> new ResourceNotFoundException(String.format("User doesnt exist for id = %s!", user.getId())));
        existingUser.setName(user.getName());
        repository.save(existingUser);

        return ResponseEntity.ok(existingUser);
    }
}
