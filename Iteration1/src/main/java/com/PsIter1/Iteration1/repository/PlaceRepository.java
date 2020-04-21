package com.PsIter1.Iteration1.repository;

import com.PsIter1.Iteration1.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
    ArrayList<Place> findAll();
    Optional<Place> findById(Long id);



}
