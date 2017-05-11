/**
 * Created by NafisaBarlaskar on 10-01-2017.
 */
public class Book {

    int bookId;
    String bookName;
    String bookAuthor;
    String bookPublisher;


    public Book(int bookId, String bookAuthor, String bookName, String bookPublisher){
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookPublisher = bookPublisher;
    }
}
