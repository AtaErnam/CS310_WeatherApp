package com.example.CS310_WEATHERAPP.Service;

import com.example.CS310_WEATHERAPP.Model.User;
import com.example.CS310_WEATHERAPP.Model.WeatherInfo;
import com.example.CS310_WEATHERAPP.repo.UserRepository;
import com.example.CS310_WEATHERAPP.repo.WeatherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    private final WeatherInfoRepository weatherInforepository;


    public UserService(UserRepository repository, WeatherInfoRepository weatherInforepository) {
        this.repository = repository;
        this.weatherInforepository = weatherInforepository;
    }

    // USER SERVICE

    public ResponseEntity<List<WeatherInfo>> addWeatherInfoToList(String id, WeatherInfo weatherInfo) throws ResourceNotFoundException {
        User user = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException((String.format("User doesnt exist for id = %s!", id))));
        WeatherInfo existingWeatherInfo = weatherInforepository.findById(weatherInfo.getId()).orElseThrow(() ->
                new ResourceNotFoundException((String.format("WeatherInfo doesnt exist for id = %s!", weatherInfo.getId()))));

        List<WeatherInfo> InfoList = user.getWeatherInfoList();
        InfoList.add(existingWeatherInfo);
        repository.save(user);
        return ResponseEntity.status(200).body(InfoList);
    }

    public ResponseEntity<List<WeatherInfo>> deleteWeatherInfoFromList(String id, WeatherInfo weatherInfo) throws ResourceNotFoundException {
        User user = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException((String.format("User doesnt exist for id = %s!", id))));
        WeatherInfo existingWeatherInfo = weatherInforepository.findById(weatherInfo.getId()).orElseThrow(() ->
                new ResourceNotFoundException((String.format("WeatherInfo doesnt exist for id = %s!", weatherInfo.getId()))));

        List<WeatherInfo> InfoList = user.getWeatherInfoList();
        InfoList.remove(existingWeatherInfo);
        repository.save(user);
        return ResponseEntity.status(204).body(InfoList);
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
