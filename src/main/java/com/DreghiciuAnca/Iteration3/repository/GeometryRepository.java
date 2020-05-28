package com.DreghiciuAnca.Iteration3.repository;

import com.DreghiciuAnca.Iteration3.entities.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeometryRepository extends JpaRepository<Geometry,Long> {

}