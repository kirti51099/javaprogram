import java.io.*;
import java.net.*;

class Clientcomu
{
    public static void main(String args[])
    {
        try
        {
            Socket socket=new Socket("locat host",5000);
            System.out.print("the client is connected");

            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));

            String serverMessage;
            String clientMessage;

            while(true)
            {
                 clientMessage=consoleReader.readLine();
                 writer.write(clientMessage+"\n");
                 writer.flush();

                 if((serverMessage=reader.readLine())!=null)
                {
                    System.out.print("serverMessage"+serverMessage);
                 }

        
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}