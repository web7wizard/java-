class Pseven
{
  int r,i;
   Pseven(int x,int y)
   {
    r=x; i=y;
   }
   public void show()
  {
   System.out.println("here=  "+r+" "+i+"i");
}
}
class Pseven5
{
  public static void main(String args[])
  {
   Pseven p1=new Pseven(10,20);
   Pseven p2=new Pseven(30,40);
   p1.show();
   p2.show();
   Pseven p3=new Pseven(30,40);
    p3.r=p1.r+p2.r;
     p3.i=p1.i+p2.i;
     p3.show();
  }
}
   