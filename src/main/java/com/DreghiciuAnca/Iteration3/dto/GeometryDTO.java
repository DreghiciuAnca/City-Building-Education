package com.DreghiciuAnca.Iteration3.dto;

public class GeometryDTO {
    private Integer width;
    private Integer height;
    private Integer centerX;
    private Integer centerY;

    public GeometryDTO()
    {

    }

    public GeometryDTO(Integer width, Integer height, Integer centerX, Integer centerY) {
        this.width = width;
        this.height = height;
        this.centerX = centerX;
        this.centerY = centerY;
    }

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