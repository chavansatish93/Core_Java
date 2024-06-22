class Demo
{
	int x,y;
	
	Demo()
	{
	  System.out.println("Constructor is called..");

	}
	
	void fun1()
	{
	 System.out.println("Fun1 is executed..");
		
		
	}
	
}

class Construct
{
	public static void main(String []args)
	{
		Demo d1 = new Demo();
		d1.fun1();
		
	}
}