import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> listStrings;

    public Stack() {
        this.listStrings = new ArrayList<>();
    }

    public boolean isEmpty() {
        
        if (this.listStrings.size() > 0) {
            return false;
        }

        return true;
    }

    public void add(String value) {
        
        this.listStrings.add(0, value);
    }

    public ArrayList<String> values() {
        
        return this.listStrings;
    }

    public String take() {
        
        String element = this.listStrings.get(0);
        this.listStrings.remove(0);

        return element;
    }
}
