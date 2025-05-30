import java.util.Vector;
class P8	 
{
  public static void main(String args[])
  {  

  Vector v1=new Vector(10);
  v1.addElement(4);
  v1.addElement("jiya");v1.addElement("jk");v1.addElement(13.4);
  System.out.println(v1);
  
  System.out.println(v1.size());
  v1.removeElement(4);
  v1.removeElementAt(2);
  System.out.println(v1);
    

   
 }
}