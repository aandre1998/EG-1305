import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a year");
		int year = input.nextInt();
		
		boolean isLeapYear = false;
		if(year % 4 == 0 || year % 400 == 0)
		{
			isLeapYear = true;
		}
		if(year % 100 == 0 && year % 400 != 0)
		{
			isLeapYear = false;
		}
		
		System.out.println("Please enter a month");
		int month = input.nextInt();
		
		int days = 0;
		switch(month)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				days = 28;
				break;
		}
		
		if(isLeapYear && month == 2)
		{
			days += 1;
		}
				
		System.out.println("There are " + days + " days in " + month + "/" + year);

	}

}
