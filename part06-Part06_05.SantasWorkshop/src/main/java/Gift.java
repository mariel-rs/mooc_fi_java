public class Gift {
    /* Create a Gift class, where the objects instantiated from it represent 
    different kinds of gifts. The information that's recorded is the name and 
    weight of the item (kg).

Add the following methods to the class:

    Constructor for which the name and weight of the gift are given as parameters
    Method public String getName(), which returns the name of the gift
    Method public int getWeight(), which returns the weight of the gift
    Method public String toString(), which returns a string in the form "name (weight kg)"
 */

    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }


}
