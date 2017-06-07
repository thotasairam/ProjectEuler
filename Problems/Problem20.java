/*
 * Project Euler Problem No. : 20
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */

import java.math.BigInteger;

public class Problem20 {
	
	public static void main(String[] args) {
		  
		BigInteger factDigSum = BigInteger.ZERO;
		BigInteger fact = BigInteger.ONE;
		BigInteger r;
		 
		for(int s = 1 ; s <= 100 ; s++ )
		{
		 fact = fact.multiply(BigInteger.valueOf(s));
		  
		}
		 
		  
		 while(!fact.equals(BigInteger.ZERO))
		 {  
		  r= fact.mod(BigInteger.TEN);
		  fact=fact.divide(BigInteger.TEN);
		  factDigSum = factDigSum.add(r);
		 } 
		  
		 System.out.println(factDigSum);
		 
		 }
}
