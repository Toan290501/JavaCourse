import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    public static List<String> findMatches(List<String> lines, String regex) {
        List<String> matches = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                matches.add(matcher.group());
            }
        }
        return matches;
    }
}
