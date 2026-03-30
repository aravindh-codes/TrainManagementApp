import java.util.HashMap;
import java.util.Map;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC6
 * ==========================================================
 *
 * UC6: Map Bogie to Capacity (HashMap)
 *
 * Goal:
 * Associate each bogie with its seating or load capacity
 * using a key–value mapping structure.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User creates bogie-capacity mapping
 * 2. System stores bogies as keys and capacities as values
 * 3. Entries inserted using put()
 * 4. System iterates through the map
 * 5. Capacity details are displayed
 *
 * Key Concepts Used:
 * - HashMap (Key–Value storage)
 * - Map Interface
 * - put() method
 * - entrySet() iteration
 * - Fast lookup using keys
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementApp {

    /**
     * Application entry point
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Header
        System.out.println("========================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("========================================\n");

        // Step 1: Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert bogies with capacities (Key-Value pairs)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Step 3: Display mapping using entrySet()
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println("Bogie: " + bogie + " | Capacity: " + capacity);
        }

        // Completion message
        System.out.println("\nUC6 HashMap operations completed successfully...");
    }
}