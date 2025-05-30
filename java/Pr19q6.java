import javax.swing.*;
import java.awt.*;
public class Pr19q6 extends JFrame
{
  Pr19q6()
  {
   Container c=getContentPane();
   c.setLayout(new BorderLayout());
   final String[] colHeads={"Name","percent","Grade"};
   final Object[][]Data={
   {"a","90","distinction"},
    {"b","92","distinction"},
    {"a","80","distinction"},
     {"a","90","distinction"}, {"a","90","distinction"} ,{"a","90","distinction"},
     {"a","90","distinction"}, {"a","90","distinction"} ,{"a","90","distinction"},
     {"a","90","distinction"}};
    JTable table=new JTable(Data,colHeads);
    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
     int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp=new JScrollPane(table,v,h);
    c.add(jsp,BorderLayout.CENTER);
    }
public static void main(String a[])
 {  Pr19q6 p=new Pr19q6();
   p.setSize(200,300);
   p.setVisible(true);
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
} 