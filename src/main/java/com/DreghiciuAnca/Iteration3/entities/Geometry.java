package com.DreghiciuAnca.Iteration3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geometry")
public class Geometry {
    @Id
    @GeneratedValue
    private Long id;

    private Integer width;

    private Integer height;

    private Integer centerX;

    private Integer centerY;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getCenterX() {
        return centerX;
    }

    public void setCenterX(Integer centerX) {
        this.centerX = centerX;
    }

    public Integer getCenterY() {
        return centerY;
    }

    public void setCenterY(Integer centerY) {
        this.centerY = centerY;
    }
}