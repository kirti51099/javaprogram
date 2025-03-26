import java.util.*;
import java.util.Scanner;
 class Area 
{
    int length, breadth;
    Area(int l, int b)
    {
        length=l;
        breadth=b;
    }
    public int setDim()
    {
        int results=length*breadth;
        return results;

    }   
}
 class rectangle 
{

    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the length of rectangle");
        a=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of rectangle");
        b=obj.nextInt();
        Area ob1=new Area(a,b);
        System.out.println("Area="+ob1.setDim());
    }
}
