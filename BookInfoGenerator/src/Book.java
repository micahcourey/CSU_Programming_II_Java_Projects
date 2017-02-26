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

public class Book
{
    private String title;
    public int pages;
    public Book(String title, int pages)
    {
        this.title = new String(title);
        setPages(pages);
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public int getPages()
    {
        return pages;
    }
    public void print()
    {
        System.out.println(title + " has " + pages + " pages");
    }
}
