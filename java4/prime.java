import java.util.Scanner;

class prime  
{
    public static void main(String [] args)
    {
        int n,count=0;

        System.out.print("Enter the number:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.ptint("enter number is prime number ");
        }
        else{
            System.out.print("not a prime number:");
        }
    }
}