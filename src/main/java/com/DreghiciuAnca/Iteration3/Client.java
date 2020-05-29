package com.DreghiciuAnca.Iteration3;

import com.DreghiciuAnca.Iteration3.dto.DTO;
import com.DreghiciuAnca.Iteration3.gui.Gui;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private Socket socket = null;
    private DataInputStream input = null;
    private ObjectOutputStream output = null;

    private DataOutputStream out = null;

    private Gui clientGui = null;

    public Client(String address, int port)
    {
        Gui clientGui = new Gui();
        DTO sendDTO = new DTO("Name", "displayName", "Sebes");

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
