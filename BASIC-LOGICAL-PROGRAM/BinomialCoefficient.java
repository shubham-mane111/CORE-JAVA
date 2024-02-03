package com.programs;
// Find Binomial Coefficient


public class BinomialCoefficient {

	public int fact(int no)
	{
		int fact =1;
		for(int i=no; i>=1; i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	public int binCoefficient(int n , int r)
	{
		int n_fact = fact(n);
		int r_fact = fact(r);
		int n_r_fact = fact(n-r);
		
		int binCoeff = n_fact / (r_fact*n_r_fact);
		return binCoeff;
	}
	
	public static void main(String[] args) {
		
//		nCr = n!/r!*(n-r)!
		BinomialCoefficient b = new BinomialCoefficient();
		
		System.out.println(b.binCoefficient(5, 2));
		
		

	}

}
