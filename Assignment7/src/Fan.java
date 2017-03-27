
public class Fan {
	int speed;
	boolean fanStatus;
	double radius;
	String color;
	
	public Fan()
	{
		speed = 0;
		fanStatus = false;
		radius = 5;
		color = "blue";
	}
	
	public Fan(int speed, boolean fanStatus, double radius, String color)
	{
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString()
	{
		return "Fan \nSpeed: " + speed + " / Color: " + color + " / Radius: " +
				radius + " / Status: " + (fanStatus ? "on" : "off");
	}
}
