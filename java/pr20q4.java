import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class pr20q4 extends JFrame implements KeyListener
{
  String str="";
  public pr20q4()
  {
     Container c=getContentPane();
   c.setLayout(new BorderLayout());
   addKeyListener(this);
  }
   public void paint(Graphics g)
  {
 
  g.drawString(str,100,100);
  }
   public void keyReleased(KeyEvent e)
   { }
  public void keyPressed(KeyEvent e)
  { 
    str="key pressed";
    repaint();
  }
   
 
   public void keyTyped(KeyEvent e)
  { 
    str="key t";
    repaint();
  }

  public static void main(String a[])
 {  pr20q4 p=new pr20q4(); 
   p.setSize(200,300);
   p.setVisible(true);
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }

} 
