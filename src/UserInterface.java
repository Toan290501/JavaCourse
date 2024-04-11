import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(String defaultInputPath, String defaultOutputPath, String defaultRegex) {
        while (true) {
            System.out.println("1. Process Data");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    initiateProcessing(defaultInputPath, defaultOutputPath, defaultRegex);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void initiateProcessing(String inputPath, String outputPath, String regex) {
        System.out.println("Using default settings from config:");
        System.out.println("Input Path: " + inputPath);
        System.out.println("Output Path: " + outputPath);
        System.out.println("Regex Pattern: " + regex);

        System.out.print("Modify input file path (press Enter to keep default): ");
        String userInput = scanner.nextLine();
        if (!userInput.isEmpty()) {
            inputPath = userInput;
        }

        System.out.print("Modify output file path (press Enter to keep default): ");
        userInput = scanner.nextLine();
        if (!userInput.isEmpty()) {
            outputPath = userInput;
        }

        System.out.print("Modify regex pattern (press Enter to keep default): ");
        userInput = scanner.nextLine();
        if (!userInput.isEmpty()) {
            regex = userInput;
        }

        DataProcessor.process(inputPath, outputPath, regex);
    }
}
