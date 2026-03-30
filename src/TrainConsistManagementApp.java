import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementApp
 * ==========================================================
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * Goal:
 * Initialize the Train Consist Management App and display
 * the initial state of the train.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User runs the program
 * 2. Application prints welcome message
 * 3. Train consist is initialized
 * 4. Initial bogie count is displayed
 * 5. Program continues
 *
 * Key Concepts Used:
 * - Class: Container for program logic
 * - main() Method: Entry point of execution
 * - static Keyword: Allows JVM to invoke main() directly
 * - List Interface: Abstraction for list structures
 * - ArrayList: Dynamic resizable collection
 * - Console Output: Using System.out.println()
 * - Dynamic Initialization: Creating empty list
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

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Confirmation message
        System.out.println("Train initialized successfully...");

        // Step 4: Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Step 5: Display current train consist
        System.out.println("Current Train Consist: " + trainConsist);

        // Step 6: System ready message
        System.out.println("\nSystem ready for operations...");
    }
}