import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running...");
            
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress().getHostName());
                
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    String[] numbers = inputLine.split(",");
                    if (numbers.length == 2) {
                        try {
                            int num1 = Integer.parseInt(numbers[0]);
                            int num2 = Integer.parseInt(numbers[1]);
                            int sum = num1 + num2;
                            out.println(sum);
                        } catch (NumberFormatException e) {
                            out.println("Invalid input. Please send two numbers separated by a comma.");
                        }
                    } else {
                        out.println("Invalid input. Please send two numbers separated by a comma.");
                    }
                }
                
                in.close();
                out.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
