import java.util.Scanner;
class P6	 
{
  public static void main(String args[])
  {  
    String s1=new String("welcome");
    String s2=new String("welcome");
    String s;
   s= s1.toUpperCase();
   System.out.println("after converting welcome to uppercase "+s);
  s=  s1.toLowerCase();
   System.out.println("after converting welcome to lowercase "+s);
   
    System.out.println("after converting concat  "+s1.concat(s2));
   String s3="hello      java";
   System.out.println("after trim hello   java  "+s3.trim());
 System.out.println("after compare "+s1+s2+"="+s1.compareTo(s2));
  System.out.println("after checking eqaul ignoring case "+s1+s2+ "  "+s1.equalsIgnoreCase(s2));
  System.out.println("after trim welocme to java  "+s1.charAt(5));
   
 }
}