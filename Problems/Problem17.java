/*
 * Project Euler Problem No. : 17
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */
 
public class Problem17 {

	
	
	static String unitNumbs[] = {"", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen",  "Sixteen", "Seventeen", 
        "Eighteen", "Nineteen"};

static String tenNumbs[] =  {"","Ten","Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty","Ninety"};




public static int digitCount(int n)
{
int digcount = 0 ;
while(n>0)
{ 
 n=n/10;
 digcount++;
  
}
 
return digcount++;
 
}
    
public static String wordGenerator(int w)
{
String numberWord = "";
 
int digits = digitCount(w);
 
while(digits >0)
{
switch(digits)
{
case 1:
case 2:
 
 if(w < 20)
 { 
  numberWord+=unitNumbs[w];
   
  digits = 0;
 }
 else
 if(w >=20 )
 {
   
  
  numberWord+= tenNumbs[w/10];
  w=w%10;
  if(w ==0)
  digits = 0;
  else
  digits--;
 }
 break;
case 3:
  
 numberWord+=unitNumbs[w/100];
 w=w%100;
 if(w%100 == 0)
  {
  numberWord+="Hundred";
   
  digits = 0;
  }
 else
 {
  numberWord+="HundredAnd";
 digits--;
 }
  break;
case 4:
  
 numberWord+=unitNumbs[w/1000];
 w=w%1000;
 numberWord+="thousand";
 if(w%1000 ==0)
 digits = 0;
 else
 digits--;
 break;

}
 
}
 
return numberWord;
 
}
public static void main(String[] args) {
int numLetterCountSum = 0;
 
String str = "";
for(int r =1 ; r<=1000; r++)
{
 str = wordGenerator(r);
 System.out.println(str);
 numLetterCountSum=numLetterCountSum+str.length();
  
}
System.out.println(numLetterCountSum);
}

}	
