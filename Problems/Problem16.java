/*
 * Project Euler Problem No. : 16
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		int powDigitSum =0;
		int digit;
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		for(int r = 1 ; r <= 1000 ; r++ )
		{
			one = one.multiply(two);
		}
		String str = one.toString();

		for(int r =0 ; r < str.length();r++)
		{
			digit = str.charAt(r) - '0'; 
			powDigitSum = powDigitSum + digit;
		}
		System.out.println(powDigitSum);
	}
}