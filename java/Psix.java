class Psix
{
    public static void main(String args[])
    {    String s="jiya";
         int a=10;
         Integer I= new Integer(a);
         float f=11.2f;

         Float F = new Float(f);
         String so=new String(s);
         System.out.println("primitive to object conversion "+I+F+so);

         int i=I.intValue();
         float p=F.floatValue();
         System.out.println("object to primitive conversion "+i+p);
          
          int num=13;
          String str;
          str=Integer.toString(num);
         System.out.println("number to string conversion "+str);
          String jk="100";
         Integer M;
         M=Integer.valueOf(jk);
         System.out.println("string object to numaric conversion "+M);
        
        int ll=Integer.parseInt(jk);
        System.out.println("numaric string   to number conversion "+ll);
   
         Integer In=10;
       double d=In.doubleValue(); 
       System.out.println("double " +d);
       byte b=In.byteValue();  System.out.println("byte"+b);
       short sh=In.shortValue(); System.out.println("short"+sh);
         
    
        
        
    }
}