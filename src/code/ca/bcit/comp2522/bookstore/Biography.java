package ca.bcit.comp2522.bookstore;

public class Biography extends Book
{

    private Person person;

    public Biography(Person person) {

        super();
        isPersonValid(person);
        this.person = person;
    }

    private static void isPersonValid(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("person cannot be null");
        }
    }





}
