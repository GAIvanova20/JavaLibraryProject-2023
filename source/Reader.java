import java.util.ArrayList;
import java.util.List;
public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void rentBook(Library library, Book book){
        if(library.getBooks().contains(book)){
            library.removeBook(book);
            this.borrowedBooks.add(book);
        }
    }

    public void returnBook(Library library, Book book){
        if(library.getBooks().contains(book)){
            library.addBook(book);
            this.borrowedBooks.remove(book);
        }
    }

    public void getAllBooks(){
        for (Book book: borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }
}
