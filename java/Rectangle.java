class Rect                                                                                                                                                                                                                                                                                                                                                                                                        
{
 int l,b;
 void getdata(int x, int y)
 { l=x; b=y; }
}
class Rectangle
{
 public static void main(String s[])
 {
  int a;
  Rect r=new Rect();
  r.getdata(10,20);
  a=r.l*r.b;
  System.out.println(a);
}
}