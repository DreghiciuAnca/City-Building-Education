package com.DreghiciuAnca.Iteration3.repository;

import com.DreghiciuAnca.Iteration3.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
    ArrayList<Place> findAll();
    Optional<Place> findById(Long id);



}
