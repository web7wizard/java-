import java.util.Scanner;
class Employee
{
  String name;
  int age;
  void display()
  {
   Scanner sc= new Scanner(System.in);
   name=sc.next();
   age=sc.nextInt();
  System.out.println("name and age= "+name+age);
 }
}
interface Salary 
{
  int basic_salary=1000;
  void basic_sal();
}
class GrossSalary extends Employee implements Salary
{
  int ta,da,hra;
  public void basic_sal()
  {
    System.out.println("basic salary=  "+basic_salary);
  }
  void total_sal()
 {
   int t;
   Scanner s= new Scanner(System.in);
    ta=s.nextInt();
    da=s.nextInt();
    hra=s.nextInt();
  t=basic_salary+(basic_salary*hra)/100+(basic_salary*da)/100+(basic_salary*ta)/100;
   System.out.printf("total salary= "+t);
 }
}
class Utq5
{
  public static void main(String args[])
  {
   GrossSalary r=new GrossSalary();
   r.display(); r.basic_sal();
  r.total_sal();
 }
}
  
    