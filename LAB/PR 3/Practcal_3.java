import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practcal_3 {
    public static void main(String[] args) {
        String input = "Mahavir & ";
        Pattern pattern = Pattern.compile("[a-z]+\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("regex find at : " + matcher.start());
            System.out.println("Hi");
        }
    }
}