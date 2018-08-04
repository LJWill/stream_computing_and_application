// Tutorial02.java
// COMP90056 2017s2
// awirth Aug 08

// This code is to help you get started. There is much you can add!

public class Tutorial02{
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]); // m = number of balls
		int n = Integer.parseInt(args[1]); // n = number of bins
        System.out.println("Number of balls, m: " + m +"\n Number of bins, n: " + n);
		
        int[] freq = new int[n]; // frequencies in each bin
        for (int i = 0; i < m; i++) {
        	int j = StdRandom.uniform(n);
        	System.out.println("balls: " + j);
        }
        
        int numWays = calNumWays(m, n);
        System.out.println("Number of ways: " + numWays);
        
        double[] normalized = new double[n];
        StdStats.plotBars(normalized);

	}
	
	//return the number of ways that choose b from a
	private static int calNumWays(int a, int b) {
		int nominator=1, denominator=1;
		if(a<b) {
			System.out.println("Make sure the first number should greater than hte second one");
		}else {
			for(int i=a; i>=b; i--) {
				nominator *= i;
			}
			
			for(int i=b; i>=1; i--) {
				denominator *= i;
			}
		}
		
		int quotient = nominator / denominator;
	
		return quotient;
	}
}
