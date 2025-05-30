import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class P21q4 extends JFrame 
{
	String msg; 
        JScrollPane js;
	JLabel in=new JLabel("Name ");
	JLabel res=new JLabel("comments ");
	JTextArea result=new JTextArea(5,5);
	JTextField input =new JTextField(20);
	JButton bubs=new JButton("submit");

	GridBagConstraints cb=new GridBagConstraints();
	Container c=getContentPane();

	P21q4()
	{
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
                int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		setLayout(new GridBagLayout());
                js=new JScrollPane(result,v,h);
		addGB(in,1,1);
		addGB(input,2,1);
		addGB(res,1,2);
		
                addGB(js,2,2);
		addGB(bubs,2,3);
               
		
	}

	void addGB(Component comp,int x,int y)
	{
		cb.gridx=x;
		cb.gridy=y;
		c.add(comp,cb);
	}
       public static void main(String args[])
	{
		P21q4 m1=new P21q4();
		m1.setSize(800,800);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

