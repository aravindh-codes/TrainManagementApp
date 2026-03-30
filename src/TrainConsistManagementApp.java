import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC8
 * ==========================================================
 *
 * UC8: Filter Passenger Bogies Using Streams
 *
 * Goal:
 * Filter passenger bogies using Stream API based on capacity.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User creates bogie list
 * 2. Convert list to stream
 * 3. Apply filter condition
 * 4. Collect filtered results
 * 5. Display filtered bogies
 *
 * Key Concepts:
 * - Stream API
 * - filter()
 * - Lambda expressions
 * - collect()
 * - Declarative programming
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementApp {

    /**
     * Bogie Class (Reused from UC7)
     */
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        void display() {
            System.out.println("Bogie: " + name + " | Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        // Header
        System.out.println("========================================");
        System.out.println("UC8 - Filter Passenger Bogies (Streams)");
        System.out.println("========================================\n");

        // Step 1: Create list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Apply Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):\n");

        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 4: Show original list remains unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }

        // Completion message
        System.out.println("\nUC8 stream filtering completed successfully...");
    }
}