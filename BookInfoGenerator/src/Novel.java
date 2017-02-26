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

public class Novel extends Book
{
    private int chapters;
    public Novel(String title, int pages, int chapters)
    {
        super(title, pages);
        this.chapters = chapters;
    }
    public void print()
    {
        super.print();
        System.out.println(" and " + chapters + " chapters");
    }
}
