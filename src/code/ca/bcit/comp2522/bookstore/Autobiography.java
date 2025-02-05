package ca.bcit.comp2522.bookstore;
/**
 * Represents an autobiography, a type of biography where the author and the subject are the same person.
 *
 * @author Bullen Kosa
 * @version 1.0
 */
public class Autobiography extends Biography {

    /* Format string for displaying autobiography details. */
    private static final String AUTOBIOGRAPHY_DISPLAY = "This book ( %s ) was written by %s.";

    /**
     * Constructs an Autobiography with the specified title, publication year, and author.
     * Since an autobiography is written by the subject, the author is also the subject.
     *
     * @param title         the title of the autobiography
     * @param yearPublished the year the autobiography was published
     * @param author        the author (and subject) of the autobiography
     */
    public Autobiography(final String title, final int yearPublished, Author author) {
        super(title, yearPublished, author, author);
    }

    /**
     * Displays the autobiography details, including the title and author.
     */
    public void display() {
        String autobiographyDetails = String.format(AUTOBIOGRAPHY_DISPLAY, title, yearPublished);
        System.out.println(autobiographyDetails);
    }
}