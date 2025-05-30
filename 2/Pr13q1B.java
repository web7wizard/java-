import java.util.Scanner;
class my extends Exception
{
   my(String str)
   {
  super(str);
  }
}

class Pr13q1B
{
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  try
  {
    if(n>0)
    {
     System.out.println("positive");
    }
    else if(n==0)
    {
      System.out.println("Zero 0-0 ");
    }
   if(n<0 && n!=0)
    {
     throw new my("negative please enter positive");
    }
      
 }
 catch(my e)
 {
     System.out.println(e);
  }
}
}