package Service;

import Model.Location;
import Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public Location getLocationbyId(String id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.format("Location doesnt exist for id = %s!", id)));
    }

    public String deleteLocation(String id){
        repository.deleteById(id);
        return "Location with id:" + id + " is removed!";
    }

    public Location updateLocation(Location location){
        Location existingLocation = repository.findById(location.getId()).orElseThrow(() -> new EntityNotFoundException(String.format("Location doesnt exist for id = %s!", location.getId())));


        return repository.save(existingLocation);
    }
}
