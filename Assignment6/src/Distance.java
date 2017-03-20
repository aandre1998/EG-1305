import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x1, y1, x2, y2;
		
		System.out.print("Enter x1: ");
		x1 = input.nextInt();
		System.out.print("Enter y1: ");
		y1 = input.nextInt();
		System.out.print("Enter x2: ");
		x2 = input.nextInt();
		System.out.print("Enter y2: ");
		y2 = input.nextInt();
		
		System.out.println("Distance between points: " + getDistance(x1, y1, x2, y2));
	}
	
	private static double getDistance(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}