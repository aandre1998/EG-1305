import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0000");
		
		System.out.println("Please enter the radius of the circle: ");
		int r = input.nextInt();
		
		Circle c = new Circle(r);
		
		System.out.println("This circle's radius is: " + df.format(c.getRadius()));
		System.out.println("This circle's diameter is: " + df.format(c.getDiameter()));
		System.out.println("This circle's area is: " + df.format(c.getArea()));
		System.out.println("This circle's circumference is: "+ df.format(c.getCircumference()));
	}

}
