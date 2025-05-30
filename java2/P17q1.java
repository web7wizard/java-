import java.awt.*;
import javax.swing.*;
public class P17q1 extends JFrame
{
  static final int n=5;
  public P17q1()
  { Container c=getContentPane();
   setLayout(new GridLayout(n,n));
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
      {
        int k=i*n+j;
         //if(k>0)
        add(new JButton(" "+(k+1)));
      }
   }
}
  public static void main(String a[])
  {
    P17q1 p=new P17q1();
    p.setSize(300,300);
    p.setVisible(true);
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
   