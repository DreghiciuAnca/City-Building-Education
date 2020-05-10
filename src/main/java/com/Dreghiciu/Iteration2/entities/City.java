package com.Dreghiciu.Iteration2.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue
    private Long id;

    private Integer pollution;

    private Integer score;

    private String name;

    public City(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPollution() {
        return pollution;
    }

    public void setPollution(Integer pollution) {
        this.pollution = pollution;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
