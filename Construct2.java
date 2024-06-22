class Demo
{
	int x,y,z;
	
	Demo()
	{
	}
	
	Demo(int s)
	{
		x = s;
	}
	
	/*Demo(int p , int q)
	{
	  x = p;
	  y = q;

	}
	
	Demo(int p , int q,int r)
	{
	  x = p;
	  y = q;
      z =r;
	} */
	
	
	
	/*void fun1()
	{
	 
		x = 45;
		y = 56;
		
	}*/
	
}

class Construct2
{
	public static void main(String []args)
	{
		//Demo d1 = new Demo();
		Demo d2 = new Demo(5);
		// Demo d3 = new Demo(5,6);
		// Demo d4 = new Demo(5,6,7);
		
	}
}