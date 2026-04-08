import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC20 - Fail-Fast Search (IllegalStateException)
 * ============================================================
 */

public class TrainConsistManagementApp {

    // ---------------- SEARCH METHOD WITH VALIDATION ----------------
    public static boolean searchBogie(String[] bogieIDs, String key) {

        // Fail-Fast Validation
        if (bogieIDs == null || bogieIDs.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train");
        }

        // Linear Search (reuse concept)
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC20 - Fail-Fast Search Validation");
        System.out.println("========================================");

        // ---------------- FLOW DEMO ----------------

        // Case 1: Empty Data
        String[] empty = {};

        try {
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Case 2: Valid Data
        String[] bogies = {"BG101","BG205","BG309"};

        try {
            boolean found = searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("Result: Bogie FOUND");
            } else {
                System.out.println("Result: Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC20 TEST CASES ---");

        // Test 1: Exception when empty
        boolean test1;
        try {
            searchBogie(new String[]{}, "BG101");
            test1 = false;
        } catch (IllegalStateException e) {
            test1 = true;
        }
        System.out.println("testSearch_ThrowsExceptionWhenEmpty: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Allows search when data exists
        boolean test2;
        try {
            searchBogie(new String[]{"BG101","BG205"}, "BG101");
            test2 = true;
        } catch (Exception e) {
            test2 = false;
        }
        System.out.println("testSearch_AllowsSearchWhenDataExists: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: Bogie Found
        boolean test3 = searchBogie(
                new String[]{"BG101","BG205","BG309"}, "BG205");
        System.out.println("testSearch_BogieFoundAfterValidation: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Bogie Not Found
        boolean test4 = !searchBogie(
                new String[]{"BG101","BG205","BG309"}, "BG999");
        System.out.println("testSearch_BogieNotFoundAfterValidation: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Single Element Case
        boolean test5 = searchBogie(new String[]{"BG101"}, "BG101");
        System.out.println("testSearch_SingleElementValidCase: " + (test5 ? "PASSED" : "FAILED"));

        System.out.println("\nUC20 completed successfully...");
    }
}