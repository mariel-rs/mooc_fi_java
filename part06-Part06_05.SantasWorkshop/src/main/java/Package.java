import java.util.ArrayList;

public class Package {
    /* Create a Package class to which gifts can be added, and that keeps track 
    of the total weight of the gifts in the package. The class should contain:

    A parameterless constructor
    Method public void addGift(Gift gift), which adds the gift passed as a parameter 
    to the package. The method returns no value.
    Method public int totalWeight(), which returns the total weight of the 
    package's gifts.
 */

    private ArrayList<Gift> giftsInPackage;

    public Package() {
        this.giftsInPackage = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftsInPackage.add(gift);
    }

    public int totalWeight() {

        int weight = 0;
        for (Gift gift : giftsInPackage) {
            weight += gift.getWeight();
        }

        return weight;
    }


    
}
