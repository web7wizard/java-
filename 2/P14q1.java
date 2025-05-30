import java.awt.*;
import java.awt.event.*;


public class P14q1 extends Frame
{ // GridBagConstraints cb=new GridBagConstraints();
   Label l1,l2;
  Checkbox c1,c2,c3,c4,c5;
   CheckboxGroup cb=new CheckboxGroup();
  
  P14q1()
  { //setLayout(new GridBagLayout());
     //int x,y;
    setLayout(new GridLayout (10,3,4,4));
   
    l1=new Label("select hobbies ");
    c1=new Checkbox("singing",false);
    c2=new Checkbox("dancing",false);
    c3=new Checkbox("reading",false); add(l1);
    add(c1); add(c2); add(c3);
    l2=new Label("choose gender");
    c4=new Checkbox("male",cb,false);
     c5=new Checkbox("female",cb,false);
    add(l2);
    add(c4); add(c5);
   
  
}
  public static void main(String args[])
  {
   P14q1 p=new P14q1();
   p.setSize(300,400);
   p.setVisible(true);
p.addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
 });

  
  }
}