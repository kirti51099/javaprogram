class A {
	private int var1 = 10;
	private int var2;

	A(int var2) {
		this.var2 = var2;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}
}

class B extends A {
	private int var3;

	B(int var2, int var3) {
		super(var2);
		this.var3 = 40; // line 33
	}

	public int add() {
		int sum;
		sum = getVar1() + getVar2() + var3;
		System.out.println("Result: " + sum);
		return sum;
	}
}

public class TesterD{
	public static void main(String[] args) {
		B obj = new B(20, 30);
		obj.add();
	}
}
 