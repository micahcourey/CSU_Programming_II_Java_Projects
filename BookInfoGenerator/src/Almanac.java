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

public class Almanac extends Book
{
    private int charts;
    public Almanac(String title, int pages, int charts)
    {
        super(title, pages);
        setCharts(charts);
    }
    public boolean setCharts(int charts)
    {
        if(charts > getPages())
        {
            System.err.println("Too many charts");
            return false;
        }
        else
        {
            this.charts = charts;
            return true;
        }
    }
    public int getCharts()
    {
        return charts;
    }
    public void print()
    {
        super.print();
        System.out.println(" and " + charts + " charts");
    }
}