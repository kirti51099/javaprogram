import java.util.Scanner;
import java.util.*;
class alphabetical
{
    public static void main(String args[])
    {
        String names[]=new String[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the names:");
        for(i=0;i<5;i++)
        {
            names[i]=sc.nextLine();
        }
        Arrays.sort(names);
        System.out.print("the orderly names are:");
        for(String n:names)
        {
            System.out.println(n);
        }

    }
}