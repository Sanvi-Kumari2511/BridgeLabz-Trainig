package Day_12;

public class Employee_04 {
    private static int nextId = 1001;

    private int empId;
    private String empName;

    public Employee_04(String empName) {
        this.empName = empName;

        this.empId = nextId;
        nextId++;
    }

    public int getEmployeeId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Main{
    public static void main(String[] args) {
        Employee_04 e1 = new Employee_04("Sanvi");
        Employee_04 e2 = new Employee_04("Manvi");
        Employee_04 e3 = new Employee_04("Janvi");
        Employee_04 e4 = new Employee_04("Tanvi");

        System.out.println("Employee Name: " + e1.getEmpName() + " ID: " + e1.getEmployeeId());
        System.out.println("Employee Name: " +e2.getEmpName() + " ID:" + e2.getEmployeeId());
        System.out.println("Employee Name: " +e3.getEmpName() + " ID:" + e3.getEmployeeId());
        System.out.println("Employee Name: " +e4.getEmpName() + " ID:" + e4.getEmployeeId());
    }
}

