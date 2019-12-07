package com.example.wbdv2019finalprojectserver.services;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.UserAdmin;
import com.example.wbdv2019finalprojectserver.repositories.UserAdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminService{

    @Autowired
    UserAdminRepository repository;

    public List<UserAdmin> findAllUserAdmins(){
        return repository.findAllUserAdmins();    
    }

    public UserAdmin findUserAdminById(Integer userId){
        return repository.findUserAdminById(userId);
    }

    public void deleteUserAdmin(Integer useradminId){
        repository.deleteById(useradminId);
    }

    public UserAdmin createUserAdmin(UserAdmin userAdmin){
        return repository.save(userAdmin);
    }

    public UserAdmin updateUseradmin(UserAdmin userAdmin, Integer id){
        UserAdmin newUserAdmin = repository.findUserAdminById(id);
        newUserAdmin.setId(id);
        newUserAdmin.setEmail(userAdmin.getEmail());
        newUserAdmin.setName(userAdmin.getName());
        newUserAdmin.setPassword(userAdmin.getPassword());
        newUserAdmin.setLocationLat(userAdmin.getLocationLat());
        newUserAdmin.setLocationLong(userAdmin.getLocationLong());
        newUserAdmin.setRestaurants(userAdmin.getRestaurants());
        return repository.save(newUserAdmin);
    }

}