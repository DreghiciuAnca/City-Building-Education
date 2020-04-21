package com.PsIter1.Iteration1.Controller;

import com.PsIter1.Iteration1.Model.*;
import com.PsIter1.Iteration1.service.GeometryService;
import com.PsIter1.Iteration1.service.PictureService;
import com.PsIter1.Iteration1.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Level;
import java.util.logging.Logger;

@org.springframework.stereotype.Controller
public class Controller {

    private int x,y;
    public Operations oper = new Operations();

    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

    @Autowired
    private PictureService pictureService;
    @Autowired
    private PlaceService placeService;

    @Autowired
    private GeometryService geometryService;



    public void insert(Geometry geometry)
    {
        if(geometryService.getCenterX(geometry.getCenterX()) && geometryService.getCenterY(geometry.getCenterY()))
            LOGGER.log(Level.INFO,"This place is occupied");
        else{
            geometryService.save(geometry);
            oper.addOperation("Geometry with coordinates" +geometry.getCenterX() +" and " + geometry.getCenterY() + " is saved");
        }

    }

}
