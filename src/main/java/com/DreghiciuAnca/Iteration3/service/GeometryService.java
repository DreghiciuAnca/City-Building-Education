package com.DreghiciuAnca.Iteration3.service;


import com.DreghiciuAnca.Iteration3.entities.Geometry;

public interface GeometryService {
    void save(Geometry geometry);
    boolean getCenterX(int x);
    boolean getCenterY(int y);
}
