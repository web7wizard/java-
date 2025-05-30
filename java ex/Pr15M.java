import java.awt.*;
import java.awt.event.*;
public class Pr15M extends Frame
{
  MenuBar mbr=new MenuBar();
  Menu f,e,sa;
  MenuItem n,o,sapdf,sawd,cu,pas;
  CheckboxMenuItem m= new CheckboxMenuItem("demo");
  
  Pr15M(String str)
  {
   super(str);
   setMenuBar(mbr);
   f= new Menu("file");
   e= new Menu("edit");
   sa= new Menu("save as");
   n= new MenuItem("new");
   o= new MenuItem("open");
   sapdf= new MenuItem("save as pdf");
   sawd= new Menu("save as word");
   cu= new Menu("cut");
  pas= new MenuItem("paste");
  mbr.add(f);
  mbr.add(e);
  f.add(n);
  f.add(o);
  f.addSeparator();
  f.add(sa);
  sa.add(sapdf);
  sa.add(sawd);
  e.add(cu);
  e.add(pas);
  e.add(m);
  
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
   Pr15M d=new Pr15M("menu demo");
 }
}
  

   