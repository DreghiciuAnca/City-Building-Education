package com.PsIter1.Iteration1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geometry")
public class Geometry {
    @Id
    @GeneratedValue
    private Long id;

    private Integer width;

    private Integer height;

    private Integer centerX;

    private Integer centerY;


}