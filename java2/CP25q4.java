import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class CP25q4 extends Frame implements ActionListener
{
 TextField f1 = new TextField(4);
 TextField f = new TextField(4);
 String p="itsme";
 static TextArea a=new TextArea();
 static Socket s;
 static String msg="";
 static BufferedReader br;
 PrintWriter w;
 CP25q4()
 {
   
  add(f1,BorderLayout.NORTH);
  add(f,BorderLayout.CENTER);
  add(a,BorderLayout.SOUTH);
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
 CP25q4 t=new CP25q4();
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

