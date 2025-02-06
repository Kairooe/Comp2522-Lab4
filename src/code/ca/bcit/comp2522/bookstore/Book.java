package ca.bcit.comp2522.bookstore;

/**
 * Represents a book with a title, publication year, and author.
 * Implements Comparable, Printable, and Reversible interfaces.
 *
 * @author Bullen Kosa
 * @version 1.0
 */
public class Book implements
        Comparable<Book>,
        Printable,
        Reversible {

    /* Maximum allowed length for a book title. */
    private static final int MAX_TITLE_LENGTH = 100;

    /* The current year used for validation. */
    private static final int CURRENT_YEAR = 2025;

    /* The minimum allowed publication year. */
    private static final int MIN_YEAR = 1;

    /* The title of the book. */
    private String title;

    /* The year the book was published. */
    private int yearPublished;

    /* The author of the book. */
    private Author author;

    /**
     * Constructs a new Book with the specified title, publication year, and author.
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     */
    public Book(final String title,
                final int yearPublished,
                final Author author) {
        isTitleValid(title);
        isYearPublishedValid(yearPublished);
        isAuthorValid(author);
        this.title         = title;
        this.yearPublished = yearPublished;
        this.author        = author;
    }

    /*
     * Validates the book title.
     *
     * @param title the title to validate
     */
    private static void isTitleValid(final String title) {
        if (title.isEmpty() || title.isBlank() || "null".equals(title)) {
            throw new IllegalArgumentException("Title cannot be blank or empty");
        } else if (title.length() > MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException("Title is too long (max " + MAX_TITLE_LENGTH + " characters)");
        }
    }

    /*
     * Validates the publication year.
     *
     * @param yearPublished the year to validate
     */
    private static void isYearPublishedValid(final int yearPublished) {
        if (yearPublished < MIN_YEAR) {
            throw new IllegalArgumentException("Year published cannot be less than or equal to " + MIN_YEAR);
        } else if (yearPublished > CURRENT_YEAR) {
            throw new IllegalArgumentException("Year published cannot be greater than the current year " + CURRENT_YEAR);
        }
    }

    /*
     * Validates the author name.
     *
     * @param author the author name to validate
     */
    private static void isAuthorValid(final Author author) {
        if ("null".equals(author)) {
            throw new IllegalArgumentException("Author cannot be blank or empty");
        }
    }

    /*
     * Reverses the given title.
     *
     * @param title the title to reverse
     * @return the reversed title
     */
    private static String reverseTitle(final String title) {
        return new StringBuilder(title).reverse().toString();
    }

    /**
     * Gets the authors name.
     *
     * @return the authors name
     */
    public String getAuthorName() {
        return author.getName();
    }

    /**
     * Compares this book to another book based on the publication year.
     *
     * @param o the other book to compare
     * @return a positive number if this book is newer, a negative number if older, and 0 if they are the same year
     */
    @Override
    public int compareTo(final Book o) {

        return Integer.compare(this.yearPublished, o.yearPublished);

    }

    /**
     * Displays the book details in a formatted output.
     */
    @Override
    public void display() {
        final StringBuilder bookDetails;
        bookDetails = new StringBuilder();
        bookDetails.append("\nTitle: ");
        bookDetails.append(title);
        bookDetails.append("\nYear Published: ");
        bookDetails.append(yearPublished);
        bookDetails.append("\nAuthor: ");
        bookDetails.append(author.getName());
        System.out.println(bookDetails);
    }

    /**
     * Prints the reversed title of the book.
     *
     * @return
     */
    public void backward() {
        System.out.println(reverseTitle(this.title));

    }
}
