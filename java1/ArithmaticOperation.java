
import java.util.Scanner;
import java.util.*;
  public class ArithmaticOperation
{
    public static void main(String [] args)
    {
        Scanner user=new Scanner (System.in);
        int num1, num2;
        System.out.print("ENter two numbers:");
        num1=user.nextInt();
        num2=user.nextInt();
        
        System.out.print("\n Sum : " +(num1+num2));
        System.out.print("\n Difference : " +(num1+num2));
        System.out.print("\n Product : " +(num1+num2));
        System.out.print("\n Quotient : " +(num1+num2));
        
    }
}
