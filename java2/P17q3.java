import java.awt.*;
import javax.swing.*;
public class P17q3 extends JFrame
{
  static final int n=3;
  public P17q3()
  { Container c=getContentPane();
   setLayout(new GridLayout(3,2));
   c.add(new JButton(" "+"Button 5"));
  c.add(new JButton(" "+"Button 5"));
  c.add(new JButton(" "+"Button 5"));
c.add(new JButton(" "+"Button 5"));
c.add(new JButton(" "+"Button 5"));


 
}
  public static void main(String a[])
  {
    P17q3 p=new P17q3();
    p.setSize(300,300);
    p.setVisible(true);
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
   