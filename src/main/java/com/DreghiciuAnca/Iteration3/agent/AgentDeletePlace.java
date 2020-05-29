package com.DreghiciuAnca.Iteration3.agent;

import com.DreghiciuAnca.Iteration3.dto.DeletePlaceDto;
import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;
import com.DreghiciuAnca.Iteration3.intent.IntentCreatePlace;
import com.DreghiciuAnca.Iteration3.intent.IntentDeletePlace;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AgentDeletePlace {

    private Socket socket = null;
    private ServerSocket server = null;
    private ObjectInputStream inputStream = null;

    public AgentDeletePlace(int port, DeletePlaceDto deletePlaceDto)
    {
        try{
            server = new ServerSocket(port);
            System.out.println("Agent Create Place Started");

            System.out.println("Waiting for a intent... ");

            IntentDeletePlace intentDeletePlace = new IntentDeletePlace("127.0.0.1",4030,deletePlaceDto);

            socket = server.accept();
            System.out.println("Intent accepted");


            DataInputStream input = new DataInputStream(System.in);
            inputStream = new ObjectInputStream(socket.getInputStream());
            String line = "";
            DeletePlaceDto packet = null;

            while(packet == null) {

                //read Object
                try {

                    packet = (DeletePlaceDto) inputStream.readObject();
                    System.out.println(packet.toString());
                    line = input.readLine();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


            }
            System.out.println("Closing connection");
            socket.close();
            inputStream.close();
            input.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
