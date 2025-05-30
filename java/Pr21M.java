import javax.swing.*;
import java.util.Vector;
import java.awt.event.*;
import java.awt.*;


public class Pr21M extends JFrame implements ActionListener
{  
  String msg="";
  JButton b= new JButton("click me");
  Pr21M()
  {
   
   Container contentPane=getContentPane();
   contentPane.setLayout( new FlowLayout());
   contentPane.add(b);
  

   b.addActionListener(this);
 }
   public void actionPerformed(ActionEvent e)
   {
    
    msg="clicked";
  repaint();
 }
 public void paint(Graphics g)
  {
   g.drawString("button  "+msg,20,100);
  }

 public static void main(String a[])
 {
   Pr21M s=new Pr21M();
  s.setSize(200,300);
  s.setVisible(true);
 s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

