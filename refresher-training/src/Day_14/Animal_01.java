package Day_14;

public class Animal_01 {
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal_01{
    void fly()
    {
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}



class Solution{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
