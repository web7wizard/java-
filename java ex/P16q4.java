import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class P16q4 extends JFrame
{
  JButton e=new JButton("east");
  JButton w=new JButton("west");
  JButton s=new JButton("south");
  JButton n=new JButton("north");
  JButton ce=new JButton("center");
  P16q4()
  {
   setLayout(new BorderLayout(10,10));
   Container c=getContentPane();
   c.add(e,BorderLayout.EAST);
   c.add(w,BorderLayout.WEST);
   c.add(s,BorderLayout.SOUTH);
   c.add(n,BorderLayout.NORTH);
  c. add(ce,BorderLayout.CENTER);
 }
  public static void main(String a[])
  {
   P16q4 p=new P16q4();
   p.setSize(300,300);
   p.setVisible(true);
   p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
   


  
  