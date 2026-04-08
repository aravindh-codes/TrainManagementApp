import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC18 - Linear Search for Bogie ID
 * ============================================================
 */

public class TrainConsistManagementApp {

    // ---------------- LINEAR SEARCH METHOD ----------------
    public static boolean linearSearch(String[] arr, String key) {

        for (String id : arr) {

            // Compare using equals()
            if (id.equals(key)) {
                return true; // Early termination
            }
        }

        return false; // Not found
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC18 - Linear Search (Unsorted Data)");
        System.out.println("========================================");

        // ---------------- FLOW DEMO ----------------
        String[] bogieIDs = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        System.out.println("\nBogie IDs: " + Arrays.toString(bogieIDs));
        System.out.println("Searching for: " + searchKey);

        boolean found = linearSearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Result: Bogie FOUND");
        } else {
            System.out.println("Result: Bogie NOT FOUND");
        }

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC18 TEST CASES ---");

        String[] base = {"BG101","BG205","BG309","BG412","BG550"};

        // Test 1: Bogie Found
        boolean test1 = linearSearch(base, "BG309");
        System.out.println("testSearch_BogieFound: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Bogie Not Found
        boolean test2 = !linearSearch(base, "BG999");
        System.out.println("testSearch_BogieNotFound: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: First Element Match
        boolean test3 = linearSearch(base, "BG101");
        System.out.println("testSearch_FirstElementMatch: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Last Element Match
        boolean test4 = linearSearch(base, "BG550");
        System.out.println("testSearch_LastElementMatch: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Single Element Array
        String[] single = {"BG101"};
        boolean test5 = linearSearch(single, "BG101");
        System.out.println("testSearch_SingleElementArray: " + (test5 ? "PASSED" : "FAILED"));

        System.out.println("\nUC18 completed successfully...");
    }
}