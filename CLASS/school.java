import java.util.Scanner;

class student {
    int roll_num;
    String name;

    student(int Roll, String Name) {
        roll_num = Roll;
        name = Name;
    }

    void display() {
        System.out.println("Name of sdtudent is -> " + name + "Roll number of student is -> " + roll_num);
    }
}

class exam extends student {
    int s1, s2, s3;

    exam(int ROLL, String NAME, int S1, int S2, int S3) {
        super(ROLL, NAME);
        s1 = S1;
        s2 = S2;
        s3 = S3;
    }

    void display() {
        System.out.println("Name of sdtudent is -> " + name + "\nRoll number of student is -> " + roll_num);

        if (s1 >= 33 && s2 >= 33 && s3 >= 33) {
            float result = ((s1 + s2 + s3) / 3);
            System.out.println("Student Persentage is -> % " + result);
        } else if (s1 < 33 && s2 < 33 && s3 < 33) {
            System.out.println("Student failed in all subject.");
        } else if (s1 < 33) {
            System.out.println("Student failed in subject 1.");
        } else if (s2 < 33) {
            System.out.println("Student failed in subject 2.");
        } else if (s3 < 33) {
            System.out.println("Student failed in subject 3.");
        }
    }

}

class school {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name of student -> ");
        String NAme = input.next();

        System.out.print("Enter Roll number -> ");
        int ROLL_NUM = input.nextInt();

        System.out.print("Enter Marks of subject 1 -> ");
        int sub1 = input.nextInt();

        System.out.print("Enter Marks of subject 2 -> ");
        int sub2 = input.nextInt();

        System.out.print("Enter Marks of subject 3 -> ");
        int sub3 = input.nextInt();

        exam s1 = new exam(ROLL_NUM,NAme,sub1,sub2,sub3);

        s1.display();

        input.close();

    }
}