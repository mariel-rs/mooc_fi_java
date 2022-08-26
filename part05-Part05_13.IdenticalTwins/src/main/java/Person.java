
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    /* Add to the class Person the method public boolean equals (Object compared), 
    which can be used to compare the similarity of people. The comparison 
    should take into account the equality of all the variables of a person 
    (birthday included). */

    @Override
    public boolean equals(Object compared) {

        // If the variables are located in the same position, it's the same obj
        if (this == compared) {
            return true;
        }

        // If the compared Object is not of the type Song, they can't the same
        if (!(compared instanceof Person)) {
            return false;
        }

        // Cast the object to a Person type for proceeding with comparisons
        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name) &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height) {
            return true;
        }

        // They aren't the same Person
        return false;     
    }
}
