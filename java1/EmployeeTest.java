import java.util.*;
class Employee 
{
    private String firstname;
    private String lastname;
    private double monthlysalary;
    public Employee()
    {
        this.firstname=" ";
        this.lastname=" ";
        this.monthlysalary=0;
    }
    public Employee(String firstname, String lastname, double monthlysalary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.monthlysalary=monthlysalary;
    }
    public void setFirstName(String firstName)
{
this.firstname=firstName;
}
public String getFirstName()
{
return firstname;
}
public void setLastName(String lastName)
{
this.lastname=lastName;
}
public String getLastname()
{
return lastname;
}
public void setMonthlySalary(double monthlySalary)
{
if(monthlySalary>0)
this.monthlysalary=monthlySalary;
else
this.monthlysalary=0;
}
public double getMonthlySalary()
{
return monthlysalary;
}
}
//EmployeeTest.java
class EmployeeTest
{
public static void main(String[] args)
{
Employee emp1=new Employee();
emp1.setFirstName("Carol");
emp1.setLastName("Potter");
emp1.setMonthlySalary(1000);
System.out.println("Details of employee1 : ");
System.out.println("First Name :"+emp1.getFirstName());
System.out.println("Last Name :"+emp1.getLastname());
System.out.println("Monthly Salary :"+emp1.getMonthlySalary());
double yearlysalary=emp1.getMonthlySalary()*12;
System.out.println("Yearly Salary:"+yearlysalary);
double salaryraise=yearlysalary*0.10;
System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));
Employee emp2=new Employee();
emp2.setFirstName("Johnson");
emp2.setLastName("Petter");
emp2.setMonthlySalary(5000);
System.out.println("Details of employee2 : ");
System.out.println("First Name :"+emp2.getFirstName());
System.out.println("Last Name :"+emp2.getLastname());
System.out.println("Monthly Salary :"+emp2.getMonthlySalary());
yearlysalary=emp2.getMonthlySalary()*12;
System.out.println("Yearly Salary:"+yearlysalary);
salaryraise=yearlysalary*0.10;
System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));
}
}

