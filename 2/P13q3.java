import java.util.Scanner;
class myex extends Exception
{
   myex(String str)
   {
  super(str);
  }
}

class P13q3
{
 public static void main(String args[])
 {
  System.out.print("enter only even no= ");
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  try
  {
    if(n%2==0)
    {
     System.out.println("good");
    }
    else
    {
     throw new myex("i tell you to enter  even number");
    }
 }
 catch(myex e)
 {
     System.out.println(e);
  }
}
}