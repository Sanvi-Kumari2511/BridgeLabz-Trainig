package Day_12;

public class Book_01 {
    String title;
    String author;
    String isBn;
    static int totalBooksInLibrary = 0;
    static int totalBooksCheckedOut = 0;

    Book_01(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;

        totalBooksInLibrary++;
    }

    public void checkOut() {
        totalBooksCheckedOut++;

    }

    public void returnBook() {
        totalBooksCheckedOut--;
    }
}

 class Main1 {
    public static void main(String[] args) {
        Book_01 b1 = new Book_01("Java", "James Gosling", "ISBN01");
        Book_01 b2 = new Book_01("Train to Pakistan", "Khushwant Singh", "ISBN02");
        Book_01 b3 = new Book_01("The White Tiger", "Aravind Adiga", "ISBN03");
        Book_01 b4 = new Book_01("Five Point Someone", "Chetan Bhagat", "ISBN04");
        Book_01 b5 = new Book_01("Malgudi Dyas", "R.K Narayan", "ISBN05");


        b1.checkOut();
        b2.checkOut();
        b3.checkOut();


        b2.returnBook();

        System.out.println(Book_01.totalBooksInLibrary);
        System.out.println(Book_01.totalBooksCheckedOut);
    }
}
