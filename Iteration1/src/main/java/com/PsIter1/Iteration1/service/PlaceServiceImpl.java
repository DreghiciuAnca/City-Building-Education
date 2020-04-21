package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Place;
import com.PsIter1.Iteration1.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceRepository placeRepository;


    @Override
    public ArrayList<Place> getAllPlaces() {
        ArrayList<Place> placeList = new ArrayList<Place>();
        placeRepository.findAll()
                .forEach(placeList::add);
        return placeList;

    }

    @Override
    public Optional<Place> getPlace(Long id) {

        return placeRepository.findById(id);
    }

    @Override
    public void addPlace(Place place) {
        placeRepository.save(place);
    }

    @Override
    public void updatePlace(Place place) {
        placeRepository.save(place);
    }

    @Override
    public void deletePlace(Place place) {
        placeRepository.delete(place);
    }
}
