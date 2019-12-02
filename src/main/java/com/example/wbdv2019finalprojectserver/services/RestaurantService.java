package com.example.wbdv2019finalprojectserver.services;

import java.util.List;
import com.example.wbdv2019finalprojectserver.models.Restaurant;
import com.example.wbdv2019finalprojectserver.repositories.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService{

    @Autowired
    RestaurantRepository repository;

    public List<Restaurant> findAllRestaurants(){
        return repository.findAllRestaurants();     
    }

}