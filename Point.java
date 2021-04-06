public class Point
{
    private double x;
    private double y;
    
    public getPoint(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public boolean lessThan(Order other)
    {
       Point otherPoint = (Point) other;
       if((x + y) < (otherPoint.x + otherPoint.y))
       {
          return true;
       }
       return false;
    }
}