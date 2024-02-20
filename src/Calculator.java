import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first number.");
        double firstNumber = scanner.nextDouble();

        System.out.println("Choose your operator. (+ - * or /)");
        String operator = scanner.next();

        System.out.println("Input your second number.");
        double secondNumber = scanner.nextDouble();

        double answer;
        switch (operator) {
            case "+" -> answer = firstNumber + secondNumber;
            case "-" -> answer = firstNumber - secondNumber;
            case "*" -> answer = firstNumber * secondNumber;
            case "/" -> answer = firstNumber / secondNumber;
            default -> {
                answer = Double.NaN;
                System.out.println("Invalid operator. Try again.");
                System.exit(0);
            }
        }

        String equation = firstNumber + " " + operator + " " + secondNumber;
        System.out.println("The answer to your equation, \"" + equation + "\", equals " + answer);
    }
}