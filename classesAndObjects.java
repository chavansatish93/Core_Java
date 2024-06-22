class Nokia
{
	private int mic;
	private char cam;
	
	void setvalue()
	{
		mic = 8;
		cam = 'S';
	}
	
	void display()
	{
		System.out.println(mic);
		System.out.println(cam);
	}		
	
}


class classesAndObjects
{
	public static void main(String[] Agrs)
	{
		Nokia n1  = new Nokia();
		
		n1.display();
		n1.setvalue();
		n1.display();
	}
	
}