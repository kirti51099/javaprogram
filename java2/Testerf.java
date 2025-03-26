class A {
	public int method1() {
		return 20;
	}
}

class B extends A {
	public int method1() {
		return 30;
	}

	public int method2() {
		return 40;
	}
}

class C extends B {
	public int method2() {
		return 20;
	}
}

public class Testerf {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println(a.method1() + c.method1() + c.method2());
	}
}
 