
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        
        // initialize sum
        int sum = 0;

        for (int elem : array) {
            sum += elem;
        }
        
        return sum;
    }
}
