import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC17 - Sort Bogie Names using Arrays.sort()
 * ============================================================
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC17 - Arrays.sort() (Built-in Sorting)");
        System.out.println("========================================");

        // ---------------- FLOW DEMO ----------------
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Built-in sorting
        Arrays.sort(bogieTypes);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC17 TEST CASES ---");

        // Test 1: Basic Alphabetical Sorting
        String[] t1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        Arrays.sort(t1);
        boolean test1 = Arrays.equals(t1,
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"});
        System.out.println("testSort_BasicAlphabeticalSorting: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Unsorted Input
        String[] t2 = {"Luxury","General","Sleeper","AC Chair"};
        Arrays.sort(t2);
        boolean test2 = Arrays.equals(t2,
                new String[]{"AC Chair","General","Luxury","Sleeper"});
        System.out.println("testSort_UnsortedInput: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: Already Sorted Array
        String[] t3 = {"AC Chair","First Class","General"};
        Arrays.sort(t3);
        boolean test3 = Arrays.equals(t3,
                new String[]{"AC Chair","First Class","General"});
        System.out.println("testSort_AlreadySortedArray: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Duplicate Bogie Names
        String[] t4 = {"Sleeper","AC Chair","Sleeper","General"};
        Arrays.sort(t4);
        boolean test4 = Arrays.equals(t4,
                new String[]{"AC Chair","General","Sleeper","Sleeper"});
        System.out.println("testSort_DuplicateBogieNames: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Single Element Array
        String[] t5 = {"Sleeper"};
        Arrays.sort(t5);
        boolean test5 = Arrays.equals(t5,
                new String[]{"Sleeper"});
        System.out.println("testSort_SingleElementArray: " + (test5 ? "PASSED" : "FAILED"));

        System.out.println("\nUC17 completed successfully...");
    }
}