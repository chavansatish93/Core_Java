//ArrayList Program
import java.util.*;
class Collection1
{
public static void main(String [] args)
{
	ArrayList a1 = new ArrayList(5);
	a1.add("Satish");
	a1.add("Vasant");
	a1.add("Chavan");
    a1.add(2,"G");
	
	Iterator g1 = a1.iterator();
	while(g1.hasNext())
	{
		String s1 = (String)g1.next();
		if(s1!="G")
		{
		
	         System.out.println(s1);	
	    }
	}
}	
	
}