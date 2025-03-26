import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the any number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.print("the number is even");
        }
        else
        {
            System.out.print("the number is odd");
        }
    }
}