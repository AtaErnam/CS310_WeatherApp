package Controller;

import Model.Location;
import Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.CS310_WEATHERAPP.repo.LocationRepo;

import java.util.List;

@RestController
@RequestMapping("/temp")
public class LocationController {

    @Autowired
    private LocationService service;

    @Autowired LocationRepo locRepo;
    
    // ADMIN CONTROLS

    /*
    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location){
        return service.saveLocation(location);
    }
    */
    
    @PostMapping("/addLocation")
    public void addLocation(@RequestBody Location location){
        try {
        	locRepo.insert(location);
        }
        catch (Exception e) {
        	
        }
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
