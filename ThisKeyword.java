class Example
{
   private int x,y;
   
   void fun1(int x,int y)
   {
   this.x = x; //'this' is pointer to current object
   this.y = y;
   }
   
   void fun2()
   {
    System.out.println(x);
	System.out.println(y);
   }
   
 }
 
 class ThisKeyword
 {
 public static void main(String[] args)
 {
 Example e1 = new Example();
 e1.fun1(35,45);
 e1.fun2();
 }
 }