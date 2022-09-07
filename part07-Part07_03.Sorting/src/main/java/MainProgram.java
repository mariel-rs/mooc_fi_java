import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};

        sort(array);
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int item : array) {
            if (item < smallest) {
                smallest = item;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        
        int smallestIdx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIdx]) {
                smallestIdx = i;
            }
        }
        
        return smallestIdx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int smallestIdx = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            
            if (table[i] < table[smallestIdx]) {
                smallestIdx = i;
            }
        }

        return smallestIdx;
    }

    public static void swap(int[]array, int index1, int index2) {
        
        int tmp = array[index1];

        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        
        int i = 0;

        while (i < array.length) {
            
            System.out.println(Arrays.toString(array));
            int smallestIdx = indexOfSmallestFrom(array, i);

            swap(array, i, smallestIdx);

            i += 1;
        }
    }
}