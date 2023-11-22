import java.lang.Math;
public class simpleName
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(5, 15);

//		double dist = MyPoint.distance(p2, p1);
		System.out.printf("%8.2f\n", p2.distance(-9, -19));
//		System.out.printf("%8.2f\n", p2.distance(-9, -19));
//		System.out.printf("%8.2f\n", dist);
	}
}

class MyPoint
{ 
	private double x, y;
	MyPoint()
	{
		x = 0.0;
		y = 0.0;
	} 
	MyPoint(double x, double y)
	{
	this.x = x;
	this.y = y;
	}
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	double distance(MyPoint point)
	{
		return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
	}
	double distance(int x, int y)
	{
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}
	static double distance (MyPoint p1, MyPoint p2)
	{
		return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
	}
}
