import java.util.List;

public class DataProcessor {
    public static void process(String inputPath, String outputPath, String regex) {
        try {
            List<String> lines = IOUtils.readFromFile(inputPath);
            List<String> results = RegexUtils.findMatches(lines, regex);
            IOUtils.writeToFile(results, outputPath);
            Logger.log("Processing completed successfully.");
        } catch (Exception e) {
            Logger.error("Failed to process data: " + e.getMessage());
        }
    }
}
