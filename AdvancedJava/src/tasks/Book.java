package tasks;

public class Book {
    String Author;
    String title;
    String isbn;
    boolean isBorrowed;
    static int totalBooks;
    {
        totalBooks ++;
    }
    Book(String Author , String title ,String isbn){
      this.Author=Author;
      this.title=title;
      this.isbn=isbn;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    public void borrowBooks(){
        if(isBorrowed){
            System.out.println("The book is already borrowed");
        }else{
            System.out.println("Book borrowed.......");
            totalBooks--;
            System.out.println("Total books : "+totalBooks);
            this.isBorrowed=true;
        }

    }
    public void returnBooks(){
        if(isBorrowed){
            System.out.println("Books returned......"+this.title);
            totalBooks++;
            System.out.println("Total books : "+totalBooks);
            this.isBorrowed = false;
        }else{
            System.out.println("The book is already returned..."+this.title);
        }

    }

    public static void getBooks(){
        System.out.println("Total number of books are "+totalBooks);
    }
}
