package ca.bcit.comp2522.bookstore;

/**
 * Represents an Author, which is a type of Person.
 * Includes a genre and implements the Printable interface.
 *
 * @author Kevin Tran, Bullen Kosa
 * @version 1.0
 */
public class Author extends Person implements Printable {

    /* The maximum length of a genre name. */
    private static final int MAX_GENRE_LENGTH = 30;

    /* A genre. */
    private final String genre;

    /**
     * Constructs an Author object with a name, birthdate, optional death date, and genre.
     *
     * @param name      the name of the author
     * @param birthDate the birthdate of the author
     * @param deathDate the death date of the author (null if alive)
     * @param genre     the genre of books written by the author
     * @throws IllegalArgumentException if the genre is null, blank, or exceeds 30 characters
     */
    public Author(final Name name,
                  final Date birthDate,
                  final Date deathDate,
                  final String genre) {
        super(name,
              birthDate,
              deathDate);
        validateGenre(genre);
        this.genre = genre;
    }

    /**
     * Constructs an Author object with a name, birthdate, optional death date, and genre.
     *
     * @param name      the name of the author
     * @param birthDate the birthdate of the author
     * @param genre     the genre of books written by the author
     * @throws IllegalArgumentException if the genre is null, blank, or exceeds 30 characters
     */
    public Author(final Name name,
                  final Date birthDate,
                  final String genre) {
        super(name,
              birthDate);
        validateGenre(genre);
        this.genre = genre;
    }

    /**
     * Validates the genre to ensure it is not null, blank, or too long.
     *
     * @param genre the genre to validate
     * @throws IllegalArgumentException if the genre is invalid
     */
    private void validateGenre(final String genre) {
        if (genre == null || genre.isBlank() || genre.length() > MAX_GENRE_LENGTH) {
            throw new IllegalArgumentException("Genre must be non-null and non-blank.");
        }
        if (genre.length() > MAX_GENRE_LENGTH)
            throw new IllegalArgumentException("Genre must not be longer than 30 characters.");
    }

    /**
     * Gets the genre of the author.
     *
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Prints the details of the author, including name, birth/death details, and genre.
     */
    @Override
    public void display() {
        System.out.println(getDetails() + " They write in the " + genre + " genre.");
    }

}
