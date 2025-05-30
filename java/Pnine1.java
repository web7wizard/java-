import java.util.Scanner;
class Stud
{
 String name;
 int rollno;
void get()
{
 Scanner sc=new Scanner(System.in);
 name=sc.next();
 rollno=sc.nextInt();
}
}
class Mark extends Stud
{
 int m1=91,m2=98,m3=88,m4=85;
 }
interface Sports
{  int sm=90; }
class Result extends Mark implements Sports
{
 int r;
 void cal()
 {  System.out.println("name rollno marks  "+name+rollno+m1+m2+m3+m4+sm);
    //System.out.print("rollno=%d marks= %d %d %d %d",rollno,m1,m2,m3,m4);
  r=(m1+m2+m3+m4+sm)/5;
  System.out.println("per= "+r);
 }
}
class Pnine1
{
 static public void main(String args[])
 {
  Result r1=new Result();
 r1.get();
  r1.cal();
 }
}
  