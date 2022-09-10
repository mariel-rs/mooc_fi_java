import java.util.ArrayList;

public class Grade {
    
    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public Grade() {
        this.allPoints = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int pts) {

        if (pts >= 0 && pts <= 100) {
            this.allPoints.add(pts);

            if (pts >= 50) {
                this.passingPoints.add(pts);
            }

            this.calculateGrade(pts);
        }
    }

    private void calculateGrade(int pts) {
        
        if (pts < 50) {
            this.grades.add(0);
        }
        else if (pts >= 50 && pts < 60) {
            this.grades.add(1);
        }
        else if (pts >= 60 && pts < 70) {
            this.grades.add(2);
        }
        else if (pts >= 70 && pts < 80) {
            this.grades.add(3);
        }
        else if (pts >= 80 && pts < 90) {
            this.grades.add(4);
        }
        else {
            this.grades.add(5);
        }
    }

    private double getAverage() {

        int sum = 0;

        for (Integer pts : allPoints) {
            sum += pts;
        }
        
        return (double) sum / allPoints.size();
    }

    private double getPassingAverage() {

        int sum = 0;

        for (Integer pts : passingPoints) {

            sum += pts;
        }
        
        // avoid a division by zero
        if (sum == 0) {
            return 0;
        }
        
        return (double) sum / passingPoints.size();
    }

    private double getPassPercentage() {
        
        return 100.0 * this.passingPoints.size() / this.allPoints.size();
    }

    public void printStats(){
        
        System.out.println("Point average (all): " + this.getAverage());

        if (this.getPassingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.getPassingAverage());
        }
        
        System.out.println("Pass percentage: " + this.getPassPercentage());
        
    }

    public void printGradeDistribution() {
        
        int[] grades = {5, 4, 3, 2, 1, 0};

        for (int grade : grades) {
            System.out.println(gradeDistribution(grade));            
        }
    }

    private String gradeDistribution(int grade) {
        
        String output = grade + ": ";

        for (Integer studentGrade : this.grades) {
            if (studentGrade == grade) {
                output += "*";
            }
        }
        return output;
    }
}