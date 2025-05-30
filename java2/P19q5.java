import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class P19q5 extends JFrame implements TreeExpansionListener
{
  
  Container c;
  JTree tr;
   DefaultMutableTreeNode top=new DefaultMutableTreeNode("file explorer");
  DefaultMutableTreeNode t1=new DefaultMutableTreeNode("c:");
   DefaultMutableTreeNode t2=new DefaultMutableTreeNode("d:"); DefaultMutableTreeNode t3=new DefaultMutableTreeNode("g:");
  DefaultMutableTreeNode first=new DefaultMutableTreeNode("2501 java");
  DefaultMutableTreeNode sec=new DefaultMutableTreeNode("2501 python");
  DefaultMutableTreeNode third=new DefaultMutableTreeNode("2501 MIC");
  DefaultMutableTreeNode fourth=new DefaultMutableTreeNode("2501 DCN");
  DefaultMutableTreeNode fifth=new DefaultMutableTreeNode("2501 UI/UX");DefaultMutableTreeNode six=new DefaultMutableTreeNode("2501 EES");
  DefaultMutableTreeNode first_1=new DefaultMutableTreeNode("pr1");
  DefaultMutableTreeNode first_2=new DefaultMutableTreeNode("Pr2");
  P19q5()
  {
   c=getContentPane();
   top.add(t1);
   top.add(t2);top.add(t3);
   t1.add(first); t1.add(sec); t1.add(third); t1.add(fourth); t2.add(fifth); t3.add(six);
   first.add(first_1); first.add(first_2);
   tr=new JTree(top);
   tr.addTreeExpansionListener(this);
   c.add(tr);
 }
 
 public void treeExpanded(TreeExpansionEvent e)
 {

  TreePath tp=e.getPath();
  System.out.println("treeExpanded at"+tp.toString());
 }
 public void treeCollapsed(TreeExpansionEvent e)
 {
  System.out.println("tree collapse");
 }
 public static void main(String a[])
 {
  P19q5 p=new P19q5();
  p.setSize(300,300);
  p.setVisible(true);
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}




   