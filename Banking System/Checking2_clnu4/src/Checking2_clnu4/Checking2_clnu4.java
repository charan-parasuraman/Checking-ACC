package Checking2_clnu4;

import java.util.Scanner;


public class Checking2_clnu4 {
	int AccountNumber;
	float Balance=100;
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
		float Newamount;
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
	
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Checking2_clnu4 ack = new Checking2_clnu4();
	    Scanner scan = new Scanner(System.in);
//	    System.out.println("Input from User: ");
//	    String no1 = scan.nextLine();
	    int y=3;
	    while(true) {
		    System.out.println("\nInput from User: ");
		    System.out.println("Enter the key word deposit or");
		    System.out.println("Enter the Key word withdraw");
		    System.out.println("Enter the Key word Exit to exit the Code");
		    String no1 = scan.nextLine();
		    
	    	
	    switch(no1) 
	    {
    		case "deposit":ack.Deposit();
    		break;
	    	case "withdraw":
             y=ack.Withdraw();
//             System.out.println(y);  to print return value
             break;
	    	case "Exit":
	    		System.exit(0);
	    	default:System.out.println("Invalid Choice");
	    }
	    
	    
	    
	    		if(y==1)
	    		{
	    			System.out.println("withdraw successful");	    			
	    		}
	    		if(y==0) 
	    		{
	    			System.out.println("your withdraw exceeds limit");
	    			
	    			System.out.println("Balance is: "+ack.Balance);
	    		}
	    		
	    }

	}

}
