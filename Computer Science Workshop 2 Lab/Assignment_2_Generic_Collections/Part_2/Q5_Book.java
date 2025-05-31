package Part_2;
import java.util.HashMap;
import java.util.Map;

public class Q5_Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Q5_Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class Q5_Library {
    private HashMap<Integer, Q5_Book> books = new HashMap<>();

    public void addBook(Q5_Book book) {
        books.put(book.getId(), book);
    }

    public void displayBooks() {
        System.out.println("Books in library:");
        for (Map.Entry<Integer, Q5_Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public boolean containsBookName(String name) {
        for (Q5_Book book : books.values()) {
            if (book.getName().equals(name)) return true;
        }
        return false;
    }

    public void removeBookById(int id) {
        books.remove(id);
    }
}

class Q5_Driver {
    public static void main(String[] args) {
        Q5_Library library = new Q5_Library();
        Q5_Book b1 = new Q5_Book(1, "Java", "James Gosling", 5);
        Q5_Book b2 = new Q5_Book(2, "Python", "Guido van Rossum", 3);
        library.addBook(b1);
        library.addBook(b2);
        library.displayBooks();

        // (a) Check if a book name is present
        System.out.println("\nContains 'Java'? " + library.containsBookName("Java"));
        System.out.println("Contains 'C++'? " + library.containsBookName("C++"));

        // (b) Remove a book by id
        library.removeBookById(1);
        System.out.println("\nAfter removing book with id 1:");
        library.displayBooks();
    }
}

/*
Output:
Books in library:
Book{id=1, name='Java', author='James Gosling', quantity=5}
Book{id=2, name='Python', author='Guido van Rossum', quantity=3}

Contains 'Java'? true
Contains 'C++'? false

After removing book with id 1:
Books in library:
Book{id=2, name='Python', author='Guido van Rossum', quantity=3}
*/ 