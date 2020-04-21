package com.PsIter1.Iteration1.Model;

import java.util.ArrayList;

public class Operations {

    private ArrayList<String> operations;

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
