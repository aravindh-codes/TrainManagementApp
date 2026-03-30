import java.util.LinkedHashSet;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC5
 * ==========================================================
 *
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Goal:
 * Maintain insertion order while enforcing uniqueness.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User runs program
 * 2. Bogies are added
 * 3. LinkedHashSet stores them
 * 4. Duplicate bogies are ignored
 * 5. Formation is printed in insertion order
 *
 * Key Concepts Used:
 * - LinkedHashSet (Ordered + Unique)
 * - Set Interface (No duplicates)
 * - add() method
 * - Automatic Deduplication
 * - Insertion Order Preservation
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
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================\n");

        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies (insertion order maintained)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to add duplicate
        trainFormation.add("Sleeper"); // Duplicate (will be ignored)

        // Step 4: Display formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation + "\n");

        // Note about behavior
        System.out.println("Note:");
        System.out.println("Duplicates are ignored and insertion order is preserved.\n");

        // Completion message
        System.out.println("UC5 LinkedHashSet operations completed successfully...");
    }
}