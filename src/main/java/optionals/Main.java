package optionals;

import oca.Book;

import java.util.Optional;

public class Main extends Book {
    String author;

    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending mail to " + email),
                        () -> System.out.println("Cannot send email"));
    }

    public void set() {
        System.out.println(super.author);
    }
}
