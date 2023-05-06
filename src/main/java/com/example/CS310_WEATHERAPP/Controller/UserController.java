package com.example.CS310_WEATHERAPP.Controller;

import com.example.CS310_WEATHERAPP.Model.User;
import com.example.CS310_WEATHERAPP.Model.WeatherInfo;
import com.example.CS310_WEATHERAPP.Service.ResourceNotFoundException;
import com.example.CS310_WEATHERAPP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    // USER CONTROLS

    @PutMapping("/addToList/{id}")
    public ResponseEntity<List<WeatherInfo>> addWeatherInfoToList(@PathVariable String id,@RequestBody WeatherInfo weatherInfo) throws ResourceNotFoundException {
        return service.addWeatherInfoToList(id, weatherInfo);
    }

    @PutMapping("/deleteFromList/{id}")
    public ResponseEntity<List<WeatherInfo>> deleteWeatherInfoFromList(@PathVariable String id,@RequestBody WeatherInfo weatherInfo) throws ResourceNotFoundException {
        return service.deleteWeatherInfoFromList(id, weatherInfo);
    }

    // ADMIN CONTROLS

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findUser(@PathVariable String id) throws ResourceNotFoundException {
        return service.getUserbyId(id);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user) throws ResourceNotFoundException {
        return service.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable String id){
        return service.deleteUser(id);
    }
}
