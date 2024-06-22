class A
{
	int x; //instance member variable
	private static int y;
	
	void fun1()
	{
		y = 25;
	}
	
	void fun2()
	{
		System.out.println(y);
	}
	
	void fun3()
	{
		y = 35;
	}
	
}


 class StaticMembers{
	
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		
		a1.fun1();
		a2.fun3();
		a1.fun2();
		
		//static called only once
		
	}
	
}