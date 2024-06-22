//Multithreading using runnable interface

class Process1 implements Runnable //Ruunable interface is already present in the java
{
public void run() //run function is present inside the interface
{
	int i;
	for(i=1;i<=10;i++)
	{
		System.out.println("Process1:"+i);
	}
}
}
class Process2 implements Runnable
{
public void run()
{
	int i;
	for(i=1;i<=10;i++)
	{
		System.out.println("Process2:"+i);
	}
}
}

class MultiThre
{
 public static void main(String[] args)
 {
	 Process1 p1 = new Process1();
	 Process2 p2 = new Process2();
	 Thread t1=new Thread(p1); //passing process into thread
	 Thread t2=new Thread(p2);
	 t1.start();  //starting the thread
	 t2.start();
 }
}
