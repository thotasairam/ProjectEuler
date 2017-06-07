/*
 * Project Euler Problem No. : 8
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */


public class Problem8 {

	
	public static void main(String args[]) {
       
		try {

            String largest = "731671765313306249192251196744265747423553491949349698352031277450632623957831801698480186947885184385861560789112949495459501737958331952853208805511125406987471585238630507156932909632952274430435576689664895044524452316173185640309871112172238311362229893423380308135336276614282806444486645238749303589072962904915604407723907138105158593079608667017242712188379087922749219016997208880937766572733300105336788122023542180975125454059475224352584907711670556013604839586446706324415722155397 5369781797784617406495514929086256932197846862248283972241375657056057490261407972968652414535100474821663704844031998900088952434506585412275886668811642717147992444292823086346567481391912316282458617866458359124566529476545682848912883142607690042242190226710556263211111093705442175069416589604080719840385096245544436298123098787992724428490918884580156166097919133875499200524063689912560717606058861164671094050775410022569831552000559357297257163626956188267042825248360082325753042075296345099879";
            int n = 0;
            int count = 0;
            long lProd = 0;
            int countProduct = 1;
            int largestProduct = 1;
            long prod = 1;

            for (int x = 0; x < largest.length()-4; x++) {
                for (int i = x; i < x + 5; i++) {
                    char ch = largest.charAt(i);
                    n = Character.getNumericValue(ch);
                    count++;
                    prod = (prod * n);
                    System.out.println("Product is:" + prod);
                }
                if(lProd < prod){
                    lProd = prod;
                    largestProduct = countProduct;
                }

                System.out.println("The largest one is "+ lProd);
                count = 0;
                prod = 1;
                countProduct++;
                System.out.println("The largest Product number is " + largestProduct);
                System.out.println("The largest Product count is " + countProduct);
                System.out.println("------------------------------------");

            }
        } 
		
		catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds error");
        } catch (ArithmeticException ex) {
            System.out.println("Arithemetic exception encountered");
        } catch (NumberFormatException ex) {
            System.out.println("Number format exception");
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("String index out of bounds exception");
        }
		
    }
}