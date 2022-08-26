public class Item {

    private String identifier;
    private String name;

    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    /* Modify the program so that after entering the items, each item is printed 
    at most once. Two items should be considered the same if their identifiers 
    are the same (there can be variation in their names in different countries, 
    for instance).

    If the user enters the same item multiple times, the print uses the item 
    that was added first. */

    @Override
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;
        
        if (this.identifier.equals(comparedItem.getIdentifier())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
