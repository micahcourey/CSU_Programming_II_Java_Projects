/*
* Colorado State University – ITS-320 – Basic Programming
*
* This program prints the info for various types of books
* with customized values depending on the type of book.
*
* Programmed by: Micah Courey, instructor Charles Lively
*
* Date: August 21st, 2016
*
*/

public class Phone extends Book
{
    // Initialize the variables for white pages and yellow pages
    private int whitePages;
    private int yellowPages;
    // Create the constructor method for Phone
    public Phone(String title, int yellowPages, int whitePages)
    {
        // Set pages equal to the number of white pages plus the number of yellow pages
        super(title, whitePages + yellowPages);
        this.yellowPages = yellowPages;
        this.whitePages = whitePages;
    }
    // Print the number of yellow pages and white pages after the title and pages values
    public void print()
    {
        super.print();
        System.out.println(yellowPages + " are yellow pages and " + whitePages + " are white pages");
    }
}
