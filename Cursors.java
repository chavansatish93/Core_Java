//cursors
import java.util.*;
class Cursors
{
	public static void main(String[] args)
	{
	Vector v = new Vector();
	v.add("A");
	v.add("B");
	v.add("C");
	v.add("D");
	v.add("E");
	ListIterator l1 = v.listIterator();
	
	while(l1.hasNext())
	{
	String s =(String)l1.next();
	
	if(s.equals("A"))
	{
		l1.set("Satish");
	}
	else if(s.equals("B"))
	{
		l1.set("Chavan");
	}
	else if(s.equals("C"))
	{
		l1.add("BE Student");
	}
	
	else if(s.equals("D"))
	{
		l1.remove();
	}
	
	}
    
 while(l1.hasPrevious())
	{
	System.out.println(l1.previous());
	}	
	
	
	
	
	/*Iterator e1 =v.iterator(); //iterator
	
	while(e1.hasNext())
	{
		String s = (String)e1.next();
		
		if(s=="D")
		{
		e1.remove();
		}
		
		else
		{
         System.out.println(s);
		}
		//System.out.println(e1.next());
	}*/
	/*Enumeration e = v.elements();->enumeration
	
	while(e.hasMoreElements())
	{
	System.out.println(e.nextElement());
	}*/
	}
}