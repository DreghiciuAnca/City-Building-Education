package com.DreghiciuAnca.Iteration3.dto;


public class PlaceTypeDTO {

    private String name;
    private String display_name;
    private String icon;

    public PlaceTypeDTO()
    {

    }

    public PlaceTypeDTO(String name, String display_name) {
        this.name = name;
        this.display_name = display_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "PlaceTypeDTO{" +
                "name='" + name + '\'' +
                ", display_name='" + display_name + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}