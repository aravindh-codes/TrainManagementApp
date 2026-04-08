import java.util.*;

/**
 * ============================================================
 * UC13 - Performance Comparison (Loops vs Streams)
 * ============================================================
 */

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementAppUC13 {

    public static void main(String[] args) {

        System.out.println("\n========================================");
        System.out.println("UC13 - Performance Comparison");
        System.out.println("========================================");

        // Create dataset
        List<Bogie> bogiesUC13 = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogiesUC13.add(new Bogie("Sleeper", 72));
            bogiesUC13.add(new Bogie("AC Chair", 56));
            bogiesUC13.add(new Bogie("First Class", 40));
        }

        // ---------------- LOOP-BASED FILTERING ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogiesUC13) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM-BASED FILTERING ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamFiltered = bogiesUC13
                .stream()
                .filter(b -> b.capacity > 60)
                .toList();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("\nLoop Filtering Result Count: " + loopFiltered.size());
        System.out.println("Stream Filtering Result Count: " + streamFiltered.size());

        System.out.println("\nExecution Time (Loop): " + loopTime + " ns");
        System.out.println("Execution Time (Stream): " + streamTime + " ns");

        System.out.println("\nObservation:");
        System.out.println("Both approaches should return same results.");
        System.out.println("Performance may vary depending on JVM optimizations.");

        // ============================================================
        // TEST CASES (Visible Output)
        // ============================================================

        System.out.println("\n--- UC13 TEST CASES ---");

        // Test 1: Loop Filtering Logic
        boolean test1 = loopFiltered.stream().allMatch(b -> b.capacity > 60);
        System.out.println("testLoopFilteringLogic: " + (test1 ? "PASSED" : "FAILED"));

        // Test 2: Stream Filtering Logic
        boolean test2 = streamFiltered.stream().allMatch(b -> b.capacity > 60);
        System.out.println("testStreamFilteringLogic: " + (test2 ? "PASSED" : "FAILED"));

        // Test 3: Result Consistency
        boolean test3 = loopFiltered.size() == streamFiltered.size();
        System.out.println("testLoopAndStreamResultsMatch: " + (test3 ? "PASSED" : "FAILED"));

        // Test 4: Execution Time Validity
        boolean test4 = loopTime > 0 && streamTime > 0;
        System.out.println("testExecutionTimeMeasurement: " + (test4 ? "PASSED" : "FAILED"));

        // Test 5: Large Dataset Processing
        boolean test5 = bogiesUC13.size() == 30000; // 3 bogies * 10000
        System.out.println("testLargeDatasetProcessing: " + (test5 ? "PASSED" : "FAILED"));

        System.out.println("\nUC13 completed successfully...");
    }
}