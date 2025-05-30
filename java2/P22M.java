import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class P22M extends JFrame implements ActionListener
{
  String str="";
  TextField f=new TextField("hello");
  Container c=getContentPane();
  public P22M()
  {
    c.add(f);
    setLayout(new FlowLayout());
    f.addActionListener(this);
  }
 public void actionPerformed(ActionEvent e)
  {
    str="you are changing text";
    repaint();
  }
  public void paint(Graphics g)
  {
   g.drawString(str,300,400);
  }
  public static void main(String args[])
	{
		P22M m1=new P22M();
		m1.setSize(800,800);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}