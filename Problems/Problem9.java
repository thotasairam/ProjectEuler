/*
 * Project Euler Problem No. : 9
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */

import java.util.Scanner;

public class Problem9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		

		int s, r;
		int a, b, c;
		int x, y, z;
		int prodABC;
		int sumABC;
		int check = 0;

                System.out.println("Enter the number u want to check for pythagorean triplet =");

		while(true) {
			while (scan.hasNext()) {
				check = scan.nextInt();
				
				for (s = 1; s < 10; s++)
				{
					for (r = s+1; r < 2000; r++)
					{
						a = r * r - s * s;
						b = 2 * r * s;
						c = r * r + s * s;
						x = a * a;
						y = b * b;
						z = c * c;

						if ( x + y == z)
						{
							sumABC = a + b + c;
							if (sumABC == check)
							{
								System.out.println("a = " + a + " b = " + b + " c = " + c);
								System.out.println(" a^2 = " + x + " b^2 = " + y + " c^2 = " + z);

								prodABC = a * b * c;
								System.out.println(prodABC);
							
								System.exit(1);
							} else {
								System.out.println("NOT a Pythagorean Triple");
							}
						}

					}
				}
				
			}
		}
	}
}
