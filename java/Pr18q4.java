import javax.swing.*;
import java.util.Vector;
import java.awt.*;
import java.awt.event.*;
public class Pr18q4 extends JFrame implements ItemListener
{
  Vector v=new Vector(10);
  String msg;
  Pr18q4(String str)
  {
   super(str);
   Container contentPane=getContentPane();
   contentPane.setLayout( new FlowLayout());
   v.addElement("Solapur");
   v.addElement("Beguluru");
   v.addElement("Pune");

   JComboBox jc= new JComboBox(v);
  
   
   contentPane.add(jc);
   jc.addItemListener(this);
 }
   public void itemStateChanged(ItemEvent e)
   {
    if(e.getSource()=="solapur")
    { msg="solapur";}
  repaint();
 }
 public void paint(Graphics g)
  {
   g.drawString("you are in "+msg,20,100);
  }
   
 public static void main(String a[])
 {
   Pr18q4 s=new Pr18q4("demo");
  s.setSize(200,300);
  s.setVisible(true);
 s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}




   