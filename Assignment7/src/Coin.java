import java.util.Random;

public class Coin {
	String sideUp;
	
	public Coin()
	{
		sideUp = "heads";
	}
	
	public void toss()
	{
		Random random = new Random();
		int r = random.nextInt(1-0+1);
		
		switch(r)
		{
			case 0:
				sideUp = "heads";
			case 1:
				sideUp = "tails";
		}
	}
	
	public String getSideUp()
	{
		return sideUp;
	}
}
