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
    public int SetDim()
    {
       int  result=length*breadth;
        return result;
    }
}
class rectangle
{
    public static void main(String [] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of length:");
        a=obj.nextInt();
        obj.nextLine();
        System.out.print("Enter the value of breadth:");
        b=obj.nextInt();
        obj.nextLine();
        Area ob1= new Area(a,b);
        System.out.print("Area="+ob1.SetDim());
    }
}