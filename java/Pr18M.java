import javax.swing.*;
import java.util.Vector;
import java.awt.event.*;
import java.awt.*;


public class Pr18M extends JFrame
{ String msg="";
  ImageIcon d=new ImageIcon("myim.jpg");
  Vector v=new Vector(10);
  Pr18M(String str)
  {
   super(str);
   Container contentPane=getContentPane();
   contentPane.setLayout( new FlowLayout());
   v.addElement(10);
   v.addElement("HELLO");
   JComboBox vc= new JComboBox(v);
   JComboBox jc= new JComboBox();
   jc.addItem(d);
   jc.addItem("second");
   jc.addItem("third");
   jc.addItem("fourth");
   contentPane.add(vc);
  contentPane.add(jc);
   
 }
   
   

 public static void main(String a[])
 {
   Pr18M s=new Pr18M("demo");
  s.setSize(200,300);
  s.setVisible(true);
 s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}




   