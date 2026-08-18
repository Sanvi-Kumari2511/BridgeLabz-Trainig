package Day_13_Section3_and_4;

public class Shape_01 {
    double area(){
        return 0;
    }
}
class Circle extends Shape_01 {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape_01 {
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return length*breadth;
    }
}

class Triangle extends Shape_01 {
    double base;
    double height;

    Triangle(double base,double height){
        this.base = base;
        this.height = height;
   }

    @Override
    double area(){
        return 0.5*base*height;
    }
}

class Main{
    public static void main(String[] args) {
        Shape_01[]  s = {
                new Circle(5),
                new Rectangle(10, 5),
                new Triangle(8,4)
        };

        for(int i = 0; i < s.length; i++){

            System.out.println(s[i].area());
        }
    }
}