package businessLayer;

import java.util.ArrayList;


public class City {
    private Integer cityId;
    private String name;
    private Integer score;
    private Integer pollution;

    public City()
    {

    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public void setPollution(Integer pollution) {
        this.pollution = pollution;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void computeScore(ArrayList<District> districtScore)
    {
        int sc = 0;
        for( int i =0; i < districtScore.size();i++)
            sc = sc + districtScore.get(i).getRating();
        this.score = sc;
    }

    public void computePollution(ArrayList<Place> districtPollution)
    {
        int pol = 0;
        int tip = 0;
        int geo = 0;
        for( int i = 0 ;i < districtPollution.size(); i++)
        {
            String type = districtPollution.get(i).getTip();
            String geometry = districtPollution.get(i).getGeometry();
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
            switch (geometry){
                case "rectangular": geo += 40;
                case "square" : geo += 50;
                case "on corner" : geo += 25;
                default: geo += 30;
            }
            pol = (tip + geo)/2 + pol;
        }
        this.setPollution(pol);
    }
}
