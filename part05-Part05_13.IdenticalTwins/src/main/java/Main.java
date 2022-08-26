
public class Main {

    public static void main(String[] args) {
        // Test code here to try out the program

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", date, 65, 8);
        Person lily = new Person("Lily", date, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date2, 65, 8);

        boolean result = leo.equals(leoWithDifferentWeight);
        System.out.println(result);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
 
    }
}
