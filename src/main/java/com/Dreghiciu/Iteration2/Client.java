package com.Dreghiciu.Iteration2;
import java.net.*;
import java.io.*;

public class Client {

    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    private DataInputStream in = null;

    public Client(String address, int port)
    {
        try{
            socket = new Socket(address,port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            output = new DataOutputStream(socket.getOutputStream());
        }catch(UnknownHostException e)
        {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = "";
        String line2 = "";

        while(!line.equals("Over") || !line2.equals("Over"))
        {
            try{
                line= input.readLine();
                //System.out.println(line);
                output.writeUTF(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                line2 = in.readUTF();
                System.out.println(line2);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
       try{
           in.close();
           input.close();
           output.close();
           socket.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args){
        Client client = new Client("127.0.0.1", 5000);
    }
}
