class Samsung
{
	int x,y;
	
	Samsung(int p , int q)
	{
       x = p; 
	   y = q;
	   System.out.println("Parents constructor executed..");
	   System.out.println(x+y);
	   System.out.println(x*y);
	   System.out.println(x-y);
	   System.out.println(x/y);
	}
	
	void function1()
	{
	}
	
	void function2()
	{
	}
}

class Samsung1 extends Samsung
{
	Samsung1()
	{
		super(6,7);
		System.out.println("Childs constructor executed..");
		
	}
	
	void func3()
	{
	}
	
}
	
class Inherit 
{
	public static void main(String[] args)
	{
		Samsung1 s1 = new Samsung1();
	}
}