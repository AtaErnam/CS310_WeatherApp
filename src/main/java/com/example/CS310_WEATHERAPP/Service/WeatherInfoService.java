package com.example.CS310_WEATHERAPP.Service;

import com.example.CS310_WEATHERAPP.Model.WeatherInfo;
import com.example.CS310_WEATHERAPP.repo.WeatherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherInfoService {
    private final WeatherInfoRepository repository;

    @Autowired
    public WeatherInfoService(WeatherInfoRepository repository) {
        this.repository = repository;
    }

    // ADMIN SERVICE
    public WeatherInfo saveWeatherInfo(WeatherInfo weatherInfo){
        return  repository.save(weatherInfo);
    }

    public List<WeatherInfo> getWeatherInfos(){
        return repository.findAll();
    }



    public WeatherInfo getWeatherInfobyId(String id) throws ResourceNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("WeatherInfo doesnt exist for id = %s!", id)));
    }

    public String deleteWeatherInfo(String id){
        repository.deleteById(id);
        return "WeatherInfo with id:" + id + " is removed!";
    }

    public WeatherInfo updateWeatherInfo(WeatherInfo weatherInfo) throws ResourceNotFoundException {
        WeatherInfo existingWeatherInfo = repository.findById(weatherInfo.getId()).orElseThrow(() -> new ResourceNotFoundException(String.format("WeatherInfo doesnt exist for id = %s!", weatherInfo.getId())));
        existingWeatherInfo.setWeatherId(weatherInfo.getWeatherId());
        existingWeatherInfo.setLocId(weatherInfo.getLocId());

        return repository.save(existingWeatherInfo);
    }
}
