package com.Dreghiciu.Iteration2.entities;

import java.util.ArrayList;

public class Operations {

    private ArrayList<String> operations;

    public Operations()
    {

    }

    public void addOperation(String operation)
    {
        operations.add(operation);
    }

    public void printOperations()
    {
        for(String x: operations)
            System.out.println(x);
    }

}