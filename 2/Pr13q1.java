class Pr13q1
{
 void display() throws ArithmeticException,NullPointerException
 {
  int a=10,b=2;
  String str=null;
  System.out.println(a/b);
  System.out.println(str.charAt(1));
 }

public static void main(String args[])
 {
 Pr13q1 t=new Pr13q1();
 try
 {
  t.display();
 }
catch(ArithmeticException a)
 { 
  System.out.println(a);
 }
 catch(NullPointerException e)
 { 
  System.out.println(e);
 }
}
}


  