
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   private Circle1 circle2;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}
//
//scale up
//
@Test
public void scaleup()
{
	double s = circle1.scale(2);
	Assert.assertTrue(s == 6);
}
//
//scale down
//
@Test
public void scaledown()
{
	double d = circle1.scale(0.5);
	Assert.assertTrue(d == 1.50000000000000000);
}
//
//test intersection
//	
@Test
public void testinterpoint()
{
	System.out.println(" test intersects point.");
	circle2 = new Circle1(3,2,3);
	Assert.assertTrue(circle1.intersects(circle2));
}
//TEST INTERSECTIONS of circle
//
@Test
public void testinter()
{
	System.out.println(" test intersects.");
	circle2 = new Circle1(1,2,3);
	Assert.assertTrue(circle1.intersects(circle2));
}
//
//test circle inside cirlce
//
@Test
public void inCircle()
{
	System.out.println(" test inside intersects.");
	circle2 = new Circle1(1,2,2);
	Assert.assertFalse(circle1.intersects(circle2));
}
//
//out side circle
//
@Test
public void outCircle()
{
System.out.println(" test inside intersects.");
	circle2 = new Circle1(16,16,2);
	Assert.assertFalse(circle1.intersects(circle2));
}
/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

