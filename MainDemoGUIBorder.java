import java.awt.*;
import javax.swing.*;

class MainDemoGUIBorder
{
	public static void main(String[] arg)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		BorderLayout bl= new BorderLayout();//create layout object
		con.setLayout(bl);//set the layout of workable area
		//create GUI controls
		String[] strDirection={"North","South","East","West","Center"};
		JButton[] btn= new JButton[5];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton(strDirection[i]);
			con.add(btn[i],strDirection[i]);	

		}
		//con.add(btn[0],BorderLayout.NORTH);	
		//con.add(btn[1],"South");
		//con.add(btn[2],"East");
		//con.add(btn[3],BorderLayout.WEST);
		//con.add(btn[4],BorderLayout.CENTER);
		frm.setSize(400,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);		
	}

}