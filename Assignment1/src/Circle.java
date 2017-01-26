import java.text.DecimalFormat;

public class Circle
{
	public static void main(String[] args)
	{	
		DecimalFormat formatter = new DecimalFormat("#0.00");
		int radius = 10;
		
		System.out.println("The radius is " + radius);
		System.out.println("The area is " + formatter.format(Math.PI * Math.pow(radius, 2)));
		System.out.println("The diameter is " + radius * 2);
	}
}
