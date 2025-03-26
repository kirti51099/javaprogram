public class testers {
	public static void main(String[] args) {
		System.out.println(sum(5));
	}

	public static int sum(int num) {
		if (num == 1)
			return 1; // Line1
		else
			return (num * sum(num - 1)); // Line2
	}
}