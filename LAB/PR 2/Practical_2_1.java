import java.util.*;

class Practical_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {

            System.out.println("1. String length");
            System.out.println("2. Check if string ends with a particular word");
            System.out.println("3. Change case of a string");
            System.out.println("4. Check if string is empty");
            System.out.println("5. Replace word in a string");
            System.out.println("6. Check if any word is inappropriate or not.");
            System.out.println("7. To remove space between characters.");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to find its length: ");
                    String s1 = sc.next();
                    System.out.println("String length: " + s1.length());
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String s2 = sc.next();
                    System.out.print("Enter the word to check if it ends with: ");
                    String s3 = sc.next();

                    if (s2.endsWith(s3)) {
                        System.out.println("String ends with " + s3);
                    } else {
                        System.out.println("String doesn`t ends with " + s3);
                    }
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String s4 = sc.next();
                    System.out.print("Press 1 for UPPERCASE, 2 for lowercase: ");
                    int n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Uppercase: " + s4.toUpperCase());
                    } else if (n == 2) {
                        System.out.println("Lowercase: " + s4.toLowerCase());
                    } else {
                        System.out.println("Invalid option for case conversion.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a string: ");
                    String s5 = sc.next();
                    if (s5.isEmpty()) {
                        System.out.println("Entered string is empty.");
                    } else {
                        System.out.println("Entered string is not empty.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String s6 = sc.next();
                    System.out.print("Enter the word to replace: ");
                    String Old = sc.next();
                    System.out.print("Enter the new word: ");
                    String New = sc.next();
                    String replaced = s6.replace(Old, New);
                    System.out.println("Modified string: " + replaced);
                    break;

                case 6:
                    String[] str = { "shit", "damn", "fuck" };
                    System.out.println("Enter the string -> ");
                    String str1 = sc.next();
                    String str3;

                    for (String string : str) {
                        str3 = str1.toLowerCase();
                        str1 = str3.replaceAll(string, "***");
                    }
                    System.out.println(str1);
                    break;

                case 7:
                    sc.nextLine(); 
                    System.out.print("Enter a string: ");
                    String m = sc.nextLine();
                    String noSpaces = m.replaceAll("\\s+", ""); 
                    System.out.println("String without spaces: " + noSpaces);
                    break;

                default:
                    System.out.println("Invalid choice.....");
            }
        }
        sc.close();
    }
}