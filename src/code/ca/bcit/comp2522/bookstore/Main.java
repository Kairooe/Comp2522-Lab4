package ca.bcit.comp2522.bookstore;

/**
 * The Main class for running the Bookstore system simulation.
 * It creates books, biographies, and autobiographies, and performs operations on them.
 *
 * @author Kevin Tran
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Create Authors
        Author orwell = new Author(new Name("George", "Orwell"), new Date(1903, 6, 25), new Date(1950, 1, 21), "Dystopian");
        Author lee = new Author(new Name("Harper", "Lee"), new Date(1926, 4, 28), new Date(2016, 2, 19), "Fiction");
        Author austen = new Author(new Name("Jane", "Austen"), new Date(1775, 12, 16), new Date(1817, 7, 18), "Romance");
        Author fitzgerald = new Author(new Name("F. Scott", "Fitzgerald"), new Date(1896, 9, 24), new Date(1940, 12, 21), "Classic");
        Author melville = new Author(new Name("Herman", "Melville"), new Date(1819, 8, 1), new Date(1891, 9, 28), "Adventure");

        // Create Books
        Book book1 = new Book("1984", 1949, orwell);
        Book book2 = new Book("To Kill a Mockingbird", 1960, lee);
        Book book3 = new Book("Pride and Prejudice", 1813, austen);
        Book book4 = new Book("The Great Gatsby", 1925, fitzgerald);
        Book book5 = new Book("Moby-Dick", 1851, melville);

        // Display Books
        System.out.println("\nBooks:");
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        // Display Titles Backward
        System.out.println("\nReversed Titles:");
        book1.backward();
        System.out.println("\n");
        book2.backward();
        System.out.println("\n");
        book3.backward();
        System.out.println("\n");
        book4.backward();
        System.out.println("\n");
        book5.backward();

        // Compare Books by Year
        System.out.println("\nComparisons:");
        System.out.println("Comparing '1984' and 'Pride and Prejudice': " + book1.compareTo(book3));
    }
}
