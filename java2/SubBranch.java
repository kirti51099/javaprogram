interface BankOperations {
	void withdraw();

	void deposit();
}

abstract class Branch implements BankOperations {
	public void withdraw() {
		System.out.println("Amount withdrawn");
	}
}

public class SubBranch extends Branch {
	public void deposit() {
		System.out.println("Amount deposited");
	}

	public static void main(String args[]) {
		BankOperations subBranch = new SubBranch();
		subBranch.deposit();
	}
}