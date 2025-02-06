package ca.bcit.comp2522.bookstore;

import java.util.Objects;

/**
 * Represents a biography book, which extends the Book class.
 * A biography includes a subject who is the focus of the book.
 *
 * @author Bullen Kosa
 * @version 1.0
 */
public class Biography extends Book {

    /* The subject of the biography. */
    private Person subject;

    /* Format string for displaying biography details. */
    private static final String BIOGRAPHY_DISPLAY = "Subject: %s";

    /**
     * Constructs a Biography with the specified title, publication year, author, and subject.
     *
     * @param title         the title of the biography
     * @param yearPublished the year the biography was published
     * @param author        the author of the biography
     * @param subject       the subject of the biography
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject) {
        super(title, yearPublished, author);
        isSubjectValid(subject);
        this.subject = subject;
    }

    /*
     * Validates the subject of the biography.
     *
     * @param subject the subject to validate
     */
    private static void isSubjectValid(final Person subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null");
        }
    }

    /**
     * Displays the biography details, including the book details and subject.
     */
    public void display() {
        super.display();
        String biographyDetails = String.format(BIOGRAPHY_DISPLAY, subject.getName());
        System.out.println(biographyDetails);
    }

    /**
     * Checks if this biography is equal to another object.
     * Two biographies are considered equal if they have the same subject.
     *
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Biography other = (Biography) obj;
        return this.subject == other.subject;
    }

    /**
     * Computes the hash code for this biography.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }
}
