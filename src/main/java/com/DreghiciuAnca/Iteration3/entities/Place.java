package com.DreghiciuAnca.Iteration3.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue
    private Long id;

    private String proximity;

    private String address;

    private Integer capacity;

    private Integer availability;

    private String contact;

    @ManyToOne
    @JoinColumn(name = "district_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_district_id"))
    private District district;



    @OneToOne
    @JoinColumn(name = "geometry_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_geometry_id"))
    private Geometry geometry;

    @OneToMany
    @JoinColumn(name = "picture_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_picture_id"))
    private Set<Picture> picture;

    @OneToOne
    @JoinColumn(name = "place_type_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_place_type_id"))
    private PlaceType placeType;

    public Place(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProximity() {
        return proximity;
    }

    public void setProximity(String proximity) {
        this.proximity = proximity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Set<Picture> getPicture() {
        return picture;
    }

    public void setPicture(Set<Picture> picture) {
        this.picture = picture;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }
}