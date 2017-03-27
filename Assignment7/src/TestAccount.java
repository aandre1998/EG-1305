
public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account(1122, 20000, 4.5, "03/26/2017");
		
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Monthly Interest: " + acc.getMonthlyInterestRate());
		System.out.println("Date Created: " + acc.getDateCreated());
	}

}
