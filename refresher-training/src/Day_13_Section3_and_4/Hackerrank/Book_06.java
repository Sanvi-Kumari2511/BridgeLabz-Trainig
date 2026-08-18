package Day_13_Section3_and_4.Hackerrank;

import java.util.*;
abstract class Book_06 {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
       return title;
    }

}

//Write MyBook class here
class MyBook extends Book_06{
    void setTitle(String s){
     title = s;
    }
}

class Main{

    public static void main(String []args) {
     Scanner sc = new Scanner(System.in);
     String title = sc.nextLine();

     MyBook new_novel = new MyBook();
     new_novel.setTitle(title);

     System.out.println("The title is: " + new_novel.getTitle());
    }
}
