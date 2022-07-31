
public class Smallest {

    public static int smallest(int number1, int number2) {
        /* Define a two-parameter method smallest that returns the smaller of 
        the two numbers passed to it as parameters. */
        int smallest = 0;

        if (number1 < number2) {
            smallest = number1;
        } else if (number2 < number1) {
            smallest = number2;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int result = smallest(20, 7);
        System.out.println("Smallest: " + result);
    }
}
