public class Counter {
    
    private int startvalue;

     public Counter(int startValue) {
        this.startvalue = startValue;
     }

     public Counter() {
        this(0);
     }

     public int value() {
        return this.startvalue;
     }

     public void increase(int increaseBy) {

        if (increaseBy > 0) {
            this.startvalue += increaseBy;
        }
     }

     public void increase() {

        this.increase(1);
     }

     public void decrease(int decreaseBy) {

        if (decreaseBy > 0) {
            this.startvalue -= decreaseBy;
        }
     }

     public void decrease() {
        this.decrease(1);
     }
}
