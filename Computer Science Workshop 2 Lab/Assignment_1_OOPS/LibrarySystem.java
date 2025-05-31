abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
        System.out.println();
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
        System.out.println();
    }
}

class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Director: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
        System.out.println();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryResource book = new Book("Java Programming", "John Doe", 500);
        LibraryResource magazine = new Magazine("Tech Monthly", "Jane Smith", "January 2025");
        LibraryResource dvd = new DVD("Science Documentary", "Dr. Brown", 120);

        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
