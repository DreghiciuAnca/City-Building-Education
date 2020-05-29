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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
