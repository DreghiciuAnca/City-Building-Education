package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Geometry;
import com.PsIter1.Iteration1.Model.Picture;
import com.PsIter1.Iteration1.repository.GeometryRepository;
import com.PsIter1.Iteration1.repository.PictureRepository;
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
