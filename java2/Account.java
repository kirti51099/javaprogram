class Person {
	String name;

	Person() {
		name = "John";
	}

	public void getDetails() {
		System.out.println(name);
	}
}

class Employee extends Person {
	int age;

	Employee() {
		age = 34;
	}

	public void getDetails() {
		System.out.println(name + " " + age);
	}
}

class Customer extends Employee {
	int salary;

	Customer(int salary) {
		this.salary = salary;
		name = "Maddy";
	}

	public void getDetails() {
		System.out.println(name + " " + age + " " + salary);
	}
}

public class Account {
	public static void main(String[] args) {
		Person c = new Customer(20000);
		c.getDetails();
	}
}