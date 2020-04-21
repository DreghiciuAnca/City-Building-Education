package com.PsIter1.Iteration1.service;

import com.PsIter1.Iteration1.Model.Picture;
import com.PsIter1.Iteration1.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl  implements PictureService{

    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }
}
