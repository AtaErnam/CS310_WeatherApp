package com.example.CS310_WEATHERAPP.Service;

import com.example.CS310_WEATHERAPP.Model.Location;
import com.example.CS310_WEATHERAPP.Model.Weather;
import com.example.CS310_WEATHERAPP.repo.LocationRepository;
import com.example.CS310_WEATHERAPP.repo.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    private final WeatherRepository repository;

    @Autowired
    public WeatherService(WeatherRepository repository) {
        this.repository = repository;
    }

    // ADMIN SERVICE
    public Weather saveWeather(Weather weather){
        return  repository.save(weather);
    }

    public List<Weather> getWeathers(){
        return repository.findAll();
    }

    public String maltuna() {
        return "MALTUNA";
    }

    public Weather getWeatherbyId(String id) throws ResourceNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Weather doesnt exist for id = %s!", id)));
    }

    public String deleteWeather(String id){
        repository.deleteById(id);
        return "Weather with id:" + id + " is removed!";
    }

    public Weather updateWeather(Weather weather) throws ResourceNotFoundException {
        Weather existingWeather = repository.findById(weather.getId()).orElseThrow(() -> new ResourceNotFoundException(String.format("Weather doesnt exist for id = %s!", weather.getId())));
        existingWeather.setWeatherEvent(weather.getWeatherEvent());
        existingWeather.setTempHigh(weather.getTempHigh());
        existingWeather.setTempLow(weather.getTempLow());
        existingWeather.setWindSpeed(weather.getWindSpeed());
        existingWeather.setHumidity(weather.getHumidity());
        existingWeather.setUv(weather.getUv());
        existingWeather.setAirQuality(weather.getAirQuality());

        return repository.save(existingWeather);
    }
}
