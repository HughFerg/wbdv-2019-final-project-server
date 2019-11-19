package com.example.wbdv2019finalprojectserver.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "restaurants")
public class Restaurant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String yelpLink;
    @JsonIgnore
    @ManyToMany(mappedBy = "likedRestaurants")
    private List<User> userLikes;

    public List<User> getUserLikes() {
        return this.userLikes;
    }

    public void setUserLikes(List<User> userLikes) {
        this.userLikes = userLikes;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getYelpLink() {
        return this.yelpLink;
    }

    public void setYelpLink(String yelpLink) {
        this.yelpLink = yelpLink;
    }
}