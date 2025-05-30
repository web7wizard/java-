import java.util.*;
class Vectorc
{
  public static void main(String a[])
  {
    Vector v1=new Vector();
    System.out.println("size= "+v1.size());
    int i;
    for(i=0;i<a.length;i++)
    {
      v1.addElement(a[i]); 
    }
     int l=v1.size();
      for(i=0;i<l;i++)
    {
      System.out.println(v1.elementAt(i));
    }
 System.out.println(v1);
  }
}