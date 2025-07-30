import java.util.Scanner;
import java.util.Objects;

// Interface for Scholarship logic
interface Scholarship {
    boolean isEligible(Student s);
}

// Student class
class Student {
    int stdid;
    String stdname;
    int stdcgpa;
    int marks;

    // Constructor
    Student(int stdid, String stdname, int marks, int stdcgpa) {
        this.stdid = stdid;
        this.stdname = stdname;
        this.marks = marks;
        this.stdcgpa = stdcgpa;
    }

    // Method-local inner class
    void displayCourse(int n, Scanner input) {
        class Course {
            int courseid;
            int enrollSem;

            Course(int courseid, int enrollSem) {
                this.courseid = courseid;
                this.enrollSem = enrollSem;
            }

            void display() {
                System.out.println("Course ID -> " + courseid);
                System.out.println("Enroll Semester -> " + enrollSem);
            }
        }

        Course[] c = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Course ID  " + (i + 1) + ": ");
            int id = input.nextInt();

            System.out.print("Enter Enroll Semester  " + (i + 1) + ": ");
            int sem = input.nextInt();

            c[i] = new Course(id, sem);
        }

        for (int i = 0; i < n; i++) {
            c[i].display();
            System.out.println();
        }
    }

    // Anonymous inner class usage
    void checkScholarship() {
        Scholarship s1 = new Scholarship() {
            @Override
            public boolean isEligible(Student s) {
                return s.stdcgpa >= 7.5;
            }
        };

        if (s1.isEligible(this)) {
            System.out.println(stdname + " is eligible for scholarship.");
        } else {
            System.out.println(stdname + " is not eligible for scholarship.");
        }
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + stdid +
                ", Name='" + stdname + '\'' +
                ", Marks=" + marks +
                ", CGPA=" + stdcgpa +
                '}';
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(stdid, stdname);
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return stdid == s.stdid && stdname.equals(s.stdname);
    }
}

public class Practical_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter ID of student " + (i + 1) + " -> ");
            int id = input.nextInt();

            System.out.print("Enter Name of student " + (i + 1) + " -> ");
            String name = input.next();

            System.out.print("Enter Marks of student " + (i + 1) + " -> ");
            int marks = input.nextInt();

            System.out.print("Enter CGPA of student " + (i + 1) + " -> ");
            int cgpa = input.nextInt();

            s[i] = new Student(id, name, marks, cgpa);
        }

        for (int i = 0; i < n; i++) {
        System.out.println("\n" + s[i]);

        s[i].checkScholarship();

        System.out.print("Enter number of courses for student " + (i + 1) + ": ");
        int courseCount = input.nextInt();

        s[i].displayCourse(courseCount, input);
        }

        if (n >= 2) {
            System.out.println("\nComparing students using equals():");
            System.out.println(s[0].stdname + " equals " + s[1].stdname + "? " + s[0].equals(s[1]));

            System.out.println("HashCode of " + s[0].stdname + ": " + s[0].hashCode());
            System.out.println("HashCode of " + s[1].stdname + ": " + s[1].hashCode());
        }

        input.close();
    }
}
