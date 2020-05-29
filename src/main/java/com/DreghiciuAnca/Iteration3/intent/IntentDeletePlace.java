package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.dto.DeletePlaceDto;
import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class IntentDeletePlace {
    private Socket socket = null;
    private DataInputStream input = null;
    private ObjectOutputStream output = null;
    private DeletePlaceDto deletePlaceDto = null;

    public IntentDeletePlace(String address, int port, DeletePlaceDto deletePlaceDto)
    {
        //DeletePlaceDto deletePlaceDto = new DeletePlaceDto("STC","Sebes");
        this.deletePlaceDto = deletePlaceDto;
        try{
            socket = new Socket(address,port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            output = new ObjectOutputStream(socket.getOutputStream());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
            //send DTO

            try {
                output.writeObject(deletePlaceDto);
                System.out.println(deletePlaceDto.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }
        try{
            input.close();
            output.close();
            socket.close();
            //clientGui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
