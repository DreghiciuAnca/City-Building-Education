package com.Dreghiciu.Iteration2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.*;


@SpringBootApplication
public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream output = null;
    private DataInputStream input = null;


    public Server(int port)
    {
        try{
            server = new ServerSocket(port);
            System.out.println("Server Started");

            System.out.println("Waiting for a client... ");

            socket = server.accept();
            System.out.println("Client accepted");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());
            String line = "";
            String line2 = "";

            while (!line.equals("Over") || !line2.equals("Over"))
            {
                try {
                    line = in.readUTF();
                    System.out.println(line);

                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                try{
                    line2 = input.readLine();
                    //System.out.println(line2);
                    output.writeUTF(line2);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("Closing connection");
            input.close();
            socket.close();
            in.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args)
    {
        Server server = new Server(5000);
        SpringApplication.run(Iteration2Application.class, args);
    }

}
