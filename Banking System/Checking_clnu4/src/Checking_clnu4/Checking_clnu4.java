package Checking_clnu4;
import java.util.*;

public class Checking_clnu4 {
	
	int AccountNumber;
	double ChangAccNum;
	static float InterestRate;
	Scanner input = new Scanner(System.in);
	
		
	public void ChangAccNum()   // constructors
	{
		System.out.println("Input the Account No.: ");
		int NewNo = input.nextInt();
		AccountNumber = NewNo;
		System.out.println("The AccNo. is "+AccountNumber); 		
	}
	
	public void SetInterest() 
	{
		System.out.println("Input the Rate of Intrest: ");
		int Nueno = input.nextInt();
		InterestRate= Nueno;
		System.out.println("The Intrestrate is "+InterestRate);				
	}
	
	public static void main(String[] args) {
		
		Checking_clnu4 Ack = new Checking_clnu4();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your First number");
		int no1 = scan.nextInt();
		System.out.println("The First number: "+no1);
		
		System.out.println("Input your Second number");
		int no2 = scan.nextInt();
		System.out.println("The Second number: "+no2);
		System.out.println("Input your Third number");
		int no3 = scan.nextInt();
		System.out.println("The Thhird number: "+no3);
		
		int Avg = (no1+no2+no3)/3;
		System.out.println("Average of three Numbers is: "+Avg);
				
		System.out.println("Please enter a string");
		String st1 = scan.next();
		System.out.println(st1);		
		System.out.println("Length of String is: "+st1.length());
		System.out.println("The third character of the string is: "+st1.charAt(2));
		
	    Checking_clnu4 ack = new Checking_clnu4();
	    ack.ChangAccNum();
	    ack.SetInterest();
		
	}

}
