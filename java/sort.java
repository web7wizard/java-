// Micro-Project Program

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class sort extends JFrame 
{
	String msg;
	JLabel in=new JLabel("Enter array: ");
	JLabel rr=new JLabel();
	JLabel res=new JLabel("Result: ");
	JTextArea result=new JTextArea(20,30);
	JTextField input =new JTextField(20);
	JButton bubs=new JButton("Bubble sort");
	JButton sels=new JButton("Selection sort");
	JButton inss=new JButton("Insertion sort");
	JButton cle=new JButton("Clear");

	GridBagConstraints cb=new GridBagConstraints();
	Container c=getContentPane();

	sort()
	{
		result.setEditable(false);
		setLayout(new GridBagLayout());
		addGB(in,1,1);
		addGB(input,2,1);
		addGB(res,1,2);
		addGB(result,2,2);
		addGB(bubs,1,3);
		addGB(sels,2,3);
		addGB(inss,3,3);
		addGB(cle,2,4);
		bubs.addActionListener(new bubsort());
		sels.addActionListener(new selssort());
                inss.addActionListener(new Inssort());	
		cle.addActionListener(new clearr());
	}

	void addGB(Component comp,int x,int y)
	{
		cb.gridx=x;
		cb.gridy=y;
		c.add(comp,cb);
	}

	//Button Listeners : 
	//Bubble sort button listener
	public class bubsort implements ActionListener
	{
		public void actionPerformed(ActionEvent e) throws NumberFormatException
		{
			try
			{       
				String strar[]=input.getText().split(" ");
				int arr[]=new int[strar.length];
				for(int i=0;i<strar.length;i++)
				{
					arr[i]=Integer.parseInt(strar[i]);
				}
				Bubble(arr);
				rr.setText("");
			}
			catch(NumberFormatException u)
			{
				rr.setText("Enter array of number with single spaces between them");
				addGB(rr,2,0);
			}
		}
	}




       //insertion sort listener
       public class Inssort implements ActionListener 
	{
       		 public void actionPerformed(ActionEvent e) throws NumberFormatException
		 {
           	 	try 
			{
               		 	String strar[] = input.getText().split(" ");
                		int arr[] = new int[strar.length];
                		for (int i = 0; i < strar.length; i++) 
                    		 {arr[i] = Integer.parseInt(strar[i]);}
               		 
                		Insertion(arr);
               			 rr.setText("");
           		} 
			catch (NumberFormatException u)
		 	{
               			 rr.setText("Enter array of number with single spaces between them");
               		 	addGB(rr, 2, 0);
            		}
       		 }
    	}
  

	//Selection sort button listener
        public class selssort implements ActionListener 
	{
       		 public void actionPerformed(ActionEvent e) throws NumberFormatException
		 {
           	 	try 
			{
               		 	String strar[] = input.getText().split(" ");
                		int arr[] = new int[strar.length];
                		for (int i = 0; i < strar.length; i++) 
                    		arr[i] = Integer.parseInt(strar[i]);
               		 
                		Selection(arr);
               			 rr.setText("");
           		} 
			catch (NumberFormatException u)
		 	{
               			 rr.setText("Enter array of number with single spaces between them");
               		 	addGB(rr, 2, 0);
            		}
       		 }
    	}

	//Sorting methods :
	public void Bubble(int a[])
	{
		int n=a.length;
		result.setText("\n Bubble Sort: ");
		for(int i=0;i<n;i++)
		{       int flag=0;
			result.append("\n Pass "+(i+1)+": ");
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
                                        flag=1;
				}
                           
 
			}
                        
                        
			for(int m=0;m<n;m++)
			{
				result.append(" "+a[m]+"  ");
			}
                        if(flag==0)
                       { break; }
		}
		result.append("\n Final sorted array:  ");
		for(int m=0;m<n;m++)
		{
			result.append(" "+a[m]+"  ");
		}

	}

	public void Insertion(int a[])
	{       int temp;
                
                int j;
		int n=a.length;
		result.setText("\n Insertion sort: ");
		for(int i=1;i<n;i++)
		{
			temp=a[i];
                        for(j=i-1;j>=0&&a[j]>temp;j--)
                        { 
                          a[j+1]=a[j];
                        }
                          a[j+1]=temp;
                        result.append("\n Pass "+(i)+": ");
			
			for(int m=0;m<n;m++)
			{
				result.append(" "+a[m]+"  ");
			}
		}
		result.append("\n Final sorted array:  ");
		for(int m=0;m<n;m++)
		{
			result.append(" "+a[m]+"  ");
		}

	}

	public void Selection(int a[]) 
	{
       		 int n = a.length;
                 int flag=0;
        	result.setText("\n Selection Sort: ");
        	for (int i = 0; i < n - 1; i++) 
		{
           		 result.append("\n Pass " + (i + 1) + ": ");
            		for (int j = i + 1; j < n; j++) 
			{
                		if (a[i] > a[j]) 
				{
                    			int temp = a[i];
                    			a[i] = a[j];
                  			a[j] = temp;
                                        flag=1;
            			 }
            		}
            		for (int m = 0; m < n; m++)
			 {
                		result.append(" " + a[m] + "  ");
            		 }
                         if(flag==0)
                       { break; }

              }
       		 result.append("\n Final sorted array:  ");
       		 for (int m = 0; m < n; m++)
		 {
           		 result.append(" " + a[m] + "  ");
        	 }

    	}

	//Clear button listener
 	public class clearr implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			input.setText("");
			result.setText("");
			rr.setText("");
		}
	}

	public static void main(String args[])
	{
		sort m1=new sort();
		m1.setSize(800,800);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}