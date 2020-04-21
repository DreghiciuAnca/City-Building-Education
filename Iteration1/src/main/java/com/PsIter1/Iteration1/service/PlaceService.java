package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Place;

import java.util.ArrayList;
import java.util.Optional;

public interface PlaceService {
    public ArrayList<Place> getAllPlaces();
    public Optional<Place> getPlace(Long id);
    public void addPlace(Place place);
    public void updatePlace(Place place);
    public void deletePlace(Place place);
}
