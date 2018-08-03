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
        }
        
        double[] normalized = new double[n];
        StdStats.plotBars(normalized);

	}
}
