import java.util.*;

/**
 * ============================================================
 * Train Consist Management App
 * UC16 - Sort Passenger Bogies (Bubble Sort)
 * ============================================================
 */

public class TrainConsistManagementApp {

    // ---------------- BUBBLE SORT METHOD ----------------
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if out of order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------------- HELPER METHOD ----------------
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("]");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC16 - Bubble Sort (Manual Sorting)");
        System.out.println("========================================");

        // ---------------- FLOW DEMO ----------------
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.println("\nAfter Sorting:");
        printArray(capacities);

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC16 TEST CASES ---");

        // Test 1: Basic Sorting
        int[] t1 = {72, 56, 24, 70, 60};
        bubbleSort(t1);
        boolean test1 = Arrays.equals(t1, new int[]{24, 56, 60, 70, 72});
        System.out.println("testSort_BasicSorting: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Already Sorted
        int[] t2 = {24, 56, 60, 70, 72};
        bubbleSort(t2);
        boolean test2 = Arrays.equals(t2, new int[]{24, 56, 60, 70, 72});
        System.out.println("testSort_AlreadySortedArray: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: Duplicate Values
        int[] t3 = {72, 56, 56, 24};
        bubbleSort(t3);
        boolean test3 = Arrays.equals(t3, new int[]{24, 56, 56, 72});
        System.out.println("testSort_DuplicateValues: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Single Element
        int[] t4 = {50};
        bubbleSort(t4);
        boolean test4 = Arrays.equals(t4, new int[]{50});
        System.out.println("testSort_SingleElementArray: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: All Equal Values
        int[] t5 = {40, 40, 40};
        bubbleSort(t5);
        boolean test5 = Arrays.equals(t5, new int[]{40, 40, 40});
        System.out.println("testSort_AllEqualValues: " + (test5 ? "PASSED" : "FAILED"));

        System.out.println("\nUC16 completed successfully...");
    }
}