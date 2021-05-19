package model;

public class Point
{
    private double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object obj)
    {
        //first we need to determine if the parameter is a Point
        if (obj == null)
        {
            return false;
        }
        else if (!(obj instanceof Point))
        {
            return false;
        }

        //then make a comparison based on the attributes of the Point (not the references)
        Point other = (Point)obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
