import java.sql.*;
public class Ins
{
  public static void main(String a[]) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    String q="insert into std values(?,?,?)";
    PreparedStatement ps=conn.prepareStatement(q);
    ps.setInt(1,2501);
    ps.setString(2,"Jiya");
    ps.setInt(3,90);
    ps.executeUpdate();
    ps.close();
    conn.close();
  }
}
