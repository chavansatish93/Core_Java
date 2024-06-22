class ExceptionH2
{
public static void main(String[] args)
{
	System.out.println("A");
	String s1=null;
	
	try
	{
		System.out.println(s1.length());
	}
	
	catch(ArithmeticException e1)
	{
	
	}
	
	catch(ArrayIndexOutOfBoundsException a1)
	{
	
	}
	
	finally
	{
	System.out.println("B");
	}

}


}