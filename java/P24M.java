import java.net.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
class P24M extends Frame implements ActionListener
{
  TextField f=new TextField();
  TextArea a=new TextArea();
  String s="";
  P24M()
  {
   add(f,BorderLayout.NORTH);
   add(a,BorderLayout.CENTER);
   f.addActionListener(this);
   setSize(300,300);
  }
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource()==f)
   {
    try
     {
       URL u=new URL(f.getText());
       URLConnection con=u.openConnection();
       BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
       int len=con.getContentLength();
       if(len!=0)
       {
         while((s=br.readLine())!=null)
         a.append("\n"+s);
         br.close();
       }
      else
       a.append("\n"+"content unavailable");
      }
     catch(Exception ae){}
   }
 }
public static void main(String a[])throws Exception
  {
    P24M p=new P24M();
   p.setVisible(true);
}
}

   