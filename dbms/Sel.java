import java.sql.*;
public class Sel
{
  public static void main(String a[]) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    Statement s=conn.createStatement();
    ResultSet res=s.executeQuery("select * from std");
    while(res.next())
    {
     System.out.println("roll\t"+res.getInt(1)+"name\t"+res.getString(2)+"mark\t"+res.getInt(3));
   }
     res.close();
     s.close();
    conn.close();
  }
}
