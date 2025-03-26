import java.util.Scanner;
public class bankaccount
{
    private String accountnumber;
    private double balance;
    public Main(String accountnumber,double balance)
    {
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
        }
        else{
            System.out.print("insufficient balance");
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
public class Savingsaccount extends bankaccount
{
    public Savingsaccount(String accountnumber,double balance)
    {
        super(accountnumber, balance);
    }
    public void withdraw(double amount)
    {
        if(getBalance()-amount<100)
        {
            System.out.print("mininum balance of 100 required");
        }
        else
        {
            super.withdraw(amount);
        }
    }
}
public class Demo
{
public static void main(String[]args)
{
    System.out.print("Creat a bank account object ")
}
}