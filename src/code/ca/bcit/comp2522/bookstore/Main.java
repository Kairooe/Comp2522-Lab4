package ca.bcit.comp2522.bookstore;

/**
 * A driver displaying a bookstore and its many functions.
 *
 * @author Bullen Kosa, Kevin tran
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // Declare all Name objects
        final Name orwellName;
        final Name leeName;
        final Name austenName;
        final Name fitzgeraldName;
        final Name melvilleName;

        final Name caroName;
        final Name isaacson1Name;
        final Name gilbertName;
        final Name chernowName;
        final Name isaacson2Name;

        final Name robertMosesName;
        final Name steveJobsName;
        final Name winstonChurchillName;
        final Name alexanderHamiltonName;
        final Name albertEinsteinName;

        // Declare all Date objects
        final Date orwellDOB;
        final Date leeDOB;
        final Date austenDOB;
        final Date fitzgeraldDOB;
        final Date melvilleDOB;

        final Date caroDOB;
        final Date isaacson1DOB;
        final Date gilbertDOB;
        final Date chernowDOB;
        final Date isaacson2DOB;

        final Date robertMosesDOB;
        final Date steveJobsDOB;
        final Date winstonChurchillDOB;
        final Date alexanderHamiltonDOB;
        final Date albertEinsteinDOB;


        final Date orwellDOD;
        final Date leeDOD;
        final Date austenDOD;
        final Date fitzgeraldDOD;
        final Date melvilleDOD;

        final Date robertMosesDOD;
        final Date steveJobsDOD;
        final Date winstonChurchillDOD;
        final Date alexanderHamiltonDOD;
        final Date albertEinsteinDOD;


        final Date gilbertDOD;

        // Declare all Person objects
        final Person robertMoses;
        final Person steveJobs;
        final Person winstonChurchill;
        final Person alexanderHamilton;
        final Person albertEinstein;

        // Declare all Author objects
        final Author orwell;
        final Author lee;
        final Author austen;
        final Author fitzgerald;
        final Author melville;

        final Author caro;
        final Author isaacson1;
        final Author gilbert;
        final Author chernow;
        final Author isaacson2;

        // Declare all Book objects
        final Book book1;
        final Book book2;
        final Book book3;
        final Book book4;
        final Book book5;

        // Declare all Biography objects
        final Biography bio1;
        final Biography bio2;
        final Biography bio3;
        final Biography bio4;
        final Biography bio5;
        final Biography bioTest;

        // Declare all Autobiography objects
        final Autobiography auto1;
        final Autobiography auto2;
        final Autobiography auto3;
        final Autobiography auto4;
        final Autobiography auto5;

        // Initialize Name objects
        orwellName = new Name("George", "Orwell");
        leeName = new Name("Harper", "Lee");
        austenName = new Name("Jane", "Austen");
        fitzgeraldName = new Name("F. Scott", "Fitzgerald");
        melvilleName = new Name("Herman", "Melville");

        caroName = new Name("Robert", "Caro");
        isaacson1Name = new Name("Walter", "Isaacson");
        gilbertName = new Name("Martin", "Gilbert");
        chernowName = new Name("Ron", "Chernow");
        isaacson2Name = new Name("Walter", "Isaacson");

        robertMosesName = new Name("Robert", "Moses");
        steveJobsName = new Name("Steve", "Jobs");
        winstonChurchillName = new Name("Winston", "Churchill");
        alexanderHamiltonName = new Name("Alexander", "Hamilton");
        albertEinsteinName = new Name("Albert", "Einstein");


        // Initialize Date objects
        orwellDOB = new Date(1903, 6, 25);
        leeDOB = new Date(1926, 4, 28);
        austenDOB = new Date(1775, 12, 16);
        fitzgeraldDOB = new Date(1896, 9, 24);
        melvilleDOB = new Date(1819, 8, 1);

        caroDOB = new Date(1935, 10, 30);
        isaacson1DOB = new Date(1952, 5, 20);
        gilbertDOB = new Date(1936, 10, 25);
        chernowDOB = new Date(1949, 3, 2);
        isaacson2DOB = new Date(1952, 5, 20);

        robertMosesDOB = new Date(1888, 12, 18);
        steveJobsDOB = new Date(1955, 2, 24);
        winstonChurchillDOB = new Date(1874, 11, 30);
        alexanderHamiltonDOB = new Date(1755, 1, 11);
        albertEinsteinDOB = new Date(1879, 3, 14);

        orwellDOD = new Date(1950, 1, 21);
        leeDOD = new Date(2016, 2, 19);
        austenDOD = new Date(1817, 7, 18);
        fitzgeraldDOD = new Date(1940, 12, 21);
        melvilleDOD = new Date(1891, 9, 28);

        robertMosesDOD = new Date(1981, 7, 29);
        steveJobsDOD = new Date(2011, 10, 5);
        winstonChurchillDOD = new Date(1965, 1, 24);
        alexanderHamiltonDOD = new Date(1804, 7, 12);
        albertEinsteinDOD = new Date(1955, 4, 18);

        gilbertDOD = new Date(2015, 2, 3);

        // Initialize Person objects
        robertMoses = new Person(robertMosesName, robertMosesDOB, robertMosesDOD);
        steveJobs = new Person(steveJobsName, steveJobsDOB, steveJobsDOD);
        winstonChurchill = new Person(winstonChurchillName, winstonChurchillDOB, winstonChurchillDOD);
        alexanderHamilton = new Person(alexanderHamiltonName, alexanderHamiltonDOB, alexanderHamiltonDOD);
        albertEinstein = new Person(albertEinsteinName, albertEinsteinDOB, albertEinsteinDOD);

        // Initialize Author objects
        orwell = new Author(orwellName, orwellDOB, orwellDOD, "Dystopian");
        lee = new Author(leeName, leeDOB, leeDOD, "Fiction");
        austen = new Author(austenName, austenDOB, austenDOD, "Romance");
        fitzgerald = new Author(fitzgeraldName, fitzgeraldDOB, fitzgeraldDOD, "Classic");
        melville = new Author(melvilleName, melvilleDOB, melvilleDOD, "Adventure");

        caro = new Author(caroName, caroDOB, null, "Biography");
        isaacson1 = new Author(isaacson1Name, isaacson1DOB, null, "Biography");
        gilbert = new Author(gilbertName, gilbertDOB, gilbertDOD, "Biography");
        chernow = new Author(chernowName, chernowDOB, null, "Biography");
        isaacson2 = new Author(isaacson2Name, isaacson2DOB, null, "Biography");

        // Initialize Book objects
        book1 = new Book("1984", 1949, orwell);
        book2 = new Book("To Kill a Mockingbird", 1960, lee);
        book3 = new Book("Pride and Prejudice", 1813, austen);
        book4 = new Book("The Great Gatsby", 1925, fitzgerald);
        book5 = new Book("Moby-Dick", 1851, melville);

        // Initialize Biography objects
        bio1 = new Biography("The Power Broker", 1974, caro, robertMoses);
        bio2 = new Biography("Steve Jobs", 2011, isaacson1, steveJobs);
        bio3 = new Biography("Churchill: A Life", 1991, gilbert, winstonChurchill);
        bio4 = new Biography("Alexander Hamilton", 2004, chernow, alexanderHamilton);
        bio5 = new Biography("Einstein: His Life and Universe", 2007, isaacson2, albertEinstein);
        bioTest = new Biography("Different from first", 2007, isaacson2, albertEinstein);

        // Initialize Autobiography objects
        auto1 = new Autobiography("The Diary of a Young Girl", 1947, orwell);
        auto2 = new Autobiography("Long Walk to Freedom", 1994, lee);
        auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, austen);
        auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, fitzgerald);
        auto5 = new Autobiography("The Autobiography of Malcolm X", 1965, melville);

        // Get Details
        System.out.println("\nWelcome to the Bookstore!:");
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        // Display Titles Backward
        System.out.println("\nReversed Titles:");
        book1.backward();
        System.out.println("\n");
        book2.backward();
        System.out.println("\n");
        book3.backward();
        System.out.println("\n");
        book4.backward();
        System.out.println("\n");
        book5.backward();
        System.out.println("\n");

        // Compare Books by Publication Year
        System.out.println(book1.compareTo(book2) > 0 ? "First book is newer." : "Second book is newer.");
        System.out.println(book2.compareTo(book1) > 0 ? "First book is newer." : "Second book is newer.");

        // Check Author Comparisons
        System.out.println(austen.compareTo(fitzgerald) > 0 ? "First author is older." : "Second author is older.");
        System.out.println(fitzgerald.compareTo(austen) > 0 ? "First author is older." : "Second author is older.");

        // Equality Check
        System.out.println(bio1.equals(bio2) ? "Biographies are equal." : "Biographies are not equal.");
        System.out.println(bio5.equals(bioTest) ? "Biographies are equal." : "Biographies are not equal.");
    }
}
