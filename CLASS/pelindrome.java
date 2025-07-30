import java.util.Scanner;

public class pelindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int var = sc.nextInt();
        int var1 = var;
        int sum = 0;
        while (var > 0) {
            int x = var % 10;
            sum = sum * 10 + x;
            var /= 10;
        }
        System.out.println(sum);
        if (sum == var1) {
            System.out.print("Number is pelindrome");
        } else {
            System.out.print("Number is  not pelindrome");
        }
        sc.close();
    }
}