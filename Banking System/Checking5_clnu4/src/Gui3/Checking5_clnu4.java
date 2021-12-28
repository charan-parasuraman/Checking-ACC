package Gui3;
import javax.swing.*;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;






class  Checking_4 
{

	double Balance=0;
    String name;
    int AccNum;
	String Name;
	Scanner input = new Scanner(System.in);

	public void Deposit()   // constructors
	{
		float Add;
		System.out.println("Input the Ammount to add: ");
		float NewNo = input.nextFloat();
		Add = NewNo;
		System.out.println("The Added amount "+Add);
		Balance = Add+Balance;
		System.out.println("deposit successful ");
		System.out.println("New Balance is: "+Balance);
	}
			
	public int Withdraw() 
	{
		int x;
		float Sub;
		double Newamount;
		System.out.println("Input the Ammount to be Withdrawn: ");
		float Nueno = input.nextFloat();
		Sub= Nueno;
		Newamount= Balance;
		if (Balance>=Sub) {
		Balance= Balance-Sub;
		System.out.println("The New Balance is: "+Balance);
		x=1;
		}
		else
		{
			x=0;
		}
		return (x);
	}
		     
	public void Checking(int AccNum, String Name, double balance) {
		this.AccNum = AccNum;
		this.Name = Name;
		this.Balance = balance;
	}
     
     
     public String toString()
   {
       return  "\n"+AccNum+","+Name+","+Balance;
   }
    
    public Checking_4() {
		// TODO Auto-generated constructor stub
	}

	public double getBalance()
    {
        return Balance;
    }
	
	
	public double getDeposit() {
		return Balance;
	}
	
  
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Checking5_clnu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking obj = new Checking();

	}

}


class Checking extends JFrame implements ActionListener, KeyListener
{
  JLabel lable1;
  JTextField userID;
  JLabel lable2;
  JTextField Balance;
  JLabel lable3;
  JTextField Name;
  JButton b;
//  JButton c;
  JLabel lable4;
  JTextField Accounts ;
  String txt3="";
  String[] txt4 = new String[100];
  String[][] txt5 = new String[100][3];
  int i=0;
  JPanel panel = new JPanel();

  public Checking()
  
   {
	  
	  

	  JPanel panel = new JPanel();
	  JFrame frame = new JFrame();
	  frame.setTitle("Checking Account");
	  frame.setSize(800, 400);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.add(panel);
	  
	  panel.setLayout(null);
	  
	  lable1 = new JLabel("Enter Account Number:");
	  lable1.setBounds(10, 20, 150, 20);
	  panel.add(lable1);
	  
	  userID = new JTextField(50);
	  userID.setBounds(252, 20, 500, 20);
	  panel.add(userID);
	  
	  panel.setLayout(null);
	  lable2 = new JLabel("Enter Balance:");
	  lable2.setBounds(10, 50, 150, 20);
	  panel.add(lable2);
	  
	  Balance = new JTextField(50);
	  Balance.setBounds(252, 50, 500, 20);
	  panel.add(Balance);	  
	  
	  
	  panel.setLayout(null);
	  lable3 = new JLabel("Enter Name:");
	  lable3.setBounds(10, 80, 150, 20);
	  panel.add(lable3);
	  
	  Name = new JTextField(50);
	  Name.setBounds(252, 80, 500, 20);
	  panel.add(Name);	  
	  
	  
	  panel.setLayout(null);
	  lable4 = new JLabel("Press Enter to add current Accounts:");
	  lable4.setBounds(10, 110, 250, 20);
	  panel.add(lable4);
	  
//	  Accounts = new JTextField(100);
	  Accounts =new JFormattedTextField("");
	  Accounts.setBounds(252, 110, 500, 100);
	  panel.add(Accounts);
	  
	  JButton  b=new JButton("Clear input text");
	  b.setBounds(400, 220, 250, 20);
	  panel.add(b);
	  
//	  JButton  c=new JButton("Clear text");
//	  c.setBounds(400, 260, 250, 20);
//	  panel.add(c);
	  
	  userID.addActionListener(this);   
	  userID.addKeyListener(this);
	  
	  Balance.addActionListener(this);
	  Balance.addKeyListener(this);
	  
	  Name.addActionListener(this);
	  Name.addKeyListener(this);
	  
	  Accounts.addActionListener(this);
	  Accounts.addKeyListener(this);
	  

	  
	  b.addActionListener(this);
//	  c.addActionListener(this);


	  
	  
	  frame.setVisible(true);
	 
  }
  


 public void actionPerformed(ActionEvent ae ) 
  {
	 
       
       userID.setText("");
       Balance.setText("");
       Name.setText("");
       
       
  }
 

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	  if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		  

		  
	       int num1=Integer.parseInt(userID.getText());
	       //      double num2=Integer.parseInt(t2.getText());
	             float num2 = Float.parseFloat(Balance.getText());
	        //     float num2 = (t2.getAlignmentX());
	             String txt1= (Name.getText());
	       //      String txt2 = (Accounts.getText());
	             String txt2 = "";
	             txt2 = ("AccNum: "+num1 +",  Balance: "+num2 +",  Name: "+txt1) ;
	             txt4[i] = txt2; 
	             txt5[i][0]= Integer.toString(num1);
	             txt5[i][1]= Float.toString(num2);
	             txt5[i][2]= txt1;
	            String s;
	            s=("AccNO is: "+txt5[i][0]+" The Name is: "+txt5[i][2]+" The Balance of the account is: "+txt5[i][1]);
//	            System.out.println(s);
	             txt3 = (txt3+"\n"+"Index "+i+": "+txt2); 
	             Accounts.setText(txt3);
	             System.out.println("\n --Red from the file after each Iteration--");
//	             panel.add(Accounts);
	             i++;
	             if(s==s) {
	             try {
	         		BufferedWriter bw = new BufferedWriter(
	         		new FileWriter("src/Gui3/Gui.txt"));
	         		String c= (txt3);
	         			bw.write(c);
	         			bw.close();
	         			
	         		}
	         		catch(Exception ex) {
	         			return;
	         		} 
	             }
	             
	             
	             try {
	     			BufferedReader rd = new BufferedReader(
	     					new FileReader("src/Gui3/Gui.txt"));
	     			String d;
	     			while((d=rd.readLine()) != null) {
	     				System.out.println(d);
	     			}
	     			rd.close();
	     					
	     		}
	     		catch(Exception ex) {
	     			return;
	     		}
	             
	             
	             
	             
	  }

}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}


