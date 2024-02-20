import java.util.Scanner;

/**
 * Grade an assignment!
 */
public class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was the maximum amount of points on this assignment?");
        double maxPoints = scanner.nextDouble();

        System.out.println("Okay, what did you make on the assignment?");
        double grade = scanner.nextDouble();

        double percentage = (grade / maxPoints) * 100;
        System.out.println("You made a " + grade + "/" + maxPoints + ", which means you made a " + percentage + "%.");
    }
}