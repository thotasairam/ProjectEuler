/*
 * Project Euler Problem No. : 10 
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */
public class Problem10 {
		
	 public static boolean SumOfPrimes(long sopNum){
	        if(sopNum == 2) return true;
	        if(sopNum%2 == 0 || sopNum == 1)    return false;
	        int sqrtNum = (int) (Math.sqrt(sopNum))+1;    
	        for(int i=3; i<sqrtNum; i++){
	            if(sopNum%i==0) return false;
	        }    
	        return true;
	    }  
		
	    public static void main(String[] args) {
	        long maxLimit = 2000000;
	        long sumOfPrimes = 2;
	        long i = 3;
	        while(i<=maxLimit){
	            if(SumOfPrimes(i)) sumOfPrimes = sumOfPrimes+i;
	            i = i+2;
	        }
	        System.out.println(sumOfPrimes);
	    }   	    
}