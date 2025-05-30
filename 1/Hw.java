import java.util.Scanner;
class Hw
{
 public static void main(String args[])
  {
    int ft=0;
int ch,rs,q,t;
Scanner sc=new Scanner(System.in);
  do{

    System.out.println("enter 1:tea 100rs  2:coffe  150rs 3:no order");
     System.out.println("enter your choice");
    ch=sc.nextInt();
    switch(ch)
   {
    case 1: rs=100;
            System.out.println("enter amount");
              q=sc.nextInt();
             t=rs*q;
              System.out.println("total bill of tea = "+t);
    ft=ft+t;
   break;

           
  case 2: rs=150;
            System.out.println("enter amount");
              q=sc.nextInt();
             t=rs*q;
              System.out.println("total bill of coffe= "+t);
      ft=ft+t;
  break;
 case 3:
            System.out.println("have a nice day");
           
   break; 
  default:
            System.out.println("wrong choice");
              
     };
}while(ch!=3);


 System.out. println("total bill = "+ft);
}
}
   
           
   
          
   
    