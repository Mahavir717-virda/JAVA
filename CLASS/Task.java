import java.util.Scanner;

class interest {
    int price, rate, time;

    int inte(int p, int r, int t) {
        return (p * r * t) / 100;
    }
}

class maximum {
    int first, second, third;

    int maxi(int a, int b, int c) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        } else {
            return 0;
        }
    }
}

public class Task {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        interest i = new interest();

        // i.price = 10000;
        // i.rate = 5;
        // i.time = 12;
        System.out.print("Enter Price -> ");
        i.price = input.nextInt();

        System.out.print("Enter rate -> ");
        i.rate = input.nextInt();

        System.out.print("Enter time -> ");
        i.time = input.nextInt();

        System.out.println("Interest is -> " + i.inte(i.price, i.rate, i.time));

        maximum m = new maximum();
        // m.first = 15;
        // m.second = 10;
        // m.third = 5;

        System.out.print("Enter first number -> ");
        m.first = input.nextInt();

        System.out.print("Enter second number -> ");
        m.third = input.nextInt();

        System.out.print("Enter third number ->");
        m.third = input.nextInt();

        
    System.out.println("Maximum number is -> " + m.maxi(m.first, m.second, m.third));

    input.close();
    }
}