import java.util.StringTokenizer;

public class Palindrome {
    public static void main(String[] args) {
        int count = 0, count1 = 0;
        boolean flag = false;
        String string = "Madam In Eden I m Adam";
        int length = string.length();

        StringTokenizer stream = new StringTokenizer(string);
        String[] str = new String[length];
        String[] str2 = new String[length];
        while (stream.hasMoreTokens()) {
            String token = stream.nextToken();
            token.toLowerCase();
            str2[count++] = token;

            char[] str1 = token.toCharArray();
            int left = 0, right = token.length() - 1;

            while (left <= (token.length() / 2) || right > 0) {
                if (str1[left] == str1[right]) {
                    flag = true;
                } else {
                    flag = false;
                }
                left++;
                right--;
            }

            for (int i = 0; i < count; i++) {
                if (str2[i] == token) {
                    str[count1++] = token;
                }
            }

            // Print all the palindrome
            if (flag == true) {
                System.out.println(token + " is a Palindrome.");
            } else {
                System.out.println(token + " is not a Palindrome.");
            }
        }
        // Print all the duplicate string
        for (int j = 0; j < count1; j++) {
            System.out.println("Duplicate token are -> " + str[j]);
        }
    }
}