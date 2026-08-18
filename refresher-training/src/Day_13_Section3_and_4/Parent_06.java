package Day_13_Section3_and_4;

public class Parent_06 {
    static void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent_06 {
    static void show(){
        System.out.println("Child");
    }
}

class Test{
    public static void main(String[] args) {
        Parent_06 p = new Child();

        //Reference type is Parent and method is static so reference type decides which method to call
        p.show(); //Parent method

    }
}