public class Circle {
	double radius;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
}
