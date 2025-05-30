import java.util.Scanner;
class myex extends Exception
{
   myex(String str)
   {
  super(str);
  }
}

class Pr12q3
{
 public static void main(String args[])
 {
  int age;
  Scanner sc=new Scanner(System.in);
  age=sc.nextInt();
  try
  {
    if(age>18)
    {
     System.out.println("valid age for vote");
    }
    else
    {
     throw new myex("invalid age for vote");
    }
 }
 catch(myex e)
 {
     System.out.println(e);
  }
}
}