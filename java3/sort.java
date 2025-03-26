import java.lang*;
import java.util.Scanner;
public class sort 
{
  public static void main(String args[])
  {
    int a[]=new int[10],temp;
    Scanner r=new Scanner(System.in);
    System.out.print("Enter elements of array:");
    for(int i=0;i<10;i++)
    {
        a[i]=r.nextInt();
    }
    for(int i=0;i<10;i++)
    {
        for(int j=i+1;j<=10;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(int i=0;i<10;i++)
    {
        System.out.print(a[i]+" ");
    }
  }   
}
