import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		boolean guessed = false;
		
		int randNum = r.nextInt(100) + 1;
		
		System.out.println("Enter a number between 1 and 100");
		
		while(!guessed)
		{
			int userNum = input.nextInt();
		
			if(userNum < randNum)
			{
				System.out.println("Guess higher");
			}
			else if(userNum > randNum)
			{
				System.out.println("Guess lower");
			}
			else
			{
				System.out.println("You guessed it right");
				guessed = true;
			}
		}
	}

}
