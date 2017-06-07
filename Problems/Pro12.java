/*
 * Project Euler Problem num. : 12 
 * 
 * 
 * @@Name: Sai Ram Thota
 * @CWID: 11573236
 * @email-id: tsairam@okstate.edu
 * 
 */
 
public class Pro12 {

		    int count; 
		    int num; 

		  
		    public int hashCode()
		    {
		        return num;
		    }

		    public boolean equals(Object obj)
		    {
		        if (obj == null)
		        {
		            return false;
		        }
		        if (getClass() != obj.getClass())
		        {
		            return false;
		        }
		        final Pro12 sr = (Pro12) obj;
		        if (this.num != sr.num)
		        {
		            return false;
		        }
		        return true;
		    }
}