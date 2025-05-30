class Sup
{
 int l,b,h;
 void get(int x,int y,int z)
 {
  l=x; b=y; h=z;
 }
}
class Sub extends Sup
{
 void cal()
 {
  System.out.println("area=  "+(l*b)+"  volume=  "+(l*b*h));
 }
}
class Peight4
{
 static public void main(String args[])
 {
  Sub s1=new Sub();
   s1.get(2,3,4);
   s1.cal();
}
}