package com.PsIter1.Iteration1.repository;

import com.PsIter1.Iteration1.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface PlaceRepository extends JpaRepository<Place,Long> {
    ArrayList<Place> findAll();
    Optional<Place> findById(Long id);


}
