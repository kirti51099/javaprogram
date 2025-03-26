import java.util.Scanner;
public class fact 
{
    public static void main(String[] args)
    {
        int a,fact=1;
        System.out.print("Enter any number:");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.print("factorial"+fact);
    }
}
