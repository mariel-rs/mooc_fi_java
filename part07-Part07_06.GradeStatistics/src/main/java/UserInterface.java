import java.util.Scanner;

public class UserInterface {
    
    private Scanner scan;
    private Grade grade;

    public UserInterface(Grade grade, Scanner scan) {
        this.scan = scan;
        this.grade = grade;
    }

    public void start() {
        
        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int points = Integer.valueOf(this.scan.nextLine());

            if (points == -1) {
                break;
            }

            this.grade.addPoints(points);
        }

        this.grade.printStats();
        this.grade.printGradeDistribution();
    }
}
