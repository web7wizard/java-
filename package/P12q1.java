class Pr12q1
{
 public static void main(String args[])
 {
   int a,b,c;
  try
  {
   a=Integer.parseInt(args[0]);
   b=Integer.parseInt(args[1]);
   c=a/b;
   System.out.println(c);
  }
  catch(ArithematicException e)
  {
 System.out.println(e);
  }
 catch(ArrayIndexOutOfBoundException s)
  {
 System.out.println(s);
  }
   catch(NumberFormatException p)
  {
 System.out.println(p);
  }
  finally
  {
   System.out.println("done");
  }
}
}
  
 