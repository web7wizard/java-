import java.util.Scanner;
class NotmatchException extends Exception
{
   NotmatchException(String str)
   {
  super(str);
  }
}

class Pr13q4
{
 public static void main(String args[])
 {
  String str;
  String s="india";
  Scanner sc=new Scanner(System.in);
  str=sc.next();
  try
  {
    if((str.compareTo(s))==0)
    {
     System.out.println("i love india");
    }
    else
    {
     throw new NotmatchException("invalid input");
    }
 }
 catch(NotmatchException e)
 {
     System.out.println(e);
  }
}
}