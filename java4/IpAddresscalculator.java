import java.util.Scanner;

public class IpAddresscalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IPv4 address with CIDR notation (e.g., 192.168.1.10/24): ");
        String input = scanner.nextLine();
        
        // Split the input into IP address and CIDR notation
        String[] parts = input.split("/");
        String ip = parts[0];
        int cidr = Integer.parseInt(parts[1]);
        
        // Convert IP address to binary
        String[] ipParts = ip.split("\\.");
        int ipAddress = 0;
        for (int i = 0; i < 4; i++) {
            ipAddress |= (Integer.parseInt(ipParts[i]) << (24 - (8 * i)));
        }
        
        // Calculate the subnet mask
        int mask = 0xFFFFFFFF << (32 - cidr);
        
        // Calculate the network address
        int networkAddress = ipAddress & mask;
        
        // Calculate the broadcast address
        int broadcastAddress = networkAddress | ~mask;
        
        // Calculate the number of addresses
        int numberOfAddresses = (broadcastAddress - networkAddress) + 1;
        
        // Convert the network address and broadcast address back to dotted decimal format
        String firstAddress = convertToDottedDecimal(networkAddress);
        String lastAddress = convertToDottedDecimal(broadcastAddress);
        
        // Output the results
        System.out.println("First address: " + firstAddress);
        System.out.println("Last address: " + lastAddress);
        System.out.println("Number of addresses: " + numberOfAddresses);
    }
    
    private static String convertToDottedDecimal(int address) {
        return ((address >> 24) & 0xFF) + "." +
               ((address >> 16) & 0xFF) + "." +
               ((address >> 8) & 0xFF) + "." +
               (address & 0xFF);
    }
}