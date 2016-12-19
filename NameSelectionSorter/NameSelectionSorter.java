
/*
 * Name: Micah Courey
 *
 * Class Name: NameSelectionSorter
 *
 * Purpose of program: a program that will store 10 names in an array. The program uses 
 * selection sort to sort the names in order alphabetically and in reverse order.
 */

import java.util.Scanner;

public class NameSelectionSorter
{
    public static void main(String[] args) 
    {
        /* Create an int variable to store the number of names the user will enter
        and a String variable to store the compared named as they are sorted. */  
        int n = 10;
        String value;
        
        /* Create an array to store all of the names and a scanner called nameScanner to allow the 
        user to enter the names to be sorted. */
        String nameList[] = new String[n];
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter each name, press Enter between each name:");
        
        /* Store each name that the user enters in the nameList array and stop after reaching the 
        length that the n variable is set to for the name list length */
        for(int i = 0; i < n; i++)
        {
            nameList[i] = nameScanner.nextLine();
        }
   
        /* Iterate through the name list and make use of the compareTo() Java method and for loops to
        sort the list in alphabetical order */
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (nameList[i].compareTo(nameList[j]) > 0) 
                {
                    value = nameList[i];
                    nameList[i] = nameList[j];
                    nameList[j] = value;
                }
            }
        }
        
        // Display the alphabetical name list and seperate each name with a comma
        System.out.print("Names sorted and listed in alphabetical order: ");

        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(nameList[i] + ",");
        }
        System.out.println(nameList[n - 1]);
        
        /* Iterate through the name list and make use of the compareTo() Java method and for loops to
        sort the list in reverse alphabetical order. */
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (nameList[i].compareTo(nameList[j]) < 0) 
                {
                    value = nameList[i];
                    nameList[i] = nameList[j];
                    nameList[j] = value;
                }
            }
        }
        
        // Display the reverse alphabetical name list and seperate each name with a comma
        System.out.print("Names sorted and listed in reverse alphabetical order: ");

        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(nameList[i] + ",");
        }
        System.out.println(nameList[n - 1]);
    }
}