interface i1
{
	int x=6; //static members can be inherited
	void f1();
static void f2() //static function cannot be inherit
{
 System.out.println(x);
}

}

interface i2 extends i1{
	int x =9; //we can override static members
	int y=2;
static void f2() //static function cannot be inherit
{
 System.out.println(x);
}

void f3();
}

class C1 implements i2{
static void f2() 
{
 System.out.println(x);
}

public void f1()
{
}

public void f3()
{
}
	
}

class InterF
{
  public static void main(String[] args)
  {
	  i2.f2();
	  //C1 c1 = new C1();
	  //System.out.println(c1.x);
	  //System.out.println(c1.y);
	  //i1.f2();
	  
  }
}