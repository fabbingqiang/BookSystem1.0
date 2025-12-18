
import java.util.ArrayList;
import java.util.HashMap;


public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final HashMap<String, Book> bookMap = new HashMap<>();//isbn


    /*public void addBook(Book book) {
        books.add(book);
        System.out.println("Book" + book.getTitle() + "added successfully.");
    }*/
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getIsbn(), book);
        System.out.println("Book" + book.getTitle() + "added successfully.");
    }


    public void removeBook(Book book) {
        books.remove(book);
    }


    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (title != null && title.equals(b.getTitle())) {
                return b;
            }
        }
        return null;
    }


    public void listAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
        if (books.isEmpty()) {
            System.out.println("No books found.");
        }
    }


    //borrow book
    public boolean borrowBook(String title) {
        Book b = findBookByTitle(title);
        if (b != null) {
            b.borrowBookpeople();
            return true;
        }
        return false;
    }


    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn() != null && book.getIsbn().equals(isbn)) {  // 修改此行
                return book;
            }
        }
        return null;
    }


    public void returnBook(String isbn3) {
        Book book = findBookByISBN(isbn3);
        if (book != null) {
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}

