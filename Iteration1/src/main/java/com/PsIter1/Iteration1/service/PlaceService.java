package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Place;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface PlaceService {
    public ArrayList<Place> getAllPlaces();
    public Optional<Place> getPlace(Long id);
    public void addPlace(Place place);
    public void updatePlace(Place place);
    public void deletePlace(Place place);
}
