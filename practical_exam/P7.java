import java.util.Scanner;
class P7	 
{
  public static void main(String args[])
  {  

  StringBuffer s1=new StringBuffer("pello");
  s1.setCharAt(0,'h');
  System.out.println(s1);
  s1.append("  java");
 
  System.out.println(s1);
 s1.setLength(20);
  
  System.out.println(s1);
s1.insert(5,"to");

  System.out.println(s1); 
   
 }
}