package test;

import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



class  Checking  
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
			     
		public Checking(int AccNum, String Name, double balance) {
			this.AccNum = AccNum;
			this.Name = Name;
			this.Balance = balance;
		}
	     
	     
	     public String toString()
	   {
	       return  "\n"+AccNum+","+Name+","+Balance;
	   }
	    
	    public Checking() {
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
	
		
public class Checking4_clnu4  {

	public static void WriteAcc(Checking[] AccInfo) throws IOException {
//		try {
//     		BufferedWriter bw = new BufferedWriter(
//     		new FileWriter("src/test/AccInfo.txt"));
//
//     			
//     		}
//     		catch(Exception ex) {
//     			return;
//     		} 
         
	Path currentRelativePath = Paths.get("");
	String s = currentRelativePath.toAbsolutePath().toString();
	String dirString=s+"/src/test";
	Path dirPath=Paths.get(dirString);
	if (Files.notExists(dirPath)){
		Files.createDirectories(dirPath);
	}
	String AccInfoString="AccInfo.txt";
	Path AccInfoPath=Paths.get(dirString,AccInfoString);
	if (Files.notExists(AccInfoPath)){
		Files.createFile(AccInfoPath);
	}
	File AccInfoFile=AccInfoPath.toFile();
	
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(AccInfoFile)));
	for(int i=0;i<AccInfo.length;i++) {
	out.print(AccInfo[i].AccNum+",");
	out.print(AccInfo[i].Name+",");
	out.print(AccInfo[i].Balance+"\n");
		}
	out.close();
	}
	
	public static Checking[] ReadAcc(String filename)throws IOException {
		
		
//		try {
// 			BufferedReader rd = new BufferedReader(
// 					new FileReader("src/test/AccInfo.txt"));
// 			String d;
// 			while((d=rd.readLine()) != null) {
// 				System.out.println(d);
// 			}
// 			rd.close();
// 					
// 		}
// 		catch(Exception ex) {
// 			return;
// 		}
		
		
		
		
		BufferedReader in = new BufferedReader(new FileReader(filename));
		Path file = Paths.get(filename);
		
		int linecnt = (int)Files.lines(file).count();
		Checking[] readAcc = new Checking[linecnt];
		
		String line1;
		int i=0;
		while ((line1 = in.readLine())!=null) {
			String[] readAccInfo = line1.split(",");
			String AccNum1 = readAccInfo[0];
			String Name = readAccInfo[1];
			String Balance = readAccInfo[2];
			Checking temp = new Checking(Integer.parseInt(AccNum1),Name,Double.parseDouble(Balance));
			readAcc[i] = temp;
			i++;
		}
		in.close();		
		return readAcc;
	}
	
	
	public static Checking[] SortBalanceDesc(Checking[] Sortarray) {
		int i;
		int j;
		int tempA;	
		double tempB;
		String tempC;
		
		for(i =0 ;i<5;i++) {
			for(j=0; j<4; j++) {
				if(Sortarray[j].Balance < Sortarray[j+1].Balance) {
					tempA = Sortarray[j].AccNum;
					tempC = Sortarray[j].Name;
					tempB = Sortarray[j].Balance;
					
					Sortarray[j].AccNum = Sortarray[j+1].AccNum;
					Sortarray[j].Name = Sortarray[j+1].Name;
					Sortarray[j].Balance = Sortarray[j+1].Balance;
					
					Sortarray[j+1].AccNum = tempA;
					Sortarray[j+1].Name = tempC;
					Sortarray[j+1].Balance = tempB;
					
				}	
			}
		}
		return Sortarray;
	}
	
	
	
	public static Checking[] SortBalanceAsc(Checking[] Sortarray) {
		int i;
		int j;
		int tempA;	
		double tempB;
		String tempC;
		
		for(i =0 ;i<5;i++) {
			for(j=0; j<4; j++) {
				if(Sortarray[j].Balance > Sortarray[j+1].Balance) {
					tempA = Sortarray[j].AccNum;
					tempC = Sortarray[j].Name;
					tempB = Sortarray[j].Balance;
					
					Sortarray[j].AccNum = Sortarray[j+1].AccNum;
					Sortarray[j].Name = Sortarray[j+1].Name;
					Sortarray[j].Balance = Sortarray[j+1].Balance;
					
					Sortarray[j+1].AccNum = tempA;
					Sortarray[j+1].Name = tempC;
					Sortarray[j+1].Balance = tempB;
					
				}	
			}
		}
		return Sortarray;
	}
	
	
	
	public static int SearchBalance(Checking[] charSearch, double balance)
	{
		
		int low = 0,
		high = charSearch.length -1,
		mid = (low + high) / 2;
		while (low <= high && charSearch[mid].Balance != balance) {
			
			if (charSearch[mid].Balance < balance) 
			{
				
				low = mid + 1;
			} 
			
			else 
			{ 
				
				high = mid - 1;
			}
			
			mid = (low + high) / 2;
			
			
			}
			
		if (low > high) 
			{
			
				mid = -1;
			}
			
		System.out.println("AccNum: "+charSearch[mid].AccNum+", Name: "+charSearch[mid].Name+", Balance: "+charSearch[mid].Balance);

		return mid;

		}
	
	
	private static void display(Checking[] displayarr) {
		for(int i=0;i<displayarr.length;i++) {
			System.out.println("AccNum: "+displayarr[i].AccNum+", Name: "+displayarr[i].Name+", Balance: "+displayarr[i].Balance);
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated constructor stub
		

		Checking [] data = new Checking[5];
		data[0] = new Checking(100,"Alice",100.0);
		data[1] = new Checking(120,"Bob",110.0);
		data[2] = new Checking(141,"Doug",90.0);
		data[3] = new Checking(116,"Eva",100.0);
		data[4] = new Checking(132,"Frank",80.0);
		

		WriteAcc(data);

		Checking[] NewAccInfo = new Checking[5]; 
		NewAccInfo = ReadAcc("src\\test\\AccInfo.txt");

		System.out.println("Data from the txt folder");
		Checking[] SortedArray = SortBalanceAsc(NewAccInfo);
		display(SortedArray);
		
		Checking[] SortedArray1 = SortBalanceAsc(NewAccInfo);

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the balance to be search: \r ");
		double balance = in.nextDouble();
		int position = SearchBalance(SortedArray1,balance);
		System.out.println("The sorted index position is: "+position);
		
	}

}