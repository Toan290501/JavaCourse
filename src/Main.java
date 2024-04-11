import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Properties config = ConfigLoader.loadConfig("src/ConfigLoader.java");

        String inputFilePath = config.getProperty("inputFilePath", "src/input.txt");
        String outputFilePath = config.getProperty("outputFilePath", "src/output.txt");
        String regexPattern = config.getProperty("regexPattern", "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        int numberOfThreads = Integer.parseInt(config.getProperty("numberOfThreads", "4"));

        ThreadManager.start(numberOfThreads);

        UserInterface.displayMenu(inputFilePath, outputFilePath, regexPattern);

        ThreadManager.shutdown();
    }
}