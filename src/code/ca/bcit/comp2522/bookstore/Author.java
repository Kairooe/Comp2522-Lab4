package ca.bcit.comp2522.bookstore;

/**
 * Represents an Author, which is a type of Person.
 * Includes a genre and implements the Printable interface.
 *
 * @author Kevin Tran
 * @version 1.0
 */
public class Author extends Person implements Printable, Reversible
{
    private static final int    MAX_GENRE_LENGTH = 30;
    private final        String genre;

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
                  final String genre)
    {
        super(name,
              birthDate,
              deathDate);
        validateGenre(genre);
        this.genre = genre;
    }

    /**
     * Validates the genre to ensure it is not null, blank, or too long.
     *
     * @param genre the genre to validate
     * @throws IllegalArgumentException if the genre is invalid
     */
    private void validateGenre(final String genre)
    {
        if(genre == null || genre.isBlank() || genre.length() > MAX_GENRE_LENGTH)
        {
            throw new IllegalArgumentException("Genre must be non-null, non-blank, and at most 30 characters.");
        }
    }

    /**
     * Gets the genre of the author.
     *
     * @return the genre
     */
    public String getGenre()
    {
        return genre;
    }

    private static String reverseAuthor(final Author author) {
        return new StringBuilder(author.getName()).reverse().toString();
    }

    /**
     * Prints the details of the author, including name, birth/death details, and genre.
     */
    @Override
    public void display()
    { System.out.println(getDetails() + " They write in the " + genre + " genre."); }

    /**
     * print author name backward
     *
     * @return author full name but backward
     */
    @Override
    public void backward() {
        System.out.println(reverseAuthor(this));
    }
}
