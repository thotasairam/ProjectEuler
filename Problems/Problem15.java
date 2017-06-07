/*
 * Project Euler Problem No. : 15
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */
public class Problem15 {

	public static void main(String args[])
	{
	 
	int gSize = 20;
	long latPath =1;
	 
	for(int r=0 ; r < gSize ;r++)
	{
	 latPath *= 2*gSize-r;
	 latPath /= (r+1);
	 }
	System.out.println(latPath);
	}
}