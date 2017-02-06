import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int numInput = input.nextInt();
		
		int num = numInput; //num variable to manipulate
		
		int sum = 0;
		
		if(num >= 0 && num <= 1000)
		{
			if (num == 1000) 
			{
				//1000 is a special case
				sum = 1;
			}
			else
			{
				//works for numbers from 0-999. 1000 is a special case
				sum += (num % 100) % 10; //add last digit to num
				num /= 10; //reduce num to first two digits
				sum += num % 10; //add next digit to num
				num /= 10; //reduce num to last digit
				sum += num; //add final digit to num
				
				System.out.println("The sum of all digits in " + numInput + " is " + sum);
			}
		}
		else
		{
			//the user did not enter a number from 0-1000
			System.out.println("That number was not between 0 and 1000.");
		}
	}
}