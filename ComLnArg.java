//Command Line Argument example

class ComLnArg  
{
	public static void main(String[] args)//we have to pass value while executing class file
	{
		int i,S=0;
		
		for(i=0;i<args.length;i++)
		{
		 S = S + Integer.parseInt(args[i]); //this will sum the value
		}
		 System.out.println("Average is: "+S/args.length); //this will show average
	}
	
}