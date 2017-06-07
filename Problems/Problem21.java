/*
 * Projec Euler Problem No. :  21
 *
 * @Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 *
 */
	
import java.util.Scanner;

public class Problem21 {
	
	
	    public static void main(String[] args) {
	        
	        
	        System.out.println("Enter a number, to find out the sum of Amicable numbers: ");
	        Scanner f=new Scanner(System.in);
	        int in=f.nextInt();
	        long sTime=System.currentTimeMillis();
	        
	        long ans=sumOfAllAmicableNums(in);
	        long eTime=System.currentTimeMillis();
	        
	        System.out.println("Sum of all amicable numbers below "+in+" : "+ans+" Elasped Time : "+(eTime-sTime)+" ms");
	    }
	    
	    private static long sumOfAllAmicableNums(int inNum)
	    {
	        long amicNumSum=0,factorsSum=0,sumOfFactors=0; 
	        for(long i=2;i<inNum;i++)
	        {
	            factorsSum=getFactSum(i);
	            if(i!=factorsSum)
	            {
	                sumOfFactors=getFactSum(factorsSum);
	                if(i==sumOfFactors)
	                    amicNumSum+=i;
	            }   
	            else
	                continue;
	        }       
	        return amicNumSum;
	    }
	    
	    private static long getFactSum(long r)
	    {
	        long factSum=1;
	        for(int s=2;s<=Math.sqrt(r);s++)
	        {
	            if(r%s==0)
	                factSum+=s+r/s;
	        }
	        return factSum;
	    }
	}