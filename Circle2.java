

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
   super(x,y,radius);//changed
}

public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   if (d < radius && radius <= other.radius)//changed
      return true;
   else
      return false;
}

}

