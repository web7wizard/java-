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

   Pseven(Pseven p)
   {  this.a=p.a;
      this.b=p.b;
   // system.out.println("here=  "+this.a+this.b+(this.a+this.b))
   }

}
class Pseven1
{
  public static void main(String args[])
  {
   Pseven p1=new Pseven();
   Pseven p2=new Pseven(30,40);
    Pseven p3=new Pseven(p2);
   p1.show();
   p2.show();
p3.show();
  }
}
   