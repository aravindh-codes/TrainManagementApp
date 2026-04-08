import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC19 - Binary Search for Bogie ID
 * ============================================================
 */

public class TrainConsistManagementApp {

    // ---------------- BINARY SEARCH METHOD ----------------
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // Found
            } else if (cmp < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1;  // Search right
            }
        }

        return false; // Not found
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC19 - Binary Search (Optimized Search)");
        System.out.println("========================================");

        // ---------------- FLOW DEMO ----------------
        String[] bogieIDs = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG309";

        System.out.println("\nOriginal Data: " + Arrays.toString(bogieIDs));

        // Ensure sorted before binary search
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Data:   " + Arrays.toString(bogieIDs));
        System.out.println("Searching for: " + searchKey);

        boolean found = binarySearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Result: Bogie FOUND");
        } else {
            System.out.println("Result: Bogie NOT FOUND");
        }

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC19 TEST CASES ---");

        // Base sorted array
        String[] base = {"BG101","BG205","BG309","BG412","BG550"};

        // Test 1: Bogie Found
        boolean test1 = binarySearch(base, "BG309");
        System.out.println("testBinarySearch_BogieFound: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Bogie Not Found
        boolean test2 = !binarySearch(base, "BG999");
        System.out.println("testBinarySearch_BogieNotFound: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: First Element Match
        boolean test3 = binarySearch(base, "BG101");
        System.out.println("testBinarySearch_FirstElementMatch: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Last Element Match
        boolean test4 = binarySearch(base, "BG550");
        System.out.println("testBinarySearch_LastElementMatch: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Single Element Array
        String[] single = {"BG101"};
        boolean test5 = binarySearch(single, "BG101");
        System.out.println("testBinarySearch_SingleElementArray: " + (test5 ? "PASSED" : "FAILED"));

        // Test 6: Empty Array
        String[] empty = {};
        boolean test6 = !binarySearch(empty, "BG101");
        System.out.println("testBinarySearch_EmptyArray: " + (test6 ? "PASSED" : "FAILED"));

        // Test 7: Unsorted Input Handling
        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        Arrays.sort(unsorted);
        boolean test7 = binarySearch(unsorted, "BG205");
        System.out.println("testBinarySearch_UnsortedInputHandled: " + (test7 ? "PASSED" : "FAILED"));

        System.out.println("\nUC19 completed successfully...");
    }
}