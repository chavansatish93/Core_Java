//accessing private function without creating object

class Satish
{
	private static int x;
	
	static void fun()
	{
		x=5; //if want to access it then make function static
	}	
	
}

class Object2{
	public static void main(String[]args)
	{
		Satish.fun(); //this will call private member variable x without objcet
	
	}
}