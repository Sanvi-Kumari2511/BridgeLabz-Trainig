package Day_12;

public class Rectangle_02 {
    int length;
    int width;

    Rectangle_02(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Rectangle_02(Rectangle_02 rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    public void scale(int factor) {
        length = length * factor;
        width = width * factor;

    }
}

 class Main2{
    public static void main(String[] args) {
        Rectangle_02 rect1 = new Rectangle_02(4, 5);
        //Rectangle rect2 = rect1;

       // rect2.scale(2);

        Rectangle_02 rect2 = new Rectangle_02(rect1);
        System.out.println(rect1.length);
        System.out.println(rect1.width);

    }
}
