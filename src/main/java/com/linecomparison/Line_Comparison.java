package com.linecomparison;

public class Line_Comparison
{
    public Double linecomparison(double x1,double x2,double y1,double y2)
    {
        double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return length_line;
    }

    public static void main(String[] args) {

        Line_Comparison lc = new Line_Comparison();
        double x1 = Math.random()*10;
        double x2 = Math.random()*10;
        double y1 = Math.random()*10;
        double y2 = Math.random()*10;
        double lx1 = Math.random()*10;
        double lx2 = Math.random()*10;
        double ly1 = Math.random()*10;
        double ly2 = Math.random()*10;


        double l1 = lc.linecomparison(x1, x2, y1, y2);
        double l2 = lc.linecomparison(lx1,lx2,ly1,ly2);
        if(l1>l2)
        {
            System.out.println("Line 1 is Greater Than line 2");
        }
        if(l1<l2)
        {
            System.out.println("Line 2 is Greater Than line 1");
        }
        if(l1==l2)
        {
            System.out.println("Both line are equals");
        }
    }
}

