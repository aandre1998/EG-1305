import java.util.Scanner;

public class TestFan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fan speed: ");
		int speed = input.nextInt();
		System.out.println("Enter fan radius: ");
		double radius = input.nextDouble();
		System.out.println("Enter fan color: ");
		String color = input.next();
		System.out.println("Enter fan status: ");
		boolean status = input.nextBoolean();
		
		Fan myFan = new Fan(speed, status, radius, color);
		System.out.println(myFan.toString());
		
		
		
		

	}

}
