import java.util.ArrayList;

public class Room {

    private ArrayList<Person> listOfPersons;

    public Room() {
        this.listOfPersons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.listOfPersons.add(personToAdd);
    }

    public boolean isEmpty() {
        if (this.listOfPersons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.listOfPersons;
    }

    public Person shortest() {
        
        if (this.listOfPersons.isEmpty()) {
            return null;
        }

        Person shortestperson = this.listOfPersons.get(0);
        
        for (Person person : listOfPersons) {
            if (person.getHeight() < shortestperson.getHeight()) {
                shortestperson = person;
            }
        }

        return shortestperson;
    }

    public Person take() {

        Person shortest = this.shortest();
        
        this.listOfPersons.remove(shortest);
        
        return shortest;
    }
}
