import java.io.*;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] buffer;

        int sequenceNumber = 0;

        while (true) {
            String message = "Message " + sequenceNumber;
            buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 9876);
            socket.send(packet);
            System.out.println("Sent: " + message);

            // Wait for ACK
            byte[] ackBuffer = new byte[256];
            DatagramPacket ackPacket = new DatagramPacket(ackBuffer, ackBuffer.length);
            socket.receive(ackPacket);

            String ackMessage = new String(ackPacket.getData(), 0, ackPacket.getLength());
            System.out.println("Received: " + ackMessage);

            if (ackMessage.equals("ACK " + sequenceNumber)) {
                sequenceNumber++;
            } else {
                System.out.println("ACK not received. Resending message...");
            }
        }
    }
}