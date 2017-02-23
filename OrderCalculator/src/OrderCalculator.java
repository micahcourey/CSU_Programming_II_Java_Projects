/*
 * Colorado State University – ITS-320 – Basic Programming
 *
 * This program asks the user to input products and quantities and
 * calculates the total cost of the order.
 *
 * Programmed by: Micah Courey, instructor Charles Lively
 *
 * Date: August 6th, 2016
 *
 */


import java.util.Scanner;    // Needed for the Scanner class.
import java.text.DecimalFormat; // Needed for 2 decimal place amounts.

public class OrderCalculator {
    public static void main(String[] args)
    {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // initialize the variables and start values for the product product number and the order total.
        double orderTotal = 0.00;
        int productNumber = 0;
        // initialize the product variables and set them equal to the products price.
        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;

        // Create an object for dollars and cents.
        DecimalFormat formatter = new DecimalFormat ("0.00");

        while(productNumber != -1) {

            // Get the user inputted product number.
            System.out.println("Enter a product number 1-5. When you're finished enter -1 to see your total order cost:");
            productNumber = keyboard.nextInt();

            // Add an if statement to end the loop and display the users total order cost.
            if(productNumber == -1)
                System.out.println("Your total order costs $" + formatter.format(orderTotal));

            else
            // Get the user inputted product quantity.
            System.out.println("Enter a quantity for this product");
            int productQuantity = keyboard.nextInt();

            // Add a switch statement to calculate the product cost and quantity based on the users input.
            switch (productNumber) {
                case 1:
                    orderTotal += product1 * productQuantity;
                    break;
                case 2:
                    orderTotal += product2 * productQuantity;
                    break;
                case 3:
                    orderTotal += product3 * productQuantity;
                    break;
                case 4:
                    orderTotal += product4 * productQuantity;
                    break;
                case 5:
                    orderTotal += product5 * productQuantity;
                    break;
                // Add a default case to display an error message to the user when they input an invalid product number
                default:
                    System.out.println("That is an invalid product number please enter 1 - 5");
                    break;
            }
        }
    }
}
