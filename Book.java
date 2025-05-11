public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        Book book1 = new Book("Hotel Diablo", "Colson", "111");
        Book book2 = new Book("Justice", "Justin", "222");
        Book book3 = new Book("Java", "Kells", "333");

        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
    }

 {
    
}
}