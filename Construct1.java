class Demo
{
	int x,y;
	
	Demo()
	{
	  x=5;
	  y=6;

	}
	
	void fun1()
	{
	 x =22;
	 y = 23;
		
		
	}
	
}

class Construct1
{
	public static void main(String []args)
	{
		Demo d1 = new Demo();
		d1.fun1();
		
	}
}