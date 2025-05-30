import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class P17M extends JFrame implements ActionListener
{
  static final int n=3;
  JLabel l1=new JLabel("first number");
   JLabel l2=new JLabel("second number");
   JLabel b6=new JLabel("result");
   //JLabel l3=new JLabel("Result of operation");
   JButton b1= new JButton(" "+"+");
   JButton b2= new JButton(" "+"-");
   JButton b3= new JButton(" "+"*");
   JButton b4=new JButton(" "+"/");
   JButton b5= new JButton(" "+"%");
   
   JTextField n1=new JTextField(10);
   JTextField n2=new JTextField(10);
   JTextField n3=new JTextField(10);
   
   

   public P17M()
   {
   Container c=getContentPane();
   setLayout(new GridLayout(3,3));
   

    c.add(l1); c.add(n1); c.add(l2); c.add(n2);
    c.add(b1); c.add(b2); c.add(b3); c.add(b4); c.add(b5);
   
   c.add(b6); c.add(n3);
  
  b1.addActionListener(this);  
  b2.addActionListener(this);  
  b3.addActionListener(this); 
  b4.addActionListener(this); 
  b5.addActionListener(this);  
   
  


   }
  
  public void actionPerformed(ActionEvent e)
  { 
   Object source=e.getSource();
   if(source==b1)
  { n3.setText(Integer.parseInt(n1.getText())
    +Integer.parseInt(n2.getText())+"  ");}
   else if(source==b2)
  {n3.setText(Integer.parseInt(n1.getText())
    -Integer.parseInt(n2.getText())+"  ");}
   else if(source==b3)
  {n3.setText(Integer.parseInt(n1.getText())
    *Integer.parseInt(n2.getText())+"  ");}
   else if(source==b4)
  {n3.setText(Integer.parseInt(n1.getText())
    /Integer.parseInt(n2.getText())+"  ");}
   else
  {n3.setText(Integer.parseInt(n1.getText())
    %Integer.parseInt(n2.getText())+"  ");}
 }  
    

  public static void main(String a[])
  {
    P17M p=new P17M();
    p.setSize(300,300);
    p.setVisible(true);
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
   