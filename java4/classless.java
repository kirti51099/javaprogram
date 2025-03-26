import java.util.*;
class classless
{
    public static void main (String []args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ip Address with the CIDR notation:");
        String input=sc.nextLine();

        //split the data 
        String[]parts=input.split("/");
        String ip=parts[0];
        int cidr=Integer.parseInt(parts[1]);
        //conver into binary
        String []ipParts=ip.split("\\.");
        int ipAddress=0;
        for(int i=0;i<4;i++)
        {
            ipAddress |= (Integer.parseInt(ipParts[i]) <<(24-(8*i)));
        }
       
        int mask= 0xffffffff <<(32-cidr);
        int networkAddress=ipAddress&mask;
        int broadcastAddress=networkAddress|~mask;
        int numberofAddress=(broadcastAddress-networkAddress)+1;

        String firstAddress=convertToDottedDecimal(networkAddress);
        String lastAddress=convertToDottedDecimal(broadcastAddress);

        System.out.print("FirstAddress:"+firstAddress);
        System.out.print("LastAddress"+lastAddress);
        System.out.print("NoOfAddress:"+numberofAddress);
    }
    private static String convertToDottedDecimal(int Address)
    {

        return ((Address>>24)&0xff)+"."+((Address>>16)&0xff)+"."+((Address>>8)&0xff)+"."+(Address&0xff);
    }


}