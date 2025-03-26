import java.util.Scanner;

class Multiplication
{
    public static void main(String args[])
    {
        int a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int c[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the elements of 1st matrix:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the elements of 2nc matrix:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.print("elements of 1st matrix:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("elements of 2nd matrix:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("the multiplication of two matrix:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    System.out.print(c[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
    }
}