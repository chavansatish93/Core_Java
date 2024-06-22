import java.io.*;
class FileHand1
{
	public static void main(String[] args) throws IOException
	{
	 String s1 = "Hello, good morning";
	 FileOutputStream f1 = new FileOutputStream("a.txt",true);
	 char c1[] = s1.toCharArray();
	 int i;
	 
	 for(i=0;i<c1.length;i++)
	 {
	    f1.write(c1[i]);
	 }
	 
	 f1.close();
	}
}