import java.util.Scanner;

public class PaperRockScissors {

	public static void main(String[] args) {
		String user = "";
		String computer = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("scissors (0), rock (1), paper (2): ");
		int userMove = input.nextInt();
		
		int computerMove = (int)(Math.random() * 2);
		
		//tie
		if(userMove == computerMove)
			System.out.println("It's a tie!");
		//losses
		else if(userMove == 0 && computerMove == 1)
			//System.out.println("You lose! " + computer + " beats " + user);
			System.out.println("You lose! rock beats scissors");
		else if(userMove == 1 && computerMove == 2)
			//System.out.println("You lose! " + computer + " beats " + user);
			System.out.println("You lose! paper beats rock");
		else if(userMove == 2 && computerMove == 0)
			//System.out.println("You lose! " + computer + " beats " + user);
			System.out.println("You lose! scissors beats paper");
		//wins
		else if(userMove == 1 && computerMove == 0)
			//System.out.println("You won! " + user + " beats " + computer);
			System.out.println("You won! rock beats scissors");
		else if(userMove == 2 && computerMove == 1)
			//System.out.println("You won! " + user + " beats " + computer);
			System.out.println("You won! paper beats rock");
		else if(userMove == 0 && computerMove == 2)
			//System.out.println("You won! " + user + " beats " + computer);
			System.out.println("You won! scissors beats paper");
		else
			System.out.println("didnt work");
	}

}
