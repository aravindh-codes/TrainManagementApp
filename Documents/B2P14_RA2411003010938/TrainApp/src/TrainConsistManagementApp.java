import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC14 - Handle Invalid Bogie Capacity (Custom Exception)
 * ============================================================
 */

// ---------------- CUSTOM EXCEPTION ----------------
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ---------------- BOGIE CLASS ----------------
class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) throws InvalidCapacityException {

        // Fail-Fast Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

// ---------------- MAIN APPLICATION ----------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC14 - Custom Exception Handling");
        System.out.println("========================================");

        List<Bogie> trainConsist = new ArrayList<>();

        // ---------------- FLOW DEMO ----------------
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            trainConsist.add(b1);
            System.out.println("Added: " + b1);
        } catch (InvalidCapacityException e) {
            System.out.println("Error adding Sleeper: " + e.getMessage());
        }

        try {
            Bogie b2 = new Bogie("AC Chair", 0); // Invalid
            trainConsist.add(b2);
            System.out.println("Added: " + b2);
        } catch (InvalidCapacityException e) {
            System.out.println("Error adding AC Chair: " + e.getMessage());
        }

        try {
            Bogie b3 = new Bogie("First Class", -10); // Invalid
            trainConsist.add(b3);
            System.out.println("Added: " + b3);
        } catch (InvalidCapacityException e) {
            System.out.println("Error adding First Class: " + e.getMessage());
        }

        System.out.println("\nTotal Valid Bogies in Train: " + trainConsist.size());

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC14 TEST CASES ---");

        // Test 1: Valid Capacity Creation
        boolean test1;
        try {
            Bogie b = new Bogie("Sleeper", 50);
            test1 = (b.capacity == 50);
        } catch (InvalidCapacityException e) {
            test1 = false;
        }
        System.out.println("testException_ValidCapacityCreation: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Negative Capacity
        boolean test2;
        try {
            new Bogie("Test", -10);
            test2 = false;
        } catch (InvalidCapacityException e) {
            test2 = true;
        }
        System.out.println("testException_NegativeCapacityThrowsException: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: Zero Capacity
        boolean test3;
        try {
            new Bogie("Test", 0);
            test3 = false;
        } catch (InvalidCapacityException e) {
            test3 = true;
        }
        System.out.println("testException_ZeroCapacityThrowsException: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Exception Message Validation
        boolean test4;
        try {
            new Bogie("Test", 0);
            test4 = false;
        } catch (InvalidCapacityException e) {
            test4 = e.getMessage().equals("Capacity must be greater than zero");
        }
        System.out.println("testException_ExceptionMessageValidation: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Object Integrity
        boolean test5;
        try {
            Bogie b = new Bogie("AC Chair", 56);
            test5 = b.type.equals("AC Chair") && b.capacity == 56;
        } catch (InvalidCapacityException e) {
            test5 = false;
        }
        System.out.println("testException_ObjectIntegrityAfterCreation: " + (test5 ? "PASSED" : "FAILED"));

        // Test 6: Multiple Valid Bogies
        boolean test6;
        try {
            new Bogie("Sleeper", 72);
            new Bogie("AC Chair", 56);
            new Bogie("First Class", 40);
            test6 = true;
        } catch (InvalidCapacityException e) {
            test6 = false;
        }
        System.out.println("testException_MultipleValidBogiesCreation: " + (test6 ? "PASSED" : "FAILED"));

        System.out.println("\nUC14 completed successfully...");
    }
}