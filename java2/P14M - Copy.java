import java.awt.*;
import java.awt.event.*;


public class P14M extends Frame
{  
  GridBagConstraints Constraints=new GridBagConstraints();
CheckboxGroup cb=new CheckboxGroup();
CheckboxGroup c1=new CheckboxGroup();

  
 /* Label l1,l2,l3,l4;
  Checkbox c1,c2,c3,c4,c5;
  CheckboxGroup cb=new CheckboxGroup();
  TextField t=new TextField(7);
  TextArea text=new TextArea(6,30);
  Button b=new Button("submit"); */
  


P14M()
  { //setLayout(new GridBagLayout());
    // int x,y;
    //setLayout(new GridBagLayout (10,3,4,4));
    setLayout(new GridBagLayout());
    ad(new Label("name    "),0,1);
    ad(new TextField(15) ,1,1);
    //add(l3);
    //add(t);
    ad(new Label("your department "),0,3);
    ad(new Checkbox("computer",cb,false),1,3);
    ad(new Checkbox("electrical",cb,false),2,3);
    ad(new Checkbox("mechanical",cb,false),3,3);
    ad(new Checkbox("civil",cb,false),4,3); 
    ad(new Checkbox("entc",cb,false),5,3); 
   
    
 
    //add(l1);add(c1); add(c2); add(c3);
    ad(new Label("gender   "),0,4);
    ad(new Checkbox("male",c1,false),1,4);
    ad(new Checkbox("female",c1,false),2,4);

    //add(l2);add(c4); add(c5);
    ad(new Label("address  "),0,5);
    ad(new TextArea(3,6),1,5);
  
     ad(new Label("your interests"),0,6);
    ad(new Checkbox("AL data science",false),1,6);
    ad(new Checkbox("chess",false),2,6);
    ad(new Checkbox("outdoor game",false),3,6);
    ad(new Checkbox("writing ",false),4,6); 
    ad(new Checkbox("designing",false),5,6); 


     //add(l4);
    //add(text);
   //add(b);
  
}
  void ad(Component component,int x,int y)
  {
   Constraints.gridx=x;
   Constraints.gridy=y;
   add(component,Constraints);
  }
  public static void main(String args[])
  {
   P14M p=new P14M();
   p.setSize(300,400);
   p.setVisible(true);
p.addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
  }
 });
}
}