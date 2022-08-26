
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    /* Create a method public boolean largerThan(Apartment compared) that 
    returns true if the apartment object whose method is called has a larger 
    total area than the apartment object that is being compared. */

    public boolean largerThan(Apartment compare) {
        
        return this.squares > compare.squares;
    }

    private int price() {
        //Auxiliary method for calculating the apartment price
        return this.pricePerSquare * this.squares;
    }

    public int priceDifference(Apartment compared) {

        return Math.abs(this.price() - compared.price());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        
        return this.price() > compared.price();
    }

}
