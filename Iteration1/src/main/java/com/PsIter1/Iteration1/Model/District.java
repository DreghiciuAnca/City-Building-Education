package com.PsIter1.Iteration1.Model;

import javax.persistence.*;

@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue
    private Long id;

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

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
