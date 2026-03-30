import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC3
 * ==========================================================
 *
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Goal:
 * Ensure no duplicate bogie IDs are added to the train.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User runs program
 * 2. Bogie IDs are added
 * 3. System inserts into HashSet
 * 4. Duplicate values are ignored automatically
 * 5. Unique IDs are displayed
 *
 * Key Concepts Used:
 * - Set Interface: Does not allow duplicate elements
 * - HashSet: Implements Set using hashing
 * - add(): Inserts elements
 * - Automatic Deduplication
 * - Unordered Storage (no index-based order)
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
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================\n");

        // Step 1: Create HashSet for storing unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds + "\n");

        // Step 4: Explanation note
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        // Completion message
        System.out.println("UC3 uniqueness validation completed...");
    }
}