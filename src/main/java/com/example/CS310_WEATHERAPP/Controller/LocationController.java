package com.example.CS310_WEATHERAPP.Controller;

import com.example.CS310_WEATHERAPP.Model.Location;
import com.example.CS310_WEATHERAPP.Service.LocationService;
import com.example.CS310_WEATHERAPP.Service.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LocationController {

    @Autowired
    private LocationService service;

    // ADMIN CONTROLS

    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location){
        return service.saveLocation(location);
    }

    @GetMapping("/locations")
    public List<Location> findAllLocations(){
        return service.getLocations();
    }

    @GetMapping("/location/{id}")
    public Location findLocation(@PathVariable String id) throws ResourceNotFoundException {
        return service.getLocationbyId(id);
    }

    @PutMapping("/updateLocation")
    public Location updateLocation(@RequestBody Location location) throws ResourceNotFoundException {
        return service.updateLocation(location);
    }

    @DeleteMapping("/deleteLocation/{id}")
    public String deleteLocation(@PathVariable String id){
        return service.deleteLocation(id);
    }
    
    @GetMapping("/testalper")
    public String alpertest() {
    	return service.maltuna();
    }
    
}
