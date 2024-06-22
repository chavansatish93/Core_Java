abstract class Demo //once abstract class created its object cannot create
{
	int x,y;
	void f1()
	{
		
	}
abstract void f2(); //abstract function, let if we overload this into child class then the child class has to be abstract
Demo() //calling constructor
{
	System.out.println("Parent's Constructor executed...");
}

}	
class Demo1 extends Demo
{
	Demo1() //calling constructor
{
	System.out.println("Child's Constructor executed...");
}	
	int z;
	void f3()
	{
	z=8;
	}
	void f2() //overriding function of abstract class to create object
	{
	
	}
	
}
	

class Abs
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
	}
}