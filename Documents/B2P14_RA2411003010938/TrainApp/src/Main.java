import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ==========================================================
 * MAIN CLASS – TrainConsistManagementAppUC11
 * ==========================================================
 *
 * UC11: Validate Train ID & Cargo Codes (Regex)
 *
 * Goal:
 * Validate Train ID and Cargo Code formats using Regular Expressions.
 *
 * Actor:
 * User – enters Train ID and Cargo Code
 *
 * Flow:
 * 1. User inputs Train ID & Cargo Code
 * 2. System compiles regex patterns
 * 3. Matcher validates inputs
 * 4. Valid/Invalid message displayed
 *
 * Key Concepts:
 * - Regex (Regular Expressions)
 * - Pattern & Matcher
 * - matches() validation
 * - Format enforcement
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagementAppUC11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("========================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("========================================\n");

        // Step 1: User input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Step 2: Define regex patterns
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // Step 4: Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Display results
        System.out.println("\nValidation Results:\n");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✔");
        } else {
            System.out.println("Train ID is INVALID ❌ (Expected format: TRN-1234)");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✔");
        } else {
            System.out.println("Cargo Code is INVALID ❌ (Expected format: PET-AB)");
        }

        // Completion message
        System.out.println("\nUC11 validation completed successfully...");

        scanner.close();
    }
}