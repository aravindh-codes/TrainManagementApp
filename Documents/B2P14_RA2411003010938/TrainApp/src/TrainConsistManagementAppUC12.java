import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * UC12: Safety Compliance Check for Goods Bogies
 * ==========================================================
 *
 * Goal:
 * Validate goods bogies using stream + allMatch()
 *
 * Rule:
 * Cylindrical bogie → ONLY Petroleum allowed
 */
public class TrainConsistManagementAppUC12 {

    /**
     * Goods Bogie Class
     */
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + "(" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC12 - SAFETY VALIDATION TEST EXECUTION");
        System.out.println("========================================\n");

        // Run all test cases
        testSafety_AllBogiesValid();
        testSafety_CylindricalWithInvalidCargo();
        testSafety_NonCylindricalBogiesAllowed();
        testSafety_MixedBogiesWithViolation();
        testSafety_EmptyBogieList();

        System.out.println("\nAll UC12 test cases executed.");
    }

    /**
     * 🔹 Core Validation Logic (Reusable)
     */
    static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical") ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );
    }

    // ✅ Test 1
    static void testSafety_AllBogiesValid() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Box", "Coal"));

        boolean result = isTrainSafe(list);
        printResult("testSafety_AllBogiesValid", true, result, list);
    }

    // ❌ Test 2
    static void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Coal"));

        boolean result = isTrainSafe(list);
        printResult("testSafety_CylindricalWithInvalidCargo", false, result, list);
    }

    // ✅ Test 3
    static void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Open", "Grain"));
        list.add(new GoodsBogie("Box", "Coal"));

        boolean result = isTrainSafe(list);
        printResult("testSafety_NonCylindricalBogiesAllowed", true, result, list);
    }

    // ❌ Test 4
    static void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Cylindrical", "Coal")); // violation

        boolean result = isTrainSafe(list);
        printResult("testSafety_MixedBogiesWithViolation", false, result, list);
    }

    // ✅ Test 5
    static void testSafety_EmptyBogieList() {
        List<GoodsBogie> list = new ArrayList<>();

        boolean result = isTrainSafe(list);
        printResult("testSafety_EmptyBogieList", true, result, list);
    }

    /**
     * 🔹 Print method (same style as UC11)
     */
    static void printResult(String testName, boolean expected, boolean actual, List<GoodsBogie> list) {

        System.out.println("----------------------------------------");
        System.out.println("Test Case: " + testName);
        System.out.println("Bogies: " + list);
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        if (expected == actual) {
            System.out.println("Status: PASS ✅");
        } else {
            System.out.println("Status: FAIL ❌");
        }
    }
}