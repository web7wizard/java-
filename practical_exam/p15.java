import java.util.Scanner;
class ex extends Exception
{
 ex(String str)
 {
   super(str);
  }
}
class P15
{
  public static void main(String a[])
  {
    String p="india",pw="";
    Scanner sc=new Scanner(System.in);
    pw=sc.next();
    try
    {
     if(p.equals(pw))
     {
       System.out.println("l love india");
     }
     else
     {
       throw new ex("invalid contry");
     }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}