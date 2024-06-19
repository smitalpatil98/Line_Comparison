package com.linecomparison;

public class Line_Comparison
{
    public Double isEquallines(double x1,double x2,double y1,double y2)
    {
        double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return length_line;
    }

    public static void main(String[] args)
    {
        Line_Comparison lc = new Line_Comparison();
        double length_line1 = lc.isEquallines(1, 5, 4, 9);
        double length_line2 = lc.isEquallines(2,6,4,8);
        if(length_line1 == length_line2){
            System.out.println("Lines are Equal");
        }
        else
        {
            System.out.println("Lines are Not Equal");
        }
    }
    }

