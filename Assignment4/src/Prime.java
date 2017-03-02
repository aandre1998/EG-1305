import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number. The program will print all the prime"
				+ " numbers smaller than this number.");
		int number = input.nextInt();
		
		int count = 0;
		
		for(int i = 2; i <= number; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n\nThere are a total of " + count + " prime numbers");
		 
		

	}
	
	private static boolean isPrime(int n)
	{
		boolean prime = true;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				prime = false;
				break;
			}
		}
		return prime;
	}

}
