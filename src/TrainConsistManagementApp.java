import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC7
 * ==========================================================
 *
 * UC7: Sort Bogies by Capacity (Comparator)
 *
 * Goal:
 * Sort passenger bogies based on their seating capacity
 * using a custom Comparator.
 *
 * Actor:
 * User – runs the application
 *
 * Key Concepts:
 * - Comparator Interface
 * - Custom Objects (Bogie class)
 * - List Collection
 * - sort() method
 * - Lambda Expressions
 * - Separation of Data and Logic
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementApps {

    /**
     * Bogie Class (Custom Object)
     */
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Display method
        void display() {
            System.out.println("Bogie: " + name + " | Capacity: " + capacity);
        }
    }

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        // Header
        System.out.println("========================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("========================================\n");

        // Step 1: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies (Custom Objects)
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):\n");

        for (Bogie b : bogies) {
            b.display();
        }

        // Completion message
        System.out.println("\nUC7 sorting completed successfully...");
    }
}