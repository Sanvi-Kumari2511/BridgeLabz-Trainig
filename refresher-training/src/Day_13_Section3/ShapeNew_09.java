package Day_13_Section3;

public class ShapeNew_09 {
    void draw(){
        System.out.println("Shape");
    }
}

class Shape2D extends ShapeNew_09 {
    @Override
    void draw(){
        System.out.println("2D Shape");
    }

    //Overloading
    void draw(String color){
        System.out.println("2D Shape in : " + color + " color");
    }
}

class Main7{
    public static void main(String[] args) {
        Shape2D s = new Shape2D();

        //Overridden method
        s.draw();

        //Overloaded method
        s.draw("Red");
    }
}