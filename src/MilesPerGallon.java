import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the miles driven: ");
		int miles = input.nextInt();
		System.out.print("Enter the gallons of fuel used: ");
		int gallons = input.nextInt();
		
		System.out.println("The miles-per-gallon is " + (double)miles / gallons);
	}
}