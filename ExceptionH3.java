class ExceptionH3
{
public static void main(String[] args)
{
int cb = 10000;
//int wb = 4000;
int wb = 12000;

try{

if(cb<wb)
{
throw new ArithmeticException("Insufficient Balance..");
}	
cb = cb-wb;
System.out.println(" Transaction Successful...");	
System.out.println("Current Balance is: "+cb);
}

catch(ArithmeticException n1)
{
System.out.println(n1.getMessage());
System.out.println("Your Current Balance is: "+cb);
}	
}

}