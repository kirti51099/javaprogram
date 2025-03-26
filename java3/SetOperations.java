import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input set 1
        System.out.println("Enter the elements of Set 1 separated by spaces:");
        Set<Integer> set1 = readSet(scanner);

        // Input set 2
        System.out.println("Enter the elements of Set 2 separated by spaces:");
        Set<Integer> set2 = readSet(scanner);

        // Perform operations
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // Output results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (Set 1 - Set 2): " + difference);

        scanner.close();
    }

    // Helper method to read set elements from user input
    private static Set<Integer> readSet(Scanner scanner) {
        Set<Integer> set = new HashSet<>();
        String[] values = scanner.nextLine().split("\\s+");
        for (String value : values) {
            set.add(Integer.parseInt(value));
        }
        return set;
    }
}