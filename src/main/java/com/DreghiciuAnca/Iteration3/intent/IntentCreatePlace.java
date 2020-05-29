package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class IntentCreatePlace {
    private Socket socket = null;
    private DataInputStream input = null;
    private ObjectOutputStream output = null;

    public IntentCreatePlace(String address, int port)
    {
        PlaceDTO placeDto = new PlaceDTO("Sebes","072938123","proximity","capacity","available");
        try{
            socket = new Socket(address,port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            output = new ObjectOutputStream(socket.getOutputStream());

            //output = new DataOutputStream(socket.getOutputStream());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String line = "";

            //send DTO

            try {
                output.writeObject(placeDto);
            } catch (IOException e) {
                e.printStackTrace();
            }

        try{
            input.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
