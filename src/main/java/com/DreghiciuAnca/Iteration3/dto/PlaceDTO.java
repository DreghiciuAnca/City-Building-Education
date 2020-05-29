package com.DreghiciuAnca.Iteration3.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
    private String name;
    private String displayName;
    private String address;
    private String contact;
    private String proximity;
    private String capacity;
    private String availability;
    private GeometryDTO geometryDTO;
    private DistrictDTO districtDTO;
    private PlaceTypeDTO placeTypeDTO;


    public PlaceDTO()
    {

    }

    public PlaceDTO(String name,String displayName,String address, String contact, String proximity, String capacity, String availability) {
        this.name =name;
        this.displayName =displayName;
        this.address = address;
        this.contact = contact;
        this.proximity = proximity;
        this.capacity = capacity;
        this.availability = availability;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProximity() {
        return proximity;
    }

    public void setProximity(String proximity) {
        this.proximity = proximity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public GeometryDTO getGeometryDTO() {
        return geometryDTO;
    }

    public void setGeometryDTO(GeometryDTO geometryDTO) {
        this.geometryDTO = geometryDTO;
    }

    public DistrictDTO getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(DistrictDTO districtDTO) {
        this.districtDTO = districtDTO;
    }

    public PlaceTypeDTO getPlaceTypeDTO() {
        return placeTypeDTO;
    }

    public void setPlaceTypeDTO(PlaceTypeDTO placeTypeDTO) {
        this.placeTypeDTO = placeTypeDTO;
    }

    public void setName(String name){this.name =name;}
    public void setDisplayName(String displayName){this.displayName = displayName;}

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", proximity='" + proximity + '\'' +
                ", capacity='" + capacity + '\'' +
                ", availability='" + availability + '\'' +
                ", geometryDTO=" + geometryDTO +
                ", districtDTO=" + districtDTO +
                ", placeTypeDTO=" + placeTypeDTO +
                '}';
    }
}
