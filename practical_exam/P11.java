class Demo	 
{
    int x,y;
   Demo()
  {
    this.x=10;
    this.y=20;
  }
  Demo(int x,int y)
  {
   this.x=x;
   this.y=y;
  }
  void show()
  {
    System.out.println((x+y)); 
  }
 
}

class P11
{


  public static void main(String args[])
  {  

  Demo d1=new Demo();
  d1.show();
  Demo d2=new Demo(20,40);
  d2.show();
}}

  