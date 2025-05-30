class Pseven
{
  int a,b;
   Pseven()
   {
   a=10; b=20;
   }
   Pseven(int x,int y)
   {
    a=x; b=y;
   }
   public void show()
  {
   System.out.println("here=  "+a+b+"= "+(a+b));
}
}
class Pseven1
{
  public static void main(String args[])
  {
   Pseven p1=new Pseven();
   Pseven p2=new Pseven(30,40);
   p1.show();
   p2.show();
  }
}
   