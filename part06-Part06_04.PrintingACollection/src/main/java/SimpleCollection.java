
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {

        String printOutput = "The collection " + this.name + " ";
        
        if (this.elements.isEmpty()) {
            return printOutput + "is empty.";
        }

        // There is at least one element in the collection
        if (this.elements.size() == 1) {
            printOutput += "has 1 element:";
        }
        else {
            printOutput += "has " + this.elements.size() + " elements:";
        }

        for (String elem : this.elements) {
            printOutput += "\n" + elem; 
        }

        return printOutput;

    }
}
