package ca.bcit.comp2522.bookstore;

public class Book implements Comparable<Book>,
                             Printable,
                             Reversible
{

<<<<<<< Updated upstream
    protected String title;

    protected int yearPublished;

    protected String author;

    private static final int MAX_TITLE_LENGTH = 100;

    private static final int CURRENT_YEAR = 2025;

    private static final int MIN_YEAR = 1;

    public Book(final String title,
                final int yearPublished,
                final String author) {

        isTitleValid(title);
        isYearPublishedValid(yearPublished);
        isAuthorValid(author);
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    private static void isTitleValid(final String title) {
        if (title.isEmpty() || title.isBlank() || title == "null") {
            throw new IllegalArgumentException("Title cannot be blank or empty");
        } else if (title.length() > MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException("Title is too long (max " + MAX_TITLE_LENGTH + " characters)");
        }
    }

    private static void isYearPublishedValid(final int yearPublished) {
        if (yearPublished < MIN_YEAR) {
            throw new IllegalArgumentException("Year published cannot be less than or equal to the year " + MIN_YEAR);
        } else if (yearPublished > CURRENT_YEAR) {
            throw new IllegalArgumentException("Year published cannot be greater than the current year " + CURRENT_YEAR);
        }
    }

    private static void isAuthorValid(final String author) {
        if (author.isEmpty() || author.isBlank() || author == "null") {
            throw new IllegalArgumentException("Author cannot be blank or empty");
        }
    }


    @Override
    public int compareTo(final Book o) {
        return (this.yearPublished > o.yearPublished) ? 1 : ((this.yearPublished < o.yearPublished) ? -1 : 0);
    }







=======
>>>>>>> Stashed changes
}
