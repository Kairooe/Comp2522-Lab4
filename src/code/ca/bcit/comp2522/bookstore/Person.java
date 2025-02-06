package ca.bcit.comp2522.bookstore;

/**
 * Represents a Person with a name, birthdate, and optionally a death date.
 * Provides details about the person's birth and death information.
 *
 * @author Dominic Cheang
 * @version 1.0
 */
public class Person implements Comparable<Person>,
                               Printable,
                               Reversible
{
    public static final  String ALIVE_DETAILS_FORMAT    = "%s + (alive) was born on %s, %s %d, %d!";
    public static final  String DECEASED_DETAILS_FORMAT = "%s + (died %s, %s %d, %d) was born on %s, %s %d, %d!";
    private static final String BORN_STRING             = "was born on ";

    public final Name name;
    public final Date dateOfBirth;
    public final Date dateOfDeath;

    /**
     * Constructs a Person object with a name, birthdate, and a death date.
     *
     * @param name      the name of the person
     * @param dateOfBirth the birthdate of the person
     * @param dateOfDeath the death date of the person (null if the person is alive)
     */
    public Person(final Name name,
                  final Date dateOfBirth,
                  final Date dateOfDeath)
    {
        validateName(name);
        validateDateOfBirth(dateOfBirth);

        this.name        = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    /**
     * Constructs a Person object with a name and birthdate.
     *
     * @param name      the name of the person
     * @param dateOfBirth the birthdate of the person
     */
    public Person(final Name name,
                  final Date dateOfBirth)
    {
        validateName(name);
        validateDateOfBirth(dateOfBirth);

        this.name        = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = null;
    }


    public String getName() {
        return name.getFullName();
    }

    /*
     * Validates a name.
     */
    private static void validateName(final Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    /*
     * Validates a date of birth
     */
    private static void validateDateOfBirth(final Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("dateOfBirth cannot be null");
        }
    }

    /**
     * Compares people, older people are larger.
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(final Person other) {
        return other.dateOfBirth.getYyyyMmDd().compareTo(this.dateOfBirth.getYyyyMmDd());
    }

    /**
     * Displays the getDetails of a person
     */
    public void display() {
        System.out.print(this.getDetails());
    }

    /**
     * Reverses the name of a person
     */
    protected static String reverseString(final String name) {
        return new StringBuilder(name).reverse().toString();

    }

    /**
     * Print the persons name backward
     *
     */
    @Override
    public void backward() {
        System.out.println(reverseString(this.name.getFullName()));
    }

    /**
     * Gets the details of the person, including their birth and death information.
     *
     * @return a string containing the person's details
     */
    public String getDetails()
    {
        if(isAlive())
        {
            return String.format(ALIVE_DETAILS_FORMAT,
                                 name.getFullName(),
                                 dateOfBirth.getDayOfTheWeek().toLowerCase(),
                                 Date.getMonthName(dateOfBirth.getMonth()),
                                 dateOfBirth.getDay(),
                                 dateOfBirth.getYear());
        }
        return String.format(DECEASED_DETAILS_FORMAT,
                             name.getFullName(),
                             dateOfDeath.getDayOfTheWeek().toLowerCase(),
                             Date.getMonthName(dateOfDeath.getMonth()),
                             dateOfDeath.getDay(),
                             dateOfDeath.getYear(),
                             dateOfBirth.getDayOfTheWeek().toLowerCase(),
                             Date.getMonthName(dateOfBirth.getMonth()),
                             dateOfBirth.getDay(),
                             dateOfBirth.getYear());
    }

    /**
     * Determines if the person is alive.
     *
     * @return true if the person is alive, false otherwise
     */
    private boolean isAlive()
    {
        return dateOfDeath == null;
    }
}