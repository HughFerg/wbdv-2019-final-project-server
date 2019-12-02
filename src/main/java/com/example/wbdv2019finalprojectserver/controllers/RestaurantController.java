package com.example.wbdv2019finalprojectserver.controllers;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.Restaurant;
import com.example.wbdv2019finalprojectserver.services.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*",allowCredentials="true",allowedHeaders="*")
@RestController
class RestaurantController{

    @Autowired
    RestaurantService rs;

    @GetMapping("/api/restaurants")
    public List<Restaurant> getRestaurants(){
        return rs.findAllRestaurants();       
    }

}