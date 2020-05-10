package com.Dreghiciu.Iteration2.repository;

import com.Dreghiciu.Iteration2.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository  extends JpaRepository<Picture,Long> {


}
