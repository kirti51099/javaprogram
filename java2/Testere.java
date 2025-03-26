

public class Testere {
	public static void main(String[] args) {
		Testere tester = new Testere();
		tester.evaluate(4.5, 2.5);
	}

	public void evaluate(int a, int b) {
		System.out.print("First evaluate method invoked");
		System.out.println(a + b);
	}

	public void evaluate(float a, float b) {
		System.out.print("Second evaluate method invoked");
		System.out.println(a + b);
	}
}