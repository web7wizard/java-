import java.sql.*;
public class Check
{
  public static void main(String a[]) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManeger.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","maneger");
   System.out.println("connected");
  }
}