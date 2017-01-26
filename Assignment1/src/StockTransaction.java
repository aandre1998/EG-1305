public class StockTransaction
{
	public static void main(String[] args)
	{
		final double COMMISSION_RATE = 0.02;
		
		int shares = 1000;
		double boughtPrice = shares * 32.87;
		double soldPrice = shares * 33.92;
		
		double boughtBrokerPay = boughtPrice * COMMISSION_RATE;
		double soldBrokerPay = soldPrice * COMMISSION_RATE;
		
		double profit = soldPrice - boughtPrice - boughtBrokerPay - soldBrokerPay;
		
		System.out.printf("Joe paid $%.2f for the stock.\n", boughtPrice);
		System.out.printf("Joe paid his broker $%.2f when he bought the stock.\n", boughtBrokerPay);
		System.out.printf("Joe sold the stock for $%.2f.\n", soldPrice);
		System.out.printf("Joe paid his broker $%.2f when he sold the stock.\n", soldBrokerPay);
		System.out.printf("Joe's profit was $%.2f.", profit);
	}
}
