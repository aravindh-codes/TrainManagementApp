import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC9
 * ==========================================================
 *
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Goal:
 * Group bogies into categories using Stream collectors.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User creates bogie list
 * 2. Convert list into stream
 * 3. Apply groupingBy()
 * 4. Store result in Map
 * 5. Display grouped bogies
 *
 * Key Concepts:
 * - Stream API
 * - groupingBy()
 * - Lambda classification
 * - Map<String, List<Bogie>>
 * - Data aggregation
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
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("========================================\n");

        // Step 1: Create bogie list (with duplicates for grouping)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Apply groupingBy (group by bogie name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            System.out.println("Bogies: " + entry.getValue());
            System.out.println();
        }

        // Step 4: Show original list unchanged
        System.out.println("Original Bogie List (Unchanged):");
        System.out.println(bogies);

        // Completion message
        System.out.println("\nUC9 grouping completed successfully...");
    }
}