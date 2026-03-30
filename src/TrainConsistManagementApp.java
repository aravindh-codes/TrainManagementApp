import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC10
 * ==========================================================
 *
 * UC10: Count Total Seats in Train (reduce)
 *
 * Goal:
 * Aggregate seating capacities into a single total value
 * using Stream reduction.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User creates bogie list
 * 2. Convert list into stream
 * 3. map() extracts capacity
 * 4. reduce() sums capacities
 * 5. Display total seating capacity
 *
 * Key Concepts:
 * - map()
 * - reduce()
 * - Method reference (Integer::sum)
 * - Functional aggregation
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementApp {

    /**
     * Bogie Class (Reusable Model)
     */
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + "(" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Header
        System.out.println("========================================");
        System.out.println("UC10 - Total Seating Capacity (reduce)");
        System.out.println("========================================\n");

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)              // extract capacity
                .reduce(0, Integer::sum);          // sum all values

        // Step 3: Display result
        System.out.println("Bogie List:");
        System.out.println(bogies + "\n");

        System.out.println("Total Seating Capacity: " + totalCapacity);

        // Completion message
        System.out.println("\nUC10 aggregation completed successfully...");
    }
}