package com.example.CS310_WEATHERAPP.Controller;

import com.example.CS310_WEATHERAPP.Model.Location;
import com.example.CS310_WEATHERAPP.Model.Weather;
import com.example.CS310_WEATHERAPP.Service.LocationService;
import com.example.CS310_WEATHERAPP.Service.ResourceNotFoundException;
import com.example.CS310_WEATHERAPP.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService service;

    // ADMIN CONTROLS

    @PostMapping("/addWeather")
    public Weather addWeather(@RequestBody Weather weather){
        return service.saveWeather(weather);
    }

    @GetMapping("/weathers")
    public List<Weather> findAllWeathers(){
        return service.getWeathers();
    }

    @GetMapping("/weather/{id}")
    public Weather findWeather(@PathVariable String id) throws ResourceNotFoundException {
        return service.getWeatherbyId(id);
    }

    @PutMapping("/updateWeather")
    public Weather updateWeather(@RequestBody Weather weather) throws ResourceNotFoundException {
        return service.updateWeather(weather);
    }

    @DeleteMapping("/deleteWeather/{id}")
    public String deleteWeather(@PathVariable String id){
        return service.deleteWeather(id);
    }

}
