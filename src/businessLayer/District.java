package businessLayer;

import java.util.ArrayList;

public class District {
    private Integer districtId;
    private Integer rating;
    private Integer city_id;

    public District()
    {

    }
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
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
