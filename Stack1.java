import java.util.*;
class Stack1
{
	public static void main(String[] args)
	{
		Stack s1 = new Stack ();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.pop();
		
		System.out.println(s1);
		System.out.println(s1.search(30));
	}
}