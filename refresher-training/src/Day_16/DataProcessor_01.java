package Day_16;

public interface DataProcessor_01<T> {
    void add(T data);
    void process(T value);
}

class Student1 <T> implements DataProcessor_01<T> {

    String name;
    int marks;

    @Override
    public void add(T name){
        System.out.println("Name: " + name);
    }

    @Override
    public void process(T marks) {
        System.out.println("Marks: " + marks);
    }
}

class Employee <T> implements DataProcessor_01<T> {

    String name;
    double salary;

    @Override
    public void add(T name){
        System.out.println("Name: " + name);
    }

    @Override
    public void process(T salary){
        System.out.println("Salary: " + salary);
    }
}

class Main3{
    public static void main(String[] args) {
        Student1 s = new Student1();

        s.add("Sanvi");
        s.process(90);

        Employee e = new Employee();

        e.add("Manvi");
        e.process(50000.0);

    }
}