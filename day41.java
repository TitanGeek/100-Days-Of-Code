
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilities {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

    private static final String URL_REGEX = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    private static final Pattern urlPattern = Pattern.compile(URL_REGEX);

    public static boolean isValidEmail(String email) {
        return emailPattern.matcher(email).matches();
    }

    public static String replaceAll(String input, String regex, String replacement) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(replacement);
    }

    public static List<String> extractUrls(String text) {
        List<String> urls = new ArrayList<>();
        Matcher matcher = urlPattern.matcher(text);
        while (matcher.find()) {
            urls.add(matcher.group());
        }
        return urls;
    }

    public static void main(String[] args) {
        // Example usage:
        String email = "john.doe@example.com";
        System.out.println(isValidEmail(email)); // Output: true

        String text = "This is a test string with https://www.example.com and another url http://google.com";
        List<String> urls = extractUrls(text);
        System.out.println(urls); // Output: [https://www.example.com, http://google.com]

        String input = "Replace all occurrences of 'word' with 'replacement'";
        String replacedText = replaceAll(input, "word", "replacement");
        System.out.println(replacedText); // Output: Replace all occurrences of 'replacement' with 'replacement'
    }
}
