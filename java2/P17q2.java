import java.awt.*;
import javax.swing.*;
public class P17q2 extends JFrame
{
  static final int n=3;
  public P17q2()
  { Container c=getContentPane();
   setLayout(new GridLayout(n,n));
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
      {
        int k=i*n+j;
         //if(k>0)
        add(new JButton(" "+k));
      }
   } add(new JButton(" "+9));
}
  public static void main(String a[])
  {
    P17q2 p=new P17q2();
    p.setSize(300,300);
    p.setVisible(true);
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
   