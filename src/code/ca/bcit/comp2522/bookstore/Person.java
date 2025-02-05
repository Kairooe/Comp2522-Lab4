package ca.bcit.comp2522.bookstore;

/**
 * Represents a Person with a name, birthdate, and optionally a death date.
 * Provides details about the person's birth and death information.
 *
 * @author Dominic Cheang
 * @version 1.0
 */
public class Person
{
    public static final  String ALIVE_DETAILS_FORMAT    = "%s + (alive) was born on %s, %s %d, %d!";
    public static final  String DECEASED_DETAILS_FORMAT = "%s + (died %s, %s %d, %d) was born on %s, %s %d, %d!";
    private static final String BORN_STRING             = "was born on ";

    public final Name name;
    public final Date birthDate;
    public final Date deathDate;

    /**
     * Constructs a Person object with a name, birthdate, and optionally a death date.
     *
     * @param name      the name of the person
     * @param birthDate the birthdate of the person
     * @param deathDate the death date of the person (null if the person is alive)
     */
    public Person(final Name name,
                  final Date birthDate,
                  final Date deathDate)
    {
        this.name      = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public String getName() {
        return name.getFullName();
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
                                 birthDate.getDayOfTheWeek().toLowerCase(),
                                 Date.getMonthName(birthDate.getMonth()),
                                 birthDate.getDay(),
                                 birthDate.getYear());
        }
        return String.format(DECEASED_DETAILS_FORMAT,
                             name.getFullName(),
                             deathDate.getDayOfTheWeek().toLowerCase(),
                             Date.getMonthName(deathDate.getMonth()),
                             deathDate.getDay(),
                             deathDate.getYear(),
                             birthDate.getDayOfTheWeek().toLowerCase(),
                             Date.getMonthName(birthDate.getMonth()),
                             birthDate.getDay(),
                             birthDate.getYear());
    }

    /**
     * Determines if the person is alive.
     *
     * @return true if the person is alive, false otherwise
     */
    private boolean isAlive()
    {
        return deathDate == null;
    }
}