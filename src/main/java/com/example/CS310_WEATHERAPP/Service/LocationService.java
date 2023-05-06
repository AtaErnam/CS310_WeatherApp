package com.example.CS310_WEATHERAPP.Service;

import com.example.CS310_WEATHERAPP.Model.Location;
import com.example.CS310_WEATHERAPP.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository repository;

    @Autowired
    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    // ADMIN SERVICE
    public Location saveLocation(Location location){
        return  repository.save(location);
    }

    public List<Location> getLocations(){
        return repository.findAll();
    }
    
    public String maltuna() {
    	return "MALTUNA"; 
    }

    public Location getLocationbyId(String id) throws ResourceNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Location doesnt exist for id = %s!", id)));
    }

    public String deleteLocation(String id){
        repository.deleteById(id);
        return "Location with id:" + id + " is removed!";
    }

    public Location updateLocation(Location location) throws ResourceNotFoundException {
        Location existingLocation = repository.findById(location.getId()).orElseThrow(() -> new ResourceNotFoundException(String.format("Location doesnt exist for id = %s!", location.getId())));

        existingLocation.setLongtitude(location.getLongtitude());
        existingLocation.setLatitude(location.getLatitude());
        existingLocation.setStateName(location.getStateName());
        existingLocation.setProvince(location.getProvince());

        return repository.save(existingLocation);
    }
}
