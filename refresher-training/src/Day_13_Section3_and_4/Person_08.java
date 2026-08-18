package Day_13_Section3_and_4;

public class Person_08 {
    String name;
    Person_08(String name){
        this.name = name;
    }
}

class Student extends Person_08 {
    String course;
    Student(String name, String course){
        super(name);
        this.course = course;
    }
}

class GraduateStudent extends Student{
    String thesisTitle;
    GraduateStudent(String name, String course, String thesisTitle){
        super(name, course);
        this.thesisTitle = thesisTitle;
    }
}

class Main6{
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Sanvi", "Btech", "Artificial Intelligence");
        System.out.println("Name: " + g.name);
        System.out.println("Course: " + g.course);
        System.out.println("Thesis Title: " + g.thesisTitle);
    }
}