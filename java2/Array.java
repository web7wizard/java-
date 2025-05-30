class Array
{
 public static void main(String args[])
 {
   int a[]={10,20,30};
   int y[][]={{1,2,3},{4,5,6}};
   int i,j;
   for(i=0;i<a.length;i++)
   {  //System.out.println(a[i]);
    System.out.println("a["+i+"]\t"+a[i]);
   }
   for(i=0;i<y.length;i++)
   {
    for(j=0;j<y[i].length;j++)
     {//System.out.println(y[i][j]);
    System.out.println("y["+i+"]\t" + "y["+j+"]\t"  +y[i][j]);
}
 System.out.println();
}}}
