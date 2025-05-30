import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class CP25q5 extends Frame implements ActionListener
{
 TextField f = new TextField(30);
 static TextArea a=new TextArea();
 static Socket s;
 static String msg="";
 static BufferedReader br;
 PrintWriter w;
 CP25q5()
 {
  add(f,BorderLayout.NORTH);
   add(a,BorderLayout.CENTER);
   f.addActionListener(this);   
   try{
    s=new Socket("127.0.0.1",6000);
    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    w=new PrintWriter(s.getOutputStream(),true);
   }
   catch(Exception e){}
  }
public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==f)
  {
   msg=f.getText();
   w.println(msg); 
   if(msg.equals("end"))
   {
    System.exit(0);
  }
f.setText("");
}}
public static void main(String args[])throws Exception
{
 CP25q5 t=new CP25q5();
 t.setSize(100,100);
 t.setVisible(true);
 t.setTitle("client");
 t.addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
 });
 while(true)
 {
  msg=br.readLine();
  a.append("\nServer: "+msg);
  if(msg.equals("end"))
  {
   break;
  }
}
}
}

