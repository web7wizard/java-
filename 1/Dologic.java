class Dologic
{
  public static void main(String args[])
  {
    int a=12;
    do
    {
     if(a%2==0 && a!=0)
      {
      System.out.println("full satisfy");
      }
    else if(a%2==0 || a!=0)
     {
      System.out.println("half satisfy");
     }
     else if(a==0)
     {
     System.out.println("not satisfy");
     }
    a--;
  }while(a!=0);
}
}
