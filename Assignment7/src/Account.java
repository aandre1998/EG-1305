import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Account {
	int id;
	double balance;
	double annualInterestRate;
	String dateCreated;

	public Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = "";
	}
	
	public Account(int id, double balance, double annualInterestRate, String dateCreated)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public String getDateCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	
}
