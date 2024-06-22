import java.io.*;
class ExceptionH4
{
	public static void main(String[] args) throws Exception //( includes ClassNotFound,Sql, IO and runtime exceptions)
	{
		System.out.println("A");
		throw new IOException();
	}
}