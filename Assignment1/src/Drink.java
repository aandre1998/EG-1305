public class Drink
{
	public static void main(String[] args)
	{
		int customers = 12467;
		
		System.out.println("Number of customers: " + customers);
		System.out.println("Number of customers who purchased one or more energy drink per week: " + (customers * .14));
		System.out.println("Number of customers who prefer citrus flavored energy drinks: " + (customers * .64));
		//Last one is incorrect. It should be customers * .64 * .14
	}
}
