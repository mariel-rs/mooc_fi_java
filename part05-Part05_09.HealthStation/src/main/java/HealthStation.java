
public class HealthStation {

    private int countWeights;

    public HealthStation() {
        this.countWeights = 0;
    }

    public int weigh(Person person) {

        // Update the times a person has been weighted
        this.countWeights++;

        return person.getWeight();
    }

    public void feed(Person person) {
        
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        
        return this.countWeights;
    }

}
