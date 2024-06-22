class Area{
	
static void fun1()
{
System.out.println("Area1");
}
static void fun2()
{
System.out.println("Area2");
}
	
}
class Example
{
static void fun1()//it must be static if object is not created
{
System.out.println("A");
}
static void fun2()
{
System.out.println("B");
}
public static void main(String[]args)
{

System.out.println("C");

fun1(); //calling members
fun2();

//we want to access another class then(.) should be called

Area.fun1(); //calling members
Area.fun2();

}

}