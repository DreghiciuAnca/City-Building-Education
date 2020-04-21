package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Geometry;

public interface GeometryService {
    void save(Geometry geometry);
    boolean getCenterX(int x);
    boolean getCenterY(int y);
}
