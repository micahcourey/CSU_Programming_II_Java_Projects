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

public class PolyMain
{
    public static void main(String [] args)
    {
        Book [] library = new Book [5];
        library[0] = new Novel("Jaws", 300, 15);
        library[1] = new Almanac("New World ", 100, 50);
        library[2] = new Novel("Animal Farm", 250, 9);
        library[3] = new Phone("The Portland, OR Phone Book", 272, 128);
        listBooks(library);
    }
    static void listBooks(Book [] library)
    {
        for (int i = 0; i < library.length && library[i] != null; i++)
            library[i].print();
    }
}
