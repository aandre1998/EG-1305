
public class FindPI {
	
	public static void main(String[] args) {
		int iterations = 2500000;
		
		long start = System.nanoTime();
		double sum = 0;
		
		for(int i = 1; i < iterations; i+=2)
		{
			sum += ((1.0 / (2.0 * i - 1)) - (1.0 / (2.0 * i + 1)));

		}
		
		double pi = sum * 4;
		
		long end = System.nanoTime();
		
		long elapsed = end - start;
		double seconds = (double)elapsed / 1000000000;
		
		System.out.println("PI=" + pi + " after " + iterations + " iterations\n");
		System.out.printf("It took %.3f seconds to complete this operation", seconds);
	}
}
