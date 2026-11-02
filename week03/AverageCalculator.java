/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student: Uche Chinedu Henry
 * Matriculation Number: 25/16511
 * Programme: Software Engineering
 *
 * Reads a student's name and three course scores, then
 * calculates and displays the total and the average.
 *
 * Extension exercise: the program only calculates the result
 * when every score is between 0 and 100 (inclusive).
 */
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants: the number of courses and the valid score range
        final int NUMBER_OF_COURSES = 3;
        final double LOWEST_SCORE = 0.0;
        final double HIGHEST_SCORE = 100.0;

        // A String holds the name; double holds scores such as 67.5
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // true only if all three scores are inside the valid range
        boolean allScoresValid =
                score1 >= LOWEST_SCORE && score1 <= HIGHEST_SCORE
                && score2 >= LOWEST_SCORE && score2 <= HIGHEST_SCORE
                && score3 >= LOWEST_SCORE && score3 <= HIGHEST_SCORE;

        if (allScoresValid) {
            double total = score1 + score2 + score3;
            double average = total / NUMBER_OF_COURSES;

            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Student: " + studentName);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("\nInvalid input: each score must be between 0 and 100.");
            System.out.println("Please run the program again with valid scores.");
        }

        input.close();
    }
}
