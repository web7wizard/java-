import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class pr20q3 extends JFrame implements MouseMotionListener
{
  String str="";
  public pr20q3()
  {
     Container c=getContentPane();
   c.setLayout(new BorderLayout());
   addMouseMotionListener(this);
  }
  public void mouseDragged(MouseEvent e)
  { 
    str="mouse dragged";
    repaint();
  }
    public void mouseMoved(MouseEvent e)
  {
   
    str="mouse Moved";
   repaint();
  }
 public void paint(Graphics g)
 {
 
  g.drawString(str,100,100);
}
  public static void main(String a[])
 {  pr20q3 p=new pr20q3(); 
   p.setSize(200,300);
   p.setVisible(true);
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
} 