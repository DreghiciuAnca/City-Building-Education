package businessLayer;

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
}
