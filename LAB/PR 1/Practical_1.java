import java.util.Scanner;

class EMP {
    private int id, salary;
    private String name, deptName, status;
    static int Contract_count = 0;
    static int Permanant_count = 0;

    public EMP(int id, String name, int salary, String deptname, String status) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptname;
        this.status = status;
    }

    // public EMP() {
    // id = 0;
    // name = "name";
    // salary = 0;
    // deptName = "";
    // status = "";
    // }

    public int GetId() {
        return id;
    }

    public String Getname() {
        return name;
    }

    public int Getsalary() {
        return salary;
    }

    public String GetDept() {
        return deptName;
    }

    public String GetStatus() {
        return status;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public void Setname(String name) {
        this.name = name;
    }

    public void SetStatus(String status) {
        this.status = status;
    }

    public void Setslary(int salary) {
        this.salary = salary;
    }

    public void Setid(String deptname) {
        this.deptName = deptname;
    }

    @Override
    public String toString() {
        return "EMP{" + "id -> " + id + ", Name -> " + name + ", Department name -> "
                +
                deptName + ", salary -> " + salary + '}';
    }

    // void print() {
    // System.out.println("Name of the Employee is -> " + name);
    // System.out.println("ID of the Employee is -> " + id);
    // System.out.println("salary of the Employee is -> " + salary);
    // System.out.println("DEPARTMENT of the Employee is -> " + deptName + "\n");
    // }

}

public class Practical_1 {

    public static void main(String args[]) {
        Object o[] = new Object[3];
        Scanner input = new Scanner(System.in);

        int id, salary;
        String name, deptname, status;
        for (int i = 0; i < o.length; i++) {
            System.out.print("Enter id ");
            id = input.nextInt();

            System.out.print("Enter name ");
            name = input.next();

            System.out.print("enter salary ");
            salary = input.nextInt();

            System.out.print("Enter dept name ");
            deptname = input.next();

            System.out.print("Enter Status (permanent/contract) ");
            status = input.next();

            o[i] = new EMP(id, name, salary, deptname, status);
        }
        for (Object obj : o) {
            if (obj instanceof EMP) {
                EMP e1 = (EMP) obj;
                if (e1.GetStatus().equalsIgnoreCase("permanent")) {
                    System.out.println("Status of the EMPLOYEE IS : " + e1.GetStatus());
                    System.out.println("Department naem is -> " + e1.GetDept());
                    System.out.println("EMployee Id is -> " + e1.GetId());
                    System.out.println("Employee Salary is -> " + e1.Getsalary());
                    System.out.println("Employee name is -> " + e1.Getname());
                } else if (e1.GetStatus().equalsIgnoreCase("contract")) {
                    System.out.println("Status of the EMPLOYEE IS : " + e1.GetStatus());
                    System.out.println("Department naem is -> " + e1.GetDept());
                    System.out.println("EMployee Id is -> " + e1.GetId());
                    System.out.println("Employee Salary is -> " + e1.Getsalary());
                    System.out.println("Employee name is -> " + e1.Getname());
                } else {
                    System.out.println("Department naem is -> " + e1.GetDept());
                    System.out.println("EMployee Id is -> " + e1.GetId());
                    System.out.println("Employee Salary is -> " + e1.Getsalary());
                    System.out.println("Employee name is -> " + e1.Getname());
                    System.out.println("UNKNOWN status...");
                }
            }
        }
        input.close();
    }
}