import java.net.*;
class P24q4
{
 public static void main(String a[]) throws MalformedURLException
 {
   URL u=new URL("http://www.msbte.org.in:80/index.html");
   System.out.println("procol is "+u.getProtocol());
   System.out.println("Host is "+u.getHost());
   System.out.println("port is "+u.getPort());
   System.out.println("file is "+u.getFile());
 }
}

/*
procol is http
Host is www.msbte.org.in
port is 80
file is /index.html
*/