public class Employeea {
	private String name;
	private int empId;
	private String city;

	Employeea() {
		this.city = "New York";
	}

	Employeea(String name, int empId) {
		this();
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		Employeea employee1 = new Employeea("John", 101);
		Employeea employee2 = new Employeea();

		System.out.println(employee1.name + " " + employee1.empId + " "
				+ employee1.city);
		System.out.println(employee2.name + " " + employee2.empId + " "
				+ employee2.city);
	}
}
 