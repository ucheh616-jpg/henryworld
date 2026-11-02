/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Calculating the Total Cost of Items
 *
 * Student: Uche Chinedu Henry
 * Matriculation Number: 25/16511
 * Programme: Software Engineering
 *
 * Reads an item's name, the quantity bought and the unit price,
 * then calculates:   total cost = quantity x unit price
 */
import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String for the name, int for a whole-number quantity,
        // double for a price that may have kobo (decimals)
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // At least one item must be bought, and a price cannot be negative
        if (quantity <= 0 || unitPrice < 0) {
            System.out.println("\nInvalid input: quantity must be greater than 0 "
                    + "and unit price cannot be negative.");
        } else {
            // int x double gives a double result
            double totalCost = quantity * unitPrice;

            System.out.println("\n--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}
