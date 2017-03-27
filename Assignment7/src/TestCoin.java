
public class TestCoin {

	public static void main(String[] args) {
		Coin coin = new Coin();
		
		int headsCount = 0;
		int tailsCount = 0;
		
		for(int i = 0; i < 20; i++)
		{
			coin.toss();
			if(coin.getSideUp() == "heads")
				headsCount++;
			else if(coin.getSideUp() == "tails")
				tailsCount++;
		}
		
		System.out.println("Heads: " + headsCount);
		System.out.println("Tails: " + tailsCount);

	}

}
