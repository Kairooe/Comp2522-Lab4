package ca.bcit.comp2522.bookstore;

public class Author extends Person
{
    public Author(Name name,
                  Date birthDate,
                  Date deathDate)
    {

        super(name, birthDate, deathDate); // Call the appropriate constructor in Person
    }

}

