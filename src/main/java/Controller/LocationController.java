package Controller;

import Model.Location;
import Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Location findLocation(@PathVariable String id){
        return service.getLocationbyId(id);
    }

    @PutMapping("/updateLocation")
    public Location updateLocation(@RequestBody Location location){
        return service.updateLocation(location);
    }

    @DeleteMapping("/deleteLocation/{id}")
    public String deleteLocation(@PathVariable String id){
        return service.deleteLocation(id);
    }
}
