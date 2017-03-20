import java.math.BigInteger;

public class Chess {

	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		
		for(int i = 0; i <= 63; i++)
		{
			total = total.add(riceInSquare(i));
		}
		
		System.out.println("Total grains: " + total);
		System.out.println("Grains in the last square: " + riceInSquare(63));
		
	}
	
	private static BigInteger riceInSquare(int square)
	{
		BigInteger wheat = new BigInteger("2");
		wheat = wheat.pow(square);
		return wheat;
	}

}
