

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(1);

    }
    public static void printFromNumberToOne(int number) {
        
        for (int i = number; i >= 1; i--) {
            System.out.println(i);    
        }
    }

}
