
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   if (Math.abs(center.x - other.center.x) < radius &&
       Math.abs(center.y - other.center.y) < radius && radius <= other.radius)//changed and added <=radius
      return true;
   return false;
}

}

