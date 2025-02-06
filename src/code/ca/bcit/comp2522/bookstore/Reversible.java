package ca.bcit.comp2522.bookstore;

/**
 * An interface that allows objects to return a reversed version of their main attribute.
 * Implementing classes must define how their key data (such as name or title) is reversed.
 *
 * @author Kevin Tran, Bullen Kosa
 * @version 1.0
 */
public interface Reversible {
    /**
     * Prints a reversed version of the object's key attribute.
     *
     */
    void backward();
}
