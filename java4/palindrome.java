
import java.util.Scanner;
class palindrome
{
    public static void main(String[]args)
    {
        int n,s=0,c,r;
        System.out.print("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.print("palindorme number");
        }
        else
        {
            System.out.print("it is not palindrome number");
        }
    }
}