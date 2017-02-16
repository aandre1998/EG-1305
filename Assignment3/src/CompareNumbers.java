import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int a = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int b = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int c = input.nextInt();

		int largest = a, smallest = b, sum = 0, product = 0, average = 0;
		
		//largest
		if(a > b && a > c)
			largest = a;
		else if(b > a && b > c)
			largest = b;
		else if(c > a && c > b)
			largest = c;
		
		//smallest
		if(a < b && a < c)
			smallest = a;
		else if(b < a && b < c)
			smallest = b;
		else if(c < a && c < b)
			smallest = c;
		
		//sum
		sum = a + b + c;
		
		//product
		product = a * b * c;
		
		//average
		average = (a + b + c) / 3;
		
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Average is " + average);
	}

}
