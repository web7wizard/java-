import java.io.*;
import java.net.*;
import java.util.Scanner;
public class P23q4
{
  public static void main(String a[]) 
  {
   try{
    String localhost="";
    Scanner sc=new Scanner(System.in);
     localhost=sc.next();
     InetAddress ip=InetAddress.getByName(localhost);
     System.out.println("host name = "+ip.getHostName());
     System.out.println("IP addres = "+ip.getHostAddress());
      }
catch(Exception e) {System.out.println(e);}
}
}