package com.DreghiciuAnca.Iteration3.dto;

import com.DreghiciuAnca.Iteration3.entities.Place;

import java.util.ArrayList;

public class DistrictDTO {
    private String name;
    private Integer rating;
    private CityDTO cityDTO;

    public DistrictDTO()
    {
    }

    public DistrictDTO(String name, Integer rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public CityDTO getCityDTO() {
        return cityDTO;
    }

    public void setCityDTO(CityDTO cityDTO) {
        this.cityDTO = cityDTO;
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

    @Override
    public String toString() {
        return "DistrictDTO{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", cityDTO=" + cityDTO +
                '}';
    }
}