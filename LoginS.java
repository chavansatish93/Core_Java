import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginS extends JFrame
{ 
    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);//WAIT,CROSSHAIR
	Font f1 = new Font("Times New Roman",Font.ITALIC,20);
	Font f2  = new Font("Calibri",Font.BOLD,20);
	Font f3  = new Font("Calibri",Font.PLAIN,20);
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3;
LoginS(String s1)
	{
		super(s1);
	}
	
	LoginS()
	{
	}
	
void setComponents()
{
l1 = new JLabel("Please Enter Your Login Creditials");
l1.setFont(f1);//setting font
l1.setForeground(Color.BLUE);
l2 = new JLabel("Username");
l2.setFont(f2);
l2.setForeground(Color.DARK_GRAY);
l3 = new JLabel("Password");
l3.setFont(f2);
l3.setForeground(Color.DARK_GRAY);
l4 = new JLabel();
t1 = new JTextField();
t2 = new JPasswordField();
b1 = new JButton("Submit");
b1.setBackground(Color.GREEN);
b1.setForeground(Color.BLACK);
b2 = new JButton("Clear");
b2.setBackground(Color.GREEN);
b2.setForeground(Color.BLACK);
b3 = new JButton("AutoFill");
b1.setCursor(c1);
b2.setCursor(c1);
b3.setCursor(c1);
setLayout(null);

add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);

l1.setBounds(200,50,300,30);
l2.setBounds(100,200,100,30);
l3.setBounds(100,350,100,30);
l4.setBounds(100,550,200,30);
t1.setBounds(270,200,100,30);
t2.setBounds(270,350,100,30);
b1.setBounds(100,450,100,30);
b2.setBounds(265,450,100,30);
b3.setBounds(450,450,100,30);
b3.setBackground(Color.RED);
b1.addActionListener(new Submit());
b2.addActionListener(new Clear());
b3.addActionListener(new AutoFill());
l2.addMouseListener(new MouseL());
}

class MouseL implements MouseListener
{
	public void mouseExited(MouseEvent e1)
	{
		l2.setText("Username");
	}
	
	public void  mouseEntered(MouseEvent e1)
	{
		l2.setForeground(Color.red);
	}
	
	public void  mouseReleased(MouseEvent e1)
	{
		l2.setForeground(Color.black);
	}
	
	public void mousePressed(MouseEvent e1)
	{
	}
	
	public void  mouseClicked(MouseEvent e1)
	{
		l2.setText("");
	}
}
public static void main(String [] args)
{
 LoginS s1 = new LoginS("Welcome to Login Page!");

s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class Submit implements ActionListener
{
	public void actionPerformed(ActionEvent e1)
	{
	String s1 = t1.getText();
	String s2 = t2.getText();
	
	if(s1.equals("Satish") && s2.equals("12345"))
	{
		JOptionPane.showMessageDialog(null,"Login Successful");
		//l4.setText("Login Successful");
	}
	else
		JOptionPane.showMessageDialog(null,"Login UnSuccessful");
		//l4.setText("Login Unsuccessful");
	}	
	
	
}


class Clear implements ActionListener
{
	public void actionPerformed(ActionEvent e1)
	{
		t1.setText("");
		t2.setText("");
	}
}

class AutoFill implements ActionListener
{
	public void actionPerformed(ActionEvent e1)
	{
 t1.setText("Satish");
 t2.setText("12345");
}
}
}