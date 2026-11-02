/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Student: Uche Chinedu Henry
 * Matriculation Number: 25/16511
 * Programme: Software Engineering
 *
 * Reads two numbers and displays their sum, difference, product
 * and quotient. The division is only done when the second number
 * is not zero, because dividing by zero has no defined answer.
 */
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Scanner reads what the user types on the keyboard
        Scanner input = new Scanner(System.in);

        // double is used so that decimal numbers are also accepted
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Arithmetic expressions
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // %.2f shows each result to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Only divide when the divisor is not zero
        if (secondNumber == 0) {
            System.out.println("Division is undefined for a zero divisor.");
        } else {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        }

        input.close();
    }
}
