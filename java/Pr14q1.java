import java.awt.*;
public class Pr14q1 extends Frame
{  Checkbox c1,c2,c3,c4,c5;
   CheckboxGroup cb=new CheckboxGroup();
  Pr14q1()
  { setLayout( new FlowLayout (FlowLayout.LEFT,10,10));
    c1=new Checkbox("singing",false);
    c2=new Checkbox("dancing",true);
    c3=new Checkbox("reading",true);
    add(c1); add(c2); add(c3);
    c4=new Checkbox("male",cb,false);
     c5=new Checkbox("female",cb,true);
    add(c4); add(c5);
  }
  public static void main(String args[])
  {
   Pr14q1 p=new Pr14q1();
   p.setSize(300,400);
   p.setVisible(true);
  
  }
}
    