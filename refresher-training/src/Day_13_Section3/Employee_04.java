package Day_13_Section3;

public class Employee_04 {

    String name;
    double salary;

    Employee_04(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee_04{
    int teamSize;

    Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Main2{
    public static void main(String[] args) {
//        Manager m = new Manager("Sanvi", 30000, 10);
//        m.getDetails();

          Employee_04 e = new Manager("Sanvi", 30000, 10);
          e.getDetails();
    }
}