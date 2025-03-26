import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.*;

class Servercomu
{
    public static void main(String [] args)
    {
        try
        {
            ServerSocket serverSocket=new ServerSocket(5000);
            System.out.print("server started.waiting for client");

            Socket socket= serverSocket.accept();
            System.out.println("connected client:");

            BufferedReader reader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));


            String clientMessage;
            String serverMessage;

            while(true)
            {
                if((clientMessage=reader.readLine())!=null)
                {
                    System.out.print("Client"+clientMessage);
                 }

                 serverMessage=consoleReader.readLine();
                 writer.write(serverMessage+"\n");
                 writer.flush();
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
