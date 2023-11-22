public class drawCircles
{
	public static void main(String[] args)
	{
		System.out.printf("---RISHI CUTCHIN---\n");
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("The circle c1 has center (2,2) and a radius of 5.5");
		System.out.printf("Area: %2.2f\nPerimeter:  %2.2f\n", c1.getArea(), c1.getPerimeter());
		System.out.print("3, 3 contain check: ");
		System.out.println(c1.contains(3, 3));
		System.out.print("Circle 4, 5, 10.5 contain check: ");
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.print("Circle 3, 5, 2.3 overlap check: ");
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
		System.out.printf("---RISHI CUTCHIN---\n");
		
	}
}

class Circle2D
{
	private double x;
	private double y;
	private double radius;
	Circle2D()
	{
		x = 0;
		y = 0;
		radius = 1;
	}
	Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	double getArea()
	{
		return(Math.PI * Math.pow(radius, 2));
	}
	double getPerimeter()
	{
		return((2 * Math.PI) * radius);
	}
	boolean contains(double x, double y)
	{
		//distance formula, if point is distance from center to circle is less than radius we are containing
		if (Math.sqrt(Math.abs(Math.pow(x - this.x, 2)) + Math.abs(Math.pow(y - this.y, 2))) < radius)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	boolean contains(Circle2D circle)
	{
		//distance formula, if the distance from the center of "circle" is less than radius AND the radius of the circle is less than the radius of the original circle, contains
		if (Math.sqrt(Math.abs(Math.pow(circle.x - x, 2)) + Math.abs(Math.pow(circle.y - y, 2))) < radius && circle.radius < radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean overlaps(Circle2D circle)
	{
		//distance formula, if distance from two points is less than the combined radius, it is said to overlap
		if (Math.sqrt(Math.abs(Math.pow(circle.x - this.x, 2)) + Math.abs(Math.pow(circle.y - this.y, 2))) < radius + circle.radius)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	//getters
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	double getRadius()
	{
		return radius;
	}
}
	
