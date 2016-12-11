/* Name: Micah Courey
 *
 * Class Name: SumRecursion
 *
 * Purpose of program: The program will allow for a user to enter 5 numbers.
 * The program will provide the sum of all 5 numbers using recursive methods. 
 */

import java.util.Scanner;

public class SumRecursion
{
    public static void main(String args[])
    {
        // Instantiate the Scanner object.
        Scanner input = new Scanner(System.in);
        
        // Print a message to the user and store their input in the userInput variable.
        System.out.println("Please enter 5 digits that you would like to be summed");
        int userInput = input.nextInt();

        // Instantiate the SumRecursion Object and call the sumNumbers recursion method 
        // on the user's numbers and store the output in the sum variable.
        SumRecursion userNumbers = new SumRecursion();
        int sum = userNumbers.sumNumbers(userInput);
        
        // Print a message to the user containing the final output of the summed digits.
        System.out.println("The Sum of the 5 digits you entered is: " + sum);
    }

    // Create a method that sums the 5 user digits using recursion
    public int sumNumbers(int number)
    {
        // Create a conditional statement in which the if clause contains the base case 
        // which will end the recursion process when the base case value is reached. 
        if (number == 0)
            return 0;
        // The else clause contains the recursion process and math equation and when
        // the return of the recursion equals the base case of 0 the recursion loop
        // ends and the result of the recursion process is stored in memory. 
        else
            return (number % 10) + sumNumbers(number / 10);
    }
}