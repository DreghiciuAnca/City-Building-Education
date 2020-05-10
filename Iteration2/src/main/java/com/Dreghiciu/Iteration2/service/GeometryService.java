package com.Dreghiciu.Iteration2.service;


import com.Dreghiciu.Iteration2.entities.Geometry;

public interface GeometryService {
    void save(Geometry geometry);
    boolean getCenterX(int x);
    boolean getCenterY(int y);
}
