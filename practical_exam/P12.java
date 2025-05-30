class D1	 
{
    int x=10;
}
class D3 extends D1
{
   int y=20;
}
class D2 extends D3
{
  int z=30;
  void show()
  {
    System.out.println((x+y+z)); 
  }
 
}

class P12
{
  public static void main(String args[])
  {  
    D2 d=new D2();
    d.show();
  }
}

  