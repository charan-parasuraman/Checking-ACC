package Checking3_clnu4;

import java.util.Scanner;

public class Checking3_clnu4 {
	
	private static Checking[] AccInfo;
	
	private static int NumAcc;
	
	private static Checking[] p;
	
	static Scanner input=new Scanner(System.in);
	
	static Checking3_clnu4 ru = new Checking3_clnu4();
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Number of Checking Accounts to be Created: ");
		
		NumAcc=input.nextInt();
		System.out.println("Number of Checking Accounts user Created: "+NumAcc);

		
		getInput();
		input.close();

	}
	
	public static void getInput()
	{
		int choice=0;
        //Loop until user quits
        while(choice!=3)
        {
                System.out.println("\n1) Type '1' to Create: ");
                System.out.println("2) Type '2' to Balance Search: ");
                System.out.println("3) Type '3' to Deposit and Withdraw");
                System.out.println("4) Type '4' to Exit: ");
                System.out.println("Enter your choice from the Above Constraints: ");
                choice=input.nextInt();

                switch(choice)
                {
                case 1:
                        AccInfo=new Checking[NumAcc];
                        AccInfo=create();
                        break;
                case 2:
                        p=balanceSearch();
                        break; 
                        
                case 4:
                        System.out.println("End of program!");
                        System.exit(0);
                        break;
                        
                  
                case 3:                                  // Extra program for my reference
                {
            	    Checking ack = new Checking();        
            	    Scanner scan = new Scanner(System.in);
//            	    System.out.println("Input from User: ");
//            	    String no1 = scan.nextLine();
            	    int y=3;
            	    while(true) {
            		    System.out.println("\nInput from User: ");
            		    System.out.println("Enter the key word deposit or");
            		    System.out.println("Enter the Key word withdraw");
            		    System.out.println("Enter the Key word return to go to Creat and Balance Search menu");
            		    String no1 = scan.nextLine();
            		    
            	    	
            	    switch(no1) 
            	    {
                		case "deposit":ack.Deposit();
                		break;
            	    	case "withdraw":
                         y=ack.Withdraw();
//                         System.out.println(y);  to print return value
                         break;
            	    	case "return":
            	    		ru.getInput();
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
        
        }
     }
	
       
            
                        
             
	
	
	
	public static Checking[] create() 
	{
		
		Checking[] account=new Checking[NumAcc];
        for(int i=0;i<NumAcc;i++)
        {
        	
                System.out.println("Account "+(i+1));
                System.out.print("Enter your Account Number: ");
                int accNum=input.nextInt();
                System.out.print("Enter the Balance: ");
                float bal=input.nextFloat();
                System.out.println("");
                account[i]=new Checking(accNum, bal);
               
        }
        
        return account;
        
	}
	
	
    public static Checking[] balanceSearch()
    {
    	
            Checking[] account=null;
            int[] indexes=new int[NumAcc];
            if(AccInfo==null)
            	
                    System.out.println("\nNo checking accounts to view! \nCreate a Checking account to view!!");
            
            else
            {
                    System.out.print("Enter balance to group: ");
                    float balance=input.nextFloat();
                    int DiffAccounts=0;
                    for(int i=0;i<NumAcc;i++)
                    {
                    	
                            if(AccInfo[i].getBalance()==balance)
                            {
                            	
                                    System.out.println("Index: "+i);
                                    indexes[DiffAccounts]=i;
                                    DiffAccounts++;
                                    
                            }
                    }
                    
                    if(DiffAccounts==0)
                    	
                            System.out.println("No matches found!");
                    
                    else
                    {
                            account=new Checking[DiffAccounts];
                            for(int i=0;i<DiffAccounts;i++)
                            {
                                    account[i]=AccInfo[indexes[i]];
                            }
                    }
            }
            return account;
    }
	
	

}



class  Checking  
{
	int AccountNumber;
	float Balance=100;
	Scanner input = new Scanner(System.in);
    int accNum;
    float balance;

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
		

     
     public Checking(int accNum, float balance) {
         this.accNum = accNum;
         this.balance = balance;
 }
    

    public Checking() {
		// TODO Auto-generated constructor stub
	}



	public float getBalance()
    {
        return balance;
    }
	
  
	public static void main(String[] args) {       //This main method will be Redundant as the main method of the main class will be picked 
		// TODO Auto-generated method stub
		
	    Checking ack = new Checking();        //checking== checking2_clnu4
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

