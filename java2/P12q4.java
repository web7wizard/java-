import java.util.Scanner;
class myex extends Exception
{
   myex(String str)
   {
  super(str);
  }
}

class P12q4
{
 public static void main(String args[])
 {
  int pw=1234;
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  try
  {
    if(pw==n)
    {
     System.out.println("correct passward");
    }
    else
    {
     throw new myex("invalid passward");
    }
 }
 catch(myex e)
 {
     System.out.println(e);
  }
}
}