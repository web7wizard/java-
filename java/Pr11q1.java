class Thread1 extends Thread
{
  public void run()
   {
     for(int i=1;i<=5;i++)
     {
       System.out.println("t1=  "+i);
     }
  }
}
class Thread2 implements Runnable
{
  public void run()
  {
   for(int i=1;i<=5;i++)
   {
     System.out.println("t2=  "+i);
   }
  }
}
class Pr11q1
{
  public static void main(String args[])
  {
  Thread1 t1=new Thread1();
  Thread2 t2=new Thread2(t1);
  t2.start();
// t2.start();
  }
}

