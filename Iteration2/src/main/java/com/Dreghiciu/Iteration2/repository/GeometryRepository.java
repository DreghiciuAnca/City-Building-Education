package com.Dreghiciu.Iteration2.repository;


import com.Dreghiciu.Iteration2.entities.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeometryRepository extends JpaRepository<Geometry,Long> {

}