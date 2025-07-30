import java.util.Objects;
import java.util.Scanner;

// Interface for scholarship eligibility
interface Scholarship {
    boolean isEligible(Student s);
}

class Student {
    int stdId;
    String stdName;
    int marks;

    // Constructor
    Student(int stdId, String stdName, int marks) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.marks = marks;
    }

    // Inner class - Course
    class Course {
        int courseId;
        String courseName;

        Course(int courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }

        void display() {
            System.out.println("Course ID: " + courseId);
            System.out.println("Course Name: " + courseName);
        }
    }

    // Method-local inner class - Semester Enrollment
    void enrollInSemesterCourses(int semester, Scanner sc) {
        class SemesterEnrollment {
            void enroll() {
                System.out.print("Enter number of courses for Semester " + semester + ": ");
                int count = sc.nextInt();
                Course[] courses = new Course[count];

                for (int i = 0; i < count; i++) {
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    courses[i] = new Course(cid, cname);
                }

                System.out.println("Courses enrolled in Semester " + semester + ":");
                for (Course c : courses) {
                    c.display();
                    System.out.println();
                }
            }
        }

        SemesterEnrollment enrollment = new SemesterEnrollment(); // Stored on heap
        enrollment.enroll(); // Method call goes on stack
    }

    // Anonymous Inner Class for Scholarship Logic
    void checkScholarship() {
        Scholarship s = new Scholarship() {
            public boolean isEligible(Student st) {
                return st.marks >= 85;
            }
        };

        if (s.isEligible(this)) {
            System.out.println(stdName + " is eligible for scholarship.");
        } else {
            System.out.println(stdName + " is not eligible for scholarship.");
        }
    }

    // Override Object class methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return stdId == other.stdId && Objects.equals(stdName, other.stdName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdId, stdName);
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + stdId + ", Name='" + stdName + "', Marks=" + marks + "}";
    }
}

public class StudentPortalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Objects created in heap
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter ID for student " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine(); // buffer clear
            System.out.print("Enter Name for student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Marks for student " + (i + 1) + ": ");
            int marks = sc.nextInt();

            students[i] = new Student(id, name, marks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + students[i].toString());

            students[i].checkScholarship(); // Anonymous inner class
            System.out.print("Enter semester number to enroll courses: ");
            int sem = sc.nextInt();
            students[i].enrollInSemesterCourses(sem, sc); // Method-local inner class
        }

        // Demonstrating equals() and hashCode()
        if (n >= 2) {
            System.out.println("\nComparing student 1 and 2:");
            System.out.println("Equals: " + students[0].equals(students[1]));
            System.out.println("HashCodes: " + students[0].hashCode() + " vs " + students[1].hashCode());
        }

        // Garbage Collection: When object has no reference, it becomes eligible
        students[0] = null; // Now object may be garbage collected
        System.gc(); // Hint to JVM to run GC (no guarantee)

        sc.close();
    }
}
