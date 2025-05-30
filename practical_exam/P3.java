import java.util.Scanner;
class P3
{
  public static void main(String args[])
  {  Scanner sc=new Scanner(System.in);
      System.out.println("enter two number");
      int a,b;
      a=sc.nextInt(); b=sc.nextInt();
      System.out.println("enter a:add s:sub m:mul d:div");
     String ch=sc.next();
     switch(ch)
     {
     case "a":
      System.out.println("add="+(a+b)); break;
      case "s":
      System.out.println("sub="+(a-b)); break;
     default:
      System.out.println("wc");
    }
 }
}