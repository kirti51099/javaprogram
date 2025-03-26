public class Bank {

	private void getBankName() {
		System.out.println("Bank");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.getBankName();
	}
}

class ABCBank extends Bank {
	public void getBankName() {
		System.out.println("ABCBank");
	}
}
 