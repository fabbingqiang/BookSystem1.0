public class Book {
    String title;
    String author;
    double price;
    private boolean isBorrowed;
    private String borrower;
    private String Isbn;

    public Book(String title, String author, double price, String Isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        isBorrowed = false;
        borrower = null;
        this.Isbn = Isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


    public void setIsbn() {
        this.Isbn = Isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("书名：" + title + "作者：" + author + "价格：" + price);
    }

    public void borrowBookpeople() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(borrower + "borrowing successful");
            System.out.println("book is borrowed");
        } else {
            System.out.println("book is already borrowed");
        }
    }


    public void returnBook() {
        if (isBorrowed) {
            borrower = null;
            isBorrowed = false;
        } else {
            System.out.println("book is not borrowed");
        }
    }

    public String getStatus() {
        if (isBorrowed) {
            return "已借出";
        } else {
            return "在库";
        }
    }

    public void displayInfo() {
        System.out.println("书名：" + "《" + title + "》" + "作者：" + author + "价格：" + price + "借出状态：" + getStatus() + "ISBN：" + Isbn);
    }


    public String getIsbn() {
        return Isbn;
    }

    @Override
    public String toString() {
        return "书名：" + "《" + title + "》" + "作者：" + author + "价格：" + price + "借出状态：" + getStatus() + "ISBN：" + getIsbn();
    }

    public void returnBook(String isbn3) {
        isBorrowed = false;
    }

}



