import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class SP25q4 extends Frame implements ActionListener
{
 TextField f = new TextField(30);
 static TextArea a=new TextArea();
 static Socket s;
 static String msg="";
 static BufferedReader br;
 PrintWriter w;
 SP25q4()
 {
    setSize(100,100);
 setVisible(true);
 setTitle("server");
 addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
 });



   add(f,BorderLayout.NORTH);
   add(a,BorderLayout.CENTER);
   f.addActionListener(this);   
   try{
    ServerSocket p=new ServerSocket(6000);
    s=p.accept();
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
 SP25q4 t=new SP25q4();
  String p="itsme";
  String op;
 while(true)
 {
  msg=br.readLine();
  if(msg.equals(p))
  {
   op="s";
  }
  else{op="n"; }
  a.append("\nClient: "+op);
  if(msg.equals("end"))
  {
   break;
  }
}
}
}

