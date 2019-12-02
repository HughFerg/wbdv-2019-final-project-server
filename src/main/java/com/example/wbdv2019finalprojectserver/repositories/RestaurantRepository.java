package com.example.wbdv2019finalprojectserver.repositories;

import java.util.List;

import com.example.wbdv2019finalprojectserver.models.Restaurant;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{

    @Query("select restaurant from Restaurant restaurant")
    public List<Restaurant> findAllRestaurants();
}