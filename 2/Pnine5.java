import java.util.Scanner;
class Area
{
 int l,b,r;
void get()
{
 Scanner sc=new Scanner(System.in);
 l=sc.nextInt();
b=sc.nextInt();r=sc.nextInt();
}
}
interface Cal
{ void calc(); }
class Final extends Area implements Cal
{
  public void calc()
  {
   System.out.println("area of rectangle=  "+(l*b));
    System.out.println("area of circle=  "+(3.14*r*r));
  }
}
class Pnine5
{
 public static void main(String args[])
 {
  Final f=new Final();
  f.get();
  f.calc();
}
}