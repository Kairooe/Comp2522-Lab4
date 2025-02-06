package ca.bcit.comp2522.bookstore;

/**
 * Represents a person's name with a first and last name, providing various
 * utility methods for validation and manipulation of the name.
 *
 * @author Sehaj Singh Gill, Bullen Kosa
 * @version 1.0
 */
public class Name implements Printable
{

    /*
     * The maxmimum characters allowed for a first or last name.
     */
    private static final int    MAX_NAME_LENGTH = 50;

    /*
     * The first name of the person.
     */
    private final String first;

    /*
     * T`he last name of the person.
     */
    private final String last;

    /**
     * Constructs a new {@code ca.bcit.comp2522.bank.Name} object with
     * the specified first and last names.
     *
     * @param first the first name of the person; cannot be null, blank, or exceed
     *              {@link #MAX_NAME_LENGTH} characters.
     * @param last  the last name of the person; cannot be null, blank, or exceed
     *              {@link #MAX_NAME_LENGTH} characters.
     * @throws IllegalArgumentException if any of the arguments are invalid.
     */
    public Name(final String first, final String last)
    {
        validateFirstName(first);
        validateLastName(last);
        this.first = first;
        this.last  = last;
    }

    /*
     *Validates the first name.
     */
    private static void validateFirstName(final String first) {
        if (first == null || first.isBlank())
        {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (first.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("First name cannot exceed " + MAX_NAME_LENGTH + " characters");
        }

    }

    /*
     * Validates the last name.
     */
    private static void validateLastName(final String last) {
        if (last == null || last.isBlank())
        {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        if (last.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Last name cannot exceed " + MAX_NAME_LENGTH + " characters");
        }

    }

    /**
     * Returns the first name of the person.
     *
     * @return the first name.
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Returns the last name of the person.
     *
     * @return the last name.
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Returns the initials of the person in the format "F.L.".
     *
     * @return the initials of the person.
     */
    public String getInitials()
    {
        return (first.trim().toUpperCase().charAt(0) + "." + last.trim().toUpperCase().charAt(0) + ".");
    }

    /*
     * Capitalizes the given name by making the first letter uppercase and the
     * remaining letters lowercase.
     *
     * @param name the name to capitalize.
     * @return the capitalized name.
     */
    private String capitalize(String name)
    {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    /**
     * Returns the full name of the person in the format "First Last",
     * with proper capitalization.
     *
     * @return the full name of the person.
     */
    public String getFullName()
    {
        return capitalize(first) + " " + capitalize(last);
    }

    /**
     * Prints the full name of the user.,
     */
    public void display() {

        System.out.print(getFullName());
    }

    /**
     * Returns the reverse of the full name (first and last names combined).
     *
     * @return the reversed full name.
     */
    public String getReverseName()
    {
        String fullName = first + " " + last;
        return new StringBuilder(fullName).reverse().toString();
    }

}



