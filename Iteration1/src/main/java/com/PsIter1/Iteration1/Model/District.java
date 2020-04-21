package com.PsIter1.Iteration1.Model;

import javax.persistence.*;
import java.util.ArrayList;

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
    public void ComputeRatingDistrict(ArrayList<Place> places)
    {
        int rating = 0;
        for(int i =0 ; i<places.size(); i++)
        {
            String proximity = places.get(i).getProximity();
            switch (proximity){
                case "park": rating += 75;
                case "hospital" : rating += 100;
                case "night_club" : rating += 20;
                case "theater" : rating += 80;
                case "library" : rating += 30;
                default: rating += 40;
            }
        }
        this.setRating(rating);
    }

}
