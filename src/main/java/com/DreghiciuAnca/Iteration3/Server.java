package com.DreghiciuAnca.Iteration3;

import com.DreghiciuAnca.Iteration3.dto.DTO;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private ObjectInputStream inputStream = null;
    //private ObjectOutputStream outputStream = null;
    public Server()
    {

    }
    public Server(int port) {


        try {
            server = new ServerSocket(5000);
            System.out.println("Server Started");

            System.out.println("Waiting for a client... ");

            socket = server.accept();
            System.out.println("Client accepted");


            DataInputStream input = new DataInputStream(System.in);
            inputStream = new ObjectInputStream(socket.getInputStream());


            String line = "";
            boolean ok = true;

            while(!line.equals("Over")) {

                //read Object
                try {

                    ok = false;

                    DTO packet = (DTO) inputStream.readObject();
                    System.out.println(packet.toString());
                    line = input.readLine();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                try{
                    String linie = input.readUTF();
                }
                catch (IOException e)
                {
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
    public static void main(String[] args)
    {
        //SpringApplication.run(Server.class, args);
        Server server = new Server(5000);

    }


}
