package com.Dreghiciu.Iteration2.service;

import com.Dreghiciu.Iteration2.entities.Geometry;
import com.Dreghiciu.Iteration2.repository.GeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeometryServiceImpl  implements  GeometryService{


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
