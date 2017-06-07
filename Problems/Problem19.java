/*
 * Projec Euler Problem No. : 19 
 *
 * @Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 *
 */

public class Problem19{	
	
	public static void main(String[] args) 
	 {
	  int dd = 1 ;
	  int mm = 1;
	  int yyyy = 1900;
	  String dayName = "Monday";
	  int maxDays =0;
	  int sundayCount =0;
	   
	  while(yyyy < 2001)
	  {
	   while(mm <= 12)
	   {
	   if(mm  == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12 )
	    maxDays = 31;
	   else
	   if(mm == 2)
	   {
	   if(leapYearCount(yyyy))
	   {
	    maxDays = 29;
	   }
	   else
	    maxDays = 28;
	   }
	   else
	    maxDays = 30;
	 
	   while(dd <= maxDays)
	   {
	    if(dd == 1 && dayName.equalsIgnoreCase("sunday") && yyyy > 1900)
	     sundayCount++;
	     
	    dayName = nextDayReturn(dayName);
	    dd++;
	     
	   }
	   dd  = 1;
	   mm ++; 
	   }
	   mm = 1;
	   yyyy++;
	  }
	   
	System.out.println(sundayCount);
	 }
	 public static String nextDayReturn(String sun)
	 {
	 sun = sun.toUpperCase();
	 
	  if (sun.equalsIgnoreCase("SUNDAY"))
	   return "Monday";
	  else
	  if (sun.equalsIgnoreCase("MONDAY"))
	   return "Tuesday";
	  else
	  if (sun.equalsIgnoreCase("TUESDAY"))
	   return "wednesday";
	  else
	  if (sun.equalsIgnoreCase("WEDNESDAY"))
	   return "thursday";
	  else
	  if (sun.equalsIgnoreCase("THURSDAY"))
	   return "friday";
	  else
	  if (sun.equalsIgnoreCase("FRIDAY"))
	   return "saturday";
	  else
	   if(sun.equalsIgnoreCase("SATURDAY"))
	  return "sunday";
	   else
	    return "Error";
	 }
	 
	static boolean leapYearCount(int yyyy)
	{
	  if(yyyy%100 == 0)
	 {
	  if(yyyy % 400 ==0)
	   return true;
	  else
	   return false;
	 }else
	  if(yyyy % 4 == 0)
	  {
	   return true;
	  }
	  else
	   {
	   return false;
	   } 
	 }
}
