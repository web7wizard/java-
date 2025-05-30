class Sup
{
  int x;
  Sup(int a)
  { x=a; }
  void sum()
  { 
   System.out.println("sruare root "+x +"  = " +(x*x));
  }
}
class Sub extends Sup
{
  int x;
  Sub(int a,int b)
  {
  super(a);
  x=b;
  }

 void sum()
 {  super.sum();
   System.out.println("add= "+(x+super.x));}
}
 
class Peight1
 {
   public static void main(String args[])
   {
    Sub s1=new Sub(10,20); 
    s1.sum();
  }
}