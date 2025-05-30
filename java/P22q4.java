import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class P22q4 extends JFrame implements ActionListener
{
  
  JLabel l1=new JLabel("first number");
   JLabel l2=new JLabel("second number");
   JLabel b6=new JLabel("result");
   //JLabel l3=new JLabel("Result of operation");
   JButton b1= new JButton(" "+"+");
  
   
   JTextField n1=new JTextField(10);
   JTextField n2=new JTextField(10);
   JTextField n3=new JTextField(10);
   GridBagConstraints cb=new GridBagConstraints();
    Container c=getContentPane();

   public P22q4()
   {
  
   setLayout(new GridBagLayout());
   

    addc(l1,1,1); addc(n1,2,1); addc(l2,1,2); addc(n2,2,2);
    addc(b1,1,3); 
   
   addc(b6,1,4); addc(n3,2,4);
  
  b1.addActionListener(this);  
 
   
  


   }
   
  public void actionPerformed(ActionEvent e)
  { 
   Object source=e.getSource();
   if(source==b1)
  { n3.setText(Integer.parseInt(n1.getText())
    +Integer.parseInt(n2.getText())+"  ");}
   
 }  
    void addc(Component comp,int x,int y)
	{
		cb.gridx=x;
		cb.gridy=y;
		c.add(comp,cb);
	}
  

  public static void main(String a[])
  {
    P22q4 p=new P22q4();
    p.setSize(300,300);
    p.setVisible(true);
    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
   