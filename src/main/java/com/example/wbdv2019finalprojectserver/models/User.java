package com.example.wbdv2019finalprojectserver.models;

import java.util.List;
import com.example.wbdv2019finalprojectserver.models.Restaurant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Double locationLong;
    private Double LocationLat;
    @ManyToMany
    @JoinTable(
        name = "restaurant_like", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private List<Restaurant> likedRestaurants;

    public List<Restaurant> getLikedRestaurants() {
        return this.likedRestaurants;
    }

    public void setLikedRestaurants(List<Restaurant> likedRestaurants) {
        this.likedRestaurants = likedRestaurants;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getLocationLong() {
        return this.locationLong;
    }

    public void setLocationLong(Double locationLong) {
        this.locationLong = locationLong;
    }

    public Double getLocationLat() {
        return this.LocationLat;
    }

    public void setLocationLat(Double LocationLat) {
        this.LocationLat = LocationLat;
    }
    
}