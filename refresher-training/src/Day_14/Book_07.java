package Day_14;

import java.util.Scanner;

abstract class Book_07 {
    String title;
    String author;

    Book_07(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook1 extends Book_07{
    int price;


    MyBook1(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

}

class Solution5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();


        Book_07 book = new MyBook1(title, author, price);
        book.display();
    }
}
