//int[] arr= new int[20];
//JButton[] btn= new JButton[20];
//btn[0]= new JButton(1+"");
import java.awt.*;
import javax.swing.*;

class MainDemoGUIArray
{
	public static void main(String[] arg)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		FlowLayout flw= new FlowLayout();//create layout object
		con.setLayout(flw);//set the layout of workable area
		//create GUI controls
		JButton[] btn= new JButton[20];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton((i+1)+"");
			con.add(btn[i]);
		}
		frm.setSize(200,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);		
	}

}