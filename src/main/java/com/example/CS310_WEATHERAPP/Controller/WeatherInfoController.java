package com.example.CS310_WEATHERAPP.Controller;

import com.example.CS310_WEATHERAPP.Model.WeatherInfo;
import com.example.CS310_WEATHERAPP.Service.ResourceNotFoundException;
import com.example.CS310_WEATHERAPP.Service.WeatherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weatherinfo")
public class WeatherInfoController {

    @Autowired
    private WeatherInfoService service;

    // ADMIN CONTROLS

    @PostMapping("/addWeatherInfo")
    public WeatherInfo addWeatherInfo(@RequestBody WeatherInfo weather){
        return service.saveWeatherInfo(weather);
    }

    @GetMapping("/weatherInfo")
    public List<WeatherInfo> findAllWeatherInfos(){
        return service.getWeatherInfos();
    }

    @GetMapping("/weatherInfo/{id}")
    public WeatherInfo findWeatherInfo(@PathVariable String id) throws ResourceNotFoundException {
        return service.getWeatherInfobyId(id);
    }

    @PutMapping("/updateWeatherInfo")
    public WeatherInfo updateWeatherInfo(@RequestBody WeatherInfo weather) throws ResourceNotFoundException {
        return service.updateWeatherInfo(weather);
    }

    @DeleteMapping("/deleteWeatherInfo/{id}")
    public String deleteWeatherInfo(@PathVariable String id){
        return service.deleteWeatherInfo(id);
    }

}
