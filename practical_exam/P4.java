import java.util.Scanner;
class P4
{
  public static void main(String args[])
  {  
    int a=1;
    System.out.println("while loop");
    while(a<=20)
    {
     System.out.print(a+"\t");
     a++;
   }

  
     a=1;
    System.out.println("\n"+"do while loop");
    do
    {
     System.out.print(a+"\t");
     a++;
   }while(a<=20);
   int i;
   System.out.println("for loop"); 
   for(i=1;i<=20;i++)
   {
    System.out.print(i+"\t");
   }

 }
}