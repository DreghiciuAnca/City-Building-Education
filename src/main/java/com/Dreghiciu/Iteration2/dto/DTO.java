package com.Dreghiciu.Iteration2.dto;

import java.io.Serializable;

public class DTO implements Serializable {
    String name;
    String displayName;
    String address;

    public DTO(String name, String displayName,String address)
    {
        this.name = name;
        this.displayName = displayName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
