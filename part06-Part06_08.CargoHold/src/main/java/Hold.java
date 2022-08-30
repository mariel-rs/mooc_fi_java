import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private int weight = 0;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (suitcase.totalWeight() + this.weight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }    
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.weight + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.weight + " kg)";
    }
}
