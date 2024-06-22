import javax.swing.*;
import java.awt.event.*;
class LoginPage extends JFrame
{
	JLabel f,s,t,l;
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	
	LoginPage()
	{
	}
	
	LoginPage(String s1)
	{
		super(s1);
	}
	
	void setComponents()
	{
	f = new JLabel("Welcome To the Login Page");
	s = new JLabel("Username");
	t = new JLabel("Password");
	l = new JLabel();
	
	t1 = new JTextField();
	t2 = new JPasswordField();
	
	b1 = new JButton("LOGIN");
	b2 = new JButton("Clear");

    add(f);
	add(s);
	add(t);
	add(l);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	setLayout(null);	
	
f.setBounds(100,50,300,30);
s.setBounds(100,200,100,30);
t.setBounds(100,350,100,30);
l.setBounds(100,550,200,30);
t1.setBounds(350,200,100,30);
t2.setBounds(350,350,100,30);
b1.setBounds(200,450,100,30);
b2.setBounds(400,450,100,30);


}


	public static void main(String[] args)
	{
     LoginPage p1 = new LoginPage("Login Page");
	 p1.setVisible(true);
	 p1.setSize(800,800);
	 p1.setComponents();
	 p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}

class Login implements ActionListener
{
	public void actionPerformed(ActionEvent e1)
	{
	 String s1 = t1.getText();
	 String s2 = t2.getText();
	 
	 if(s1.equals("Satish") && s2.equals("1432"))
	 {
		 l.setText("Login Successful");
	 }
	 else 
	 {
		 l.setText("Invalid Creditials");
	 }
	}	

}
}




