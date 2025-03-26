import java.util.*;

class ipv4
{
    public static void main(String []args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ipv4 Address:");
        String ipAddress=sc.nextLine();
        String ipClass=getIpClass(ipAddress);

        if(ipClass.equals("D")||ipClass.equals("E")||ipClass.equals("Unknow"))
        {
            System.out.print("IPAddress:"+ipAddress+"of a Class:"+ipClass+"the ip address is not Standard:");
            return ;
        }

        String networkId=calculateNetworkId(ipAddress);
        String lastAddress=calculateLastAddress(ipAddress);

        System.out.println("IpAddress:"+ipAddress);
        System.out.println("Class:"+ipClass);
        System.out.println("NetworkId:"+networkId);
        System.out.println("LastAddress:"+lastAddress);
    }

    public static String getIpClass(String ip)
    {
         int firstOctet=Integer.parseInt(ip.split("\\.")[0]);
         if(1<=firstOctet&&firstOctet<=126)
         {
            return "A";
         }
         else if(127<=firstOctet&&firstOctet<=191)
         {
            return "B";
         }
         else if(192<=firstOctet&&firstOctet<=223)
         {
            return "C";
         }
         else if(224<=firstOctet&&firstOctet<=239)
         {
            return "D";
         }
         else if(240<=firstOctet&&firstOctet<=255)
         {
            return "E";
         }
         else
         {
            return "UNknown";
         }
     }

     public static String calculateNetworkId(String ip)
     {
        String[] ipOctets=ip.split("\\.");
        String[] networkIdOctets=new String[4];

        for(int i=0;i<4;i++)
        {
            int ipPart=Integer.parseInt(ipOctets[i]);
            networkIdOctets[i]=String .valueOf(ipPart);
        }
        return String.join(".",networkIdOctets);
     }
     public static String calculateLastAddress(String ip)
     {

        String[] ipOctet= ip.split("\\.");
        String [] lastAddressOctet=new String[4];
        for(int i=0;i<4;i++)
        {
            int ipPart=Integer.parseInt(ipOctet[i]);
            lastAddressOctet[i]=String.valueOf(ipPart);
        }
        return String.join(".",lastAddressOctet);
     }
}