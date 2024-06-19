package com.linecomparison;

public class Line_Comparison
{
    public void cartesiansystem(double x1,double x2,double y1,double y2)
    {
        double length_of_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of line is :"+length_of_line);
    }

    public static void main(String[] args)
    {
        Line_Comparison lc = new Line_Comparison();
        lc.cartesiansystem(1, 5, 4, 9);
    }
}
