class Bike {
	int speedlimit = 90;
}

class Honda extends Bike {
	int speedlimit = 150;
}

public class Testeru {
	public static void main(String args[]) {
		Bike bike = new Bike();
		Honda honda = new Honda();
		Bike hondaBike = new Honda();

		System.out.print(bike.speedlimit + " ");
		System.out.print(honda.speedlimit + " ");
		System.out.print(hondaBike.speedlimit); // Line15
	}
}