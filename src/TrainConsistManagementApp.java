import java.util.ArrayList;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC2
 * ==========================================================
 *
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Goal:
 * Allow dynamic insertion and removal of passenger bogies
 * using ArrayList.
 *
 * Actor:
 * User – runs the application
 *
 * Flow:
 * 1. User runs program
 * 2. Passenger bogies are added
 * 3. Bogies are displayed
 * 4. A bogie is removed
 * 5. Existence is checked
 * 6. Program continues
 *
 * Key Concepts Used:
 * - ArrayList: Dynamic resizable collection
 * - add(): Insert elements
 * - remove(): Delete elements
 * - contains(): Check existence
 * - Insertion Order Preservation
 * - CRUD Operations on collections
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
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================\n");

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after insertion (READ)
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // Step 4: Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // Step 5: Check existence (SEARCH)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + exists + "\n");

        // Step 6: Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        // Completion message
        System.out.println("UC2 operations completed successfully...");
    }
}