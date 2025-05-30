class T1 extends Thread
{
   public void run()
   {
    for(int i=1;i<10;i++)
    {
      System.out.println("t1= "+i);
    }
   }
}
class T2 extends Thread
{
   public void run()
   {
    for(int i=1;i<10;i++)
    {
      System.out.println("t2= "+i);
    }
   }
}
class T3 extends Thread
{
   public void run()
   {
    for(int i=1;i<10;i++)
    {
      System.out.println("t3= "+i);
    }
   }
}

class P14
{
  public static void main(String args[])
  {  
    T1 t1=new T1();
    T2 t2=new T2();
    T3 t3=new T3();
    t1.setPriority(t1.getPriority()+3); 
 //  t3.setPriority(Thread.Max_PRIORITY);
    
    t1.start();
    t2.start(); t3.start();
    
  }
}
