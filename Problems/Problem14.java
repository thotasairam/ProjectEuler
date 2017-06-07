/*
 * Project Euler Problem No. : 14 
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */
 
public class Problem14 {


	public static void main(String[] args) {
		 int longestChainLength =0;
		 int maxChain =0;
		 int MaxNum = 0;
		 for(int r = 2;r < 1000000 ; r++ )
		 {
		  longestChainLength= iterativeChainCount(r);
		  if(longestChainLength > maxChain)
		  {
		   maxChain = longestChainLength;
		   MaxNum = r;
		  }
		 }
		 System.out.println(MaxNum);
		 }

		 public static int iterativeChainCount(long sr)
		 {
		  int count = 0;
		  while(sr !=1)
		  {
		   if(sr % 2 == 0)
		   {
		    sr=sr/2;
		   }
		   else
		   {
		    sr= 3*sr +1;
		   }
		   count++;
		  }
		 return count; 
		 }
}