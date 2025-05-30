abstract class Figure
{
 int l,b;
 abstract void area();
}
class Triangle extends Figure
{
 void getdata(int x,int y)
 {
  l=x; b=y;
 }
 void area()
 { System.out.println((l*b)/2); }
}
class Rectangle extends Figure
{
 void getdata(int x,int y)
 {
 l=x; b=y;
 }
 void area()
 {
 System.out.println(l*b);
 }
}
class Utq7
{
 public static void main(String args[])
 {
  Figure f;
  Triangle t1=new Triangle();
  Rectangle r1=new Rectangle();
 t1.getdata(4,5);
 r1.getdata(2,3);
f=t1;
f.area();
f=r1;
f.area();
}
}
