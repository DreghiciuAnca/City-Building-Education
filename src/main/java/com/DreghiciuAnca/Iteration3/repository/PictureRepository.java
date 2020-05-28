package com.DreghiciuAnca.Iteration3.repository;

import com.DreghiciuAnca.Iteration3.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository  extends JpaRepository<Picture,Long> {


}
