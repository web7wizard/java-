class Strclass
{
 public static void main(String args[])
  {
     String s1="welcome";
     String s2="      to java";
      String s;

      s=s1.toUpperCase();
      System.out.println(s);

       s=s1.toLowerCase();
      System.out.println(s);

     s=s1.replace('w','k');
     System.out.println(s);

    
    System.out.println(s2.trim());
    
    System.out.println(s1.equals(s2));  
   
   
     System.out.println(s1.equalsIgnoreCase(s2));

    
     System.out.println(s1.charAt(1));

   
     System.out.println(s1.compareTo(s2));
     
     System.out.println(s1.concat(s2));
     System.out.println("abcde".substring(1));
      System.out.println("afghkuh".substring(1,3));
      

 System.out.println(s1.indexOf('w'));
 System.out.println(s1.indexOf('e',1));




      
   }
}