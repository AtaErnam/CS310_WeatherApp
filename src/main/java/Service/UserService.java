package Service;

import Model.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.CS310_WEATHERAPP.repo.UserRepository;

import java.util.List;
import javax.persistence.EntityNotFoundException;


@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // ADMIN SERVICE
    public User saveUser(User user){
        return  repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserbyId(String id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.format("User doesnt exist for id = %s!", id)));
    }

    public String deleteUser(String id){
        repository.deleteById(id);
        return "User with id:" + id + " is removed!";
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElseThrow(() -> new EntityNotFoundException(String.format("User doesnt exist for id = %s!", user.getId())));


        return repository.save(existingUser);
    }
}
