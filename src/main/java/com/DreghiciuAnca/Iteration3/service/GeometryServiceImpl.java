package com.DreghiciuAnca.Iteration3.service;

import com.DreghiciuAnca.Iteration3.entities.Geometry;
import com.DreghiciuAnca.Iteration3.repository.GeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GeometryServiceImpl implements GeometryService{
    @Autowired
    private GeometryRepository geometryRepository;

    @Override
    public void save(Geometry geometry) {
        geometryRepository.save(geometry);
    }


    @Override
    public boolean getCenterX(int x) {
        return false;
    }

    @Override
    public boolean getCenterY(int y) {
        return false;
    }
}
