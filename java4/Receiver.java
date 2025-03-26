import java.io.*;
import java.net.*;

public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] buffer = new byte[256];
        int expectedSequenceNumber = 0;

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);

            // Extract the sequence number from the message
            int receivedSequenceNumber = Integer.parseInt(message.split(" ")[1]);

            if (receivedSequenceNumber == expectedSequenceNumber) {
                // Send ACK
                String ackMessage = "ACK " + receivedSequenceNumber;
                byte[] ackBuffer = ackMessage.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                DatagramPacket ackPacket = new DatagramPacket(ackBuffer, ackBuffer.length, address, port);
                socket.send(ackPacket);
                System.out.println("Sent: " + ackMessage);

                expectedSequenceNumber++;
            } else {
                System.out.println("Unexpected sequence number. Ignoring message...");
            }
        }
    }
}