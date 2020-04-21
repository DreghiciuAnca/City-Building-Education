package com.PsIter1.Iteration1.repository;

import com.PsIter1.Iteration1.Model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository  extends JpaRepository<Picture,Long> {


}
