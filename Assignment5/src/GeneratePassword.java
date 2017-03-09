import java.util.Scanner;

public class GeneratePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many digits would you like to use for a numeric password?\n");
		
		int digits = input.nextInt();
		
		System.out.print("Your password is\n");
		
		for(int i = 0; i < digits; i++)
		{
			System.out.print(randomGenerator() + " ");
		}
	}
	
	private static int randomGenerator()
	{
		return 1 + (int)(Math.random() * 9);
	}

}
