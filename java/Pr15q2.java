import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent.*;
public class Pr15q2 extends Frame
{
  MenuBar mbr=new MenuBar();
  Menu f;
  MenuItem r,g,b;
  CheckboxMenuItem m= new CheckboxMenuItem("demo");
  MenuShortcut ms=new MenuShortcut(KeyEvent.VK_P,false);
  MenuItem w= new MenuItem("white",ms);
  Pr15q2(String str)
  {
   super(str);
   setMenuBar(mbr);
   f= new Menu("colour");
   b= new MenuItem("black");
   r= new MenuItem("Red");
   g= new MenuItem("green");
  //w= new Menu("white",ms);
   
  b.setEnabled(false);
   mbr.add(f);
  f.add(r);
  f.add(g);f.add(b);f.add(w);
  //f.addSeparator();
  
 setSize(400,400);
 setVisible(true);

 
 addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
 });
}
public static void main(String a[])
 {
  
   Pr15q2 d=new Pr15q2("menu demo");
   
  
 }
}
  

   