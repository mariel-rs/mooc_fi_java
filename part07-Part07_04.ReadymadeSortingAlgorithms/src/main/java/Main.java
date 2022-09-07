import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringsArray = {"H", "Abc", "Whoop", "Cat", "Bean", "Dress"};

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(numbers, 3, 1, 5, 99, 3, 12);
        Collections.addAll(strings, "H", "Abc", "Whoop", "Cat", "Bean", "Dress");

        System.out.println(strings.toString());
        sortStrings(strings);
        System.out.println(strings.toString());

    }

     public static void sort(int[] array) {
        Arrays.sort(array);
     }

     public static void sort(String[] array) {
        Arrays.sort(array);
     }

     public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
     }

     public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
     }
}
