package com.example.wbdv2019finalprojectserver.services;

import java.util.List;
import com.example.wbdv2019finalprojectserver.models.User;
import com.example.wbdv2019finalprojectserver.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAllUsers();    
    }

    public User findUserById(Integer userId){
        return repository.findUserById(userId);
    }

    public void deleteUser(Integer userId){
        repository.deleteById(userId);
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public User updateUser(User user, Integer id){
        User newUser = repository.findUserById(id);
        newUser.setId(id);
        newUser.setEmail(user.getEmail());
        newUser.setLikedRestaurants(user.getLikedRestaurants());
        newUser.setName(user.getName());
        newUser.setPassword(user.getPassword());
        newUser.setLocationLat(user.getLocationLat());
        newUser.setLocationLong(user.getLocationLong());
        return repository.save(newUser);
    }

}