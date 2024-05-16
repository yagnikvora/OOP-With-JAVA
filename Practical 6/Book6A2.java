import java.util.*;

class Book {
    String author_name;

    Book(String a_name) {
        author_name = a_name;
    }

    void display() {
        System.out.println("Author : " + author_name);
    }
}

class Book_Publication extends Book {
    String title;

    Book_Publication(String a_name, String t) {
        super(a_name);
        title = t;
    }

    void display() {
        super.display();
        System.out.println("Book title : " + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    Paper_Publication(String a_name, String t) {
        super(a_name);
        title = t;
    }

    void display() {
        super.display();
        System.out.println("Paper title : " + title);
    }
}

public class Book6A2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter proper arguments :");
        } else {
            Book b = null;
            // Book b1 = new Book_Publication(args[0], args[1]);
            // Book p1 = new Paper_Publication(args[0], args[1]);
            if (args[1].equalsIgnoreCase("book"))
                b = new Book_Publication(args[0], args[2]);

            if (args[1].equalsIgnoreCase("paper"))
                b = new Paper_Publication(args[0], args[2]);

            b.display();
        }
    }
}
