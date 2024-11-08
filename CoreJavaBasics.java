package com.perscholas.java_basics;

public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int int1 = 10;
		int int2 = 12;
		
		int intSum = int1 + int2;
		System.out.println(intSum);
		
		double doub1 = 72.64;
		double doub2 = 6.02e22;
		
		double doubSum = doub1 + doub2;
		System.out.println(doubSum);
		
		int int3 = 200;
		double doub3 = 3.14;
		
		double intDoubSum = int3 + doub3;
		System.out.println(intDoubSum);
		
		int int4 = (int)9001.7;
		int int5 = 7;
		
		int intDiv = int4/int5;
		System.out.println(intDiv);
		
		double doub4 = 1200;
		double doub5 = 231.79;
		
		double doubDiv = (int)(doub4/doub5);
		System.out.println(doubDiv);
		
		int x = 5;
		int y = 6;
		
		int q = y/x;
		System.out.println(q);
		
//		q = (double)y; // Creates an error because q is declared as an int and you can't assign a double to an int variable;
//		System.out.println(q);
		
		final double AVOGADROS_NUMBER = 6.022e23;
		int moles_O2 = 2;
		double molecules_O2 = AVOGADROS_NUMBER * moles_O2;
		System.out.println(molecules_O2);
		
		
		String product1 = "coffee";
		String product2 = "tea";
		String product3 = "scone";
		
		float cost1 = 3.99F;
		float cost2 = 2.49F;
		float cost3 = 2.99F;
		
		float subtotal = 3*cost1 + 4*cost2 + 2*cost3;
		float totalSale;
		
		final float SALES_TAX = .0825F;
		
		totalSale = subtotal + SALES_TAX * subtotal;
		System.out.println(String.format("%.2f", totalSale));
		
		
	}

}
