package com.Dreghiciu.Iteration2.dto;

import com.Dreghiciu.Iteration2.entities.District;
import com.Dreghiciu.Iteration2.entities.Place;

import java.util.ArrayList;

public class CityDTO {
    private String name;
    private Integer score;
    private Integer pollution;

    public CityDTO()
    {

    }

    public CityDTO(String name, Integer score, Integer pollution) {
        this.name = name;
        this.score = score;
        this.pollution = pollution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPollution() {
        return pollution;
    }

    private void setPollution(Integer pollution) {
        this.pollution = pollution;
    }

    public void computeScore(ArrayList<DistrictDTO> districtScore)
    {
        int sc = 0;
        for( int i =0; i < districtScore.size();i++)
            sc = sc + districtScore.get(i).getRating();
        this.score = sc;
    }

    public void computePollution(ArrayList<DistrictDTO> districtPollution)
    {
        int pol = 0;
        int tip = 0;
        for( int i = 0 ;i < districtPollution.size(); i++)
        {
            String type = districtPollution.get(i).getName();
            switch (type){
                case "Airport" : tip += 70;
                case "amusement_park" : tip += 50;
                case "aquarium" : tip += 35;
                case "art_gallery" : tip += 23;
                case "bar" : tip += 21;
                case "hospital" : tip += 10;
                case "factory" : tip += 100;
                case "shopping_mall" :tip += 66;
                default: tip += 30;
            }

            pol = (tip + districtPollution.get(i).getRating())/2 + pol;
        }
        this.setPollution(pol);
    }
}