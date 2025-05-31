package Part_1;
public class Q2_Book {
    private int bookId;
    private String bookName;
    private double price;

    public Q2_Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Q2_Book book = (Q2_Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                bookName.equals(book.bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}

class Q2_Driver {
    public static void main(String[] args) {
        Q2_Book book1 = new Q2_Book(1, "Java Programming", 29.99);
        Q2_Book book2 = new Q2_Book(2, "Python Basics", 24.99);

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);

        if (book1.getPrice() > book2.getPrice()) {
            System.out.println(book1.getBookName() + " is more expensive than " + book2.getBookName());
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println(book2.getBookName() + " is more expensive than " + book1.getBookName());
        } else {
            System.out.println("Both books have the same price");
        }
    }
}

/*
Output:
Book 1: Book{bookId=1, bookName='Java Programming', price=29.99}
Book 2: Book{bookId=2, bookName='Python Basics', price=24.99}
Java Programming is more expensive than Python Basics
*/ 