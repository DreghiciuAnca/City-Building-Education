package com.Dreghiciu.Iteration2;
import com.Dreghiciu.Iteration2.client.ClientGui;
import com.Dreghiciu.Iteration2.dto.DTO;

import javax.swing.*;
import java.net.*;
import java.io.*;

public class Client {

    private Socket socket = null;
    private DataInputStream input = null;
    private ObjectOutputStream output = null;

    private ClientGui clientGui = null;

    public Client(String address, int port)
    {
        ClientGui clientGui = new ClientGui();
        DTO sendDTO = new DTO("MAMA", "TATA", "Sebes");
        try{
            socket = new Socket(address,port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            output = new ObjectOutputStream(socket.getOutputStream());

        }catch(UnknownHostException e)
        {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = "";

        while(!line.equals("Over")) {
            //send DTO

            try {
                output.writeObject(sendDTO);
                System.out.println(sendDTO.toString());
                line = input.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       try{
           input.close();
           output.close();
           socket.close();
           clientGui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args){

        Client client = new Client("127.0.0.1", 5000);
    }
}
