import java.util.Scanner;
class Ip
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the ipv4 address with the CIDR notation:");
    String input=sc.nextLine();

    String[] parts=input.split("/");
    String ip=parts[0];
    int cidr=Integer.parseInt(parts[1]);

    String[]ipParts= ip.split("\\.");
    int ipAddress=0;
    for(int i=0;i<4;i++)
    {
        ipAddress|=(Integer.parseInt(ipParts[i])<<(24-(8*i)));
    }

    int mask=0xFFFFFFFF<<(32-cidr);
    int networkAddress=ipAddress&mask;
    int broadcastAddress=ipAddress |~mask;

    int numberofAddress=(networkAddress-broadcastAddress)+1;

    String firstAddress= convertToDottedDecimal(networkAddress);
    String lastAddress=convertToDottedDecimal(broadcastAddress);

    System.out.println("FirstAddress:"+firstAddress);
    System.out.println("LastAddress:"+lastAddress);
    System.out.println("NO of Address:"+numberofAddress);


  }   
  private static String convertToDottedDecimal(int address)
  {
    return ((address>>24)&0xff)+"."+ ((address>>16)&0xff)+"."+((address>>8)&0xff)+"."+(address&0xff);

  }
}
