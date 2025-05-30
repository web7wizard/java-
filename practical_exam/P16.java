import java.util.*;
import java.awt.*;
class P16 extends Frame
{
  P16()
  {
    setLayout(new FlowLayout());
    Button b1=new Button("ok");
    Button b2=new Button("Reset");
    Button b3=new Button("CANCEL");
    add(b1); add(b2); add(b3);
 }
 public static void main(String a[])
  {
   
    P16 p=new P16();
   p.setSize(300,400);
   p.setVisible(true);
  }
    }