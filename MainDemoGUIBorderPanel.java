import java.awt.*;
import javax.swing.*;

class MainDemoGUIBorderPanel
{
	public static void main(String[] arg)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		BorderLayout bl= new BorderLayout();//create layout object
		con.setLayout(bl);//set the layout of workable area
		Panel pnl= new Panel();
		pnl.setLayout(new GridLayout(5,4));
		//create GUI controls

		JButton[] btn= new JButton[20];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton((i+1)+"");
			pnl.add(btn[i]);	

		}
		TextField txt=new TextField();
		con.add(txt,BorderLayout.NORTH);	
		con.add(pnl,BorderLayout.CENTER);
		frm.setSize(400,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);		
	}

}