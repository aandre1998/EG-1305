import java.util.Scanner;

public class TestPet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your pet's name");
		String name = input.nextLine();
		
		System.out.println("Please enter your pet's type");
		String type = input.nextLine();
		
		System.out.println("Please enter your pet's age");
		int age = input.nextInt();
		
		Pet p = new Pet(name, type, age);
		System.out.println("Pet object created");
		
		System.out.println("Your pet's name is " + p.getName());
		System.out.println("Your pet's type is " + p.getType());
		System.out.println("Your pet's age is " + p.getAge());
		
	}

}
