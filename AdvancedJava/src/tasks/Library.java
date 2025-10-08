package tasks;

public class Library {
    static void main(String[] args) {
        Book book = new Book("2112");
        Book book2 = new Book("Hari Bahadur","Mero jiwani","21155222");
        Book book3 = new Book("Hari Bahadur","Mero jiwani","21155222");

        Book.getBooks();
        book.borrowBooks();
        book.returnBooks();
        book.returnBooks();
        book2.borrowBooks();
        book2.borrowBooks();

    }

}
