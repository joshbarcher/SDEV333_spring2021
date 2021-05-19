package test;

import model.Point;

public class TestPoints
{
    public static void main(String[] args)
    {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        //what is the output?
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point1));
    }
}
