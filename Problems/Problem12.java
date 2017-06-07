/*
 * Project Euler Problem No. : 12 
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

	public class Problem12
	{

	    
	    public static List<Integer> primeFactors(long numbers)
	    {
	        long n = numbers;
	        List<Integer> factors = new ArrayList<Integer>();
	        for (int i = 2; i <= n / i; i++)
	        {
	            while (n % i == 0)
	            {
	                factors.add(i);
	                n /= i;
	            }
	        }
	        if (n > 1)
	        {
	            factors.add((int) n);
	        }
	        return factors;
	    }

	    
	    public static HashMap<Integer, Pro12> getFactorsWithPowerOrIndex(long number)
	    {
	        HashMap<Integer, Pro12> factorsMap = new HashMap<Integer, Pro12>();
	        for (Integer primeFactor : primeFactors(number))
	        {
	        	Pro12 node = factorsMap.get(primeFactor);
	            if (node == null)
	            {
	            	Pro12 newNode = new Pro12();
	                newNode.num = primeFactor;
	                newNode.count = 1;
	                factorsMap.put(primeFactor, newNode);
	            } 
	            else
	            {
	                node.count++;
	            }
	        }
	        return factorsMap;
	    }

	  
	    public static int getTheDivisorCount(long number)
	    {
	        int factorCount = 1;

	        HashMap<Integer, Pro12> factorsMap = getFactorsWithPowerOrIndex(number);

	         for (Integer key : factorsMap.keySet())
	        {
	            factorCount *= (factorsMap.get(key).count + 1);
	        }
	        return factorCount;
	    }

	    public static void main(String args[])
	    {
	        int i = 1;
	        int sum = 0;
	        primeFactors(441);

	        do
	        {
	            sum += i;
	            i++;
	        } while (getTheDivisorCount(sum) < 500);

	        System.out.println(sum);
	    }  
	}    