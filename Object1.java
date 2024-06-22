class Mahesh
{ 
  int x; //instance(object) member variable
 static int y;
	
	static void fun1() //instance(object) member function 
	{
	System.out.println("fun1");
	}
	
	static void fun2()  //instance(object) member function 
	{
	System.out.println("fun2");	//giving static for printing function
	}
	
}

class Object1
{
	public static void main(String[] args)
	{
	 Mahesh m1 = new Mahesh();
	 m1.x=5;
	 System.out.println(m1.y);
     System.out.println(m1.x);	
     Mahesh.fun1(); //calling outside function from outside class
     Mahesh.fun2();	 
	
	}
	
}