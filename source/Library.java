import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void getAllTitles(){
        for (Book book: this.books) {
            System.out.println(book.getTitle());
        }
    }
}
