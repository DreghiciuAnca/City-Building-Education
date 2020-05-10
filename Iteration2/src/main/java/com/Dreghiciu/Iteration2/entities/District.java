package com.Dreghiciu.Iteration2.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_city_id"))
    private City city;

    public District(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    private void setRating(Integer rating) {
        this.rating = rating;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }


}