import java.awt.print.Printable;
import java.util.Scanner;

public class CountMoney {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in integer, for example 1156");
		System.out.print("for 11 dollars and 56 cents: ");
		String amount = input.next();
		
		//parse cents and dollars out of input string
		int cents = Integer.parseInt(amount.substring(amount.length()-2, amount.length()));
		int dollars = Integer.parseInt(amount.substring(0, amount.length()-2));
		
		//print dollars
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(dollars + "\tdollars");
		
		//print quarters, remove from cents
		System.out.println(cents / 25 + "\tquarters");
		cents %= 25;
		
		//print dimes, remove from cents
		System.out.println(cents / 10 + "\tdimes");
		cents %= 10;
		
		//print nickels, remove from cents
		System.out.println(cents / 5 + "\tnickels");
		cents %= 5;
		
		//print pennies (not necessary to remove from cents)
		System.out.println(cents + "\tpennies");
		
		input.close();
	}
}