import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained in Physics: ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in Chemistry: ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in Biology: ");
        double biologyMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in Mathematics: ");
        double mathematicsMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in Computer: ");
        double computerMarks = scanner.nextDouble();

        double totalMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
        double percentage = (totalMarks / 500) * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
