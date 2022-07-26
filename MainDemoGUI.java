//GUI First Program
import java.awt.*;
import javax.swing.*;
class MainDemoGUI
{
	public static void main(String args[])
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();
		FlowLayout flw=new FlowLayout();
		con.setLayout(flw);
		
		JButton btn1=new JButton("Click Me 1");
		JButton btn2=new JButton("Click Me 2");
		JButton btn3=new JButton("Malik");
		
		
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);

		frm.setSize(600,1000);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
