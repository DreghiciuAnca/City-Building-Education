package com.DreghiciuAnca.Iteration3.dto;

import java.io.Serializable;

public class DeletePlaceDto  implements Serializable {
    String name;
    String address;

    public DeletePlaceDto(String name,String address)
    {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeletePlaceDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
