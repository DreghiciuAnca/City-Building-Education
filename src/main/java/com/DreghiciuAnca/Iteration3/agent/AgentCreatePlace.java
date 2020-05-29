package com.DreghiciuAnca.Iteration3.agent;


import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;
import com.DreghiciuAnca.Iteration3.intent.IntentCreatePlace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AgentCreatePlace {
    private String noun;
    private String verb;


    private Socket socket = null;
    private ServerSocket server = null;
    private ObjectInputStream inputStream = null;

    public AgentCreatePlace(int port)
    {
        try {
                server = new ServerSocket(port);
                System.out.println("Agent Create Place Started");

                System.out.println("Waiting for a intent... ");

                IntentCreatePlace intentCreatePlace = new IntentCreatePlace("127.0.0.1",4030);

                socket = server.accept();
                System.out.println("Intent accepted");
                DataInputStream input = new DataInputStream(System.in);
                inputStream = new ObjectInputStream(socket.getInputStream());
            //outputStream = new ObjectOutputStream(socket.getOutputStream());
            PlaceDTO packet =null;

            String line = "";


            while(packet == null) {

                //read Object
                try {

                    packet = (PlaceDTO) inputStream.readObject();
                    System.out.println(packet.toString());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


            }
            System.out.println("Closing connection");
            socket.close();
            inputStream.close();
            input.close();
            //outputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setNoun(String noun){this.noun = noun;}
    public String getNoun(){return this.noun;}
    public void setVerb(String verb){this.verb = verb;}
    public String getVerb(){return this.verb;}




}
