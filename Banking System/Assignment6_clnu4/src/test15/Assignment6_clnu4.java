package test15;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Assignment6_clnu4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment6_clnu4 DBconnect = new Assignment6_clnu4();
        try {
            DBconnect.getConnection();
            System.out.println("Connection to SQLite has been established.");
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        try {
            Connection connect = DBconnect.getConnection();
            Statement statement = connect.createStatement();
            ResultSet sellect1 = statement.executeQuery("SELECT * FROM Accounts "+" WHERE Name='Doug'");
            System.out.println("\nAnswer for 1st Question");
            while (sellect1.next()){
                System.out.println(sellect1.getInt("ID") + "\t"+ sellect1.getString("Name") + "\t"+sellect1.getDouble("Balance"));
                }
            while (sellect1.next()){
                System.out.println(sellect1.getInt(1) + "\t"+ sellect1.getString(2) + "\t"+sellect1.getDouble(3));
                }
            connect.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////\n");
        
        try {
            String insert1 = "INSERT INTO Accounts (ID,Name,Balance) "+"Values (6,'Frank',400)";
            Connection connect = DBconnect.getConnection();
            Statement statement = connect.createStatement();
            int rc = statement.executeUpdate(insert1);
            ResultSet sellect1 = statement.executeQuery("SELECT * FROM Accounts "+" WHERE Name='Frank'");
            System.out.println("Verification for 2nd Question");
            while (sellect1.next()){
                System.out.println(sellect1.getInt("ID") + "\t"+ sellect1.getString("Name") + "\t"+sellect1.getDouble("Balance"));
                }
            while (sellect1.next()){
                System.out.println(sellect1.getInt(1) + "\t"+ sellect1.getString(2) + "\t"+sellect1.getDouble(3));
                }
            connect.close();
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
  System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////\n");      
        try {
            Connection connect = DBconnect.getConnection();
            Statement statement = connect.createStatement();
            ResultSet sellect2 = statement.executeQuery("UPDATE Accounts Set Balance=200 WHERE ID=1");
            while (sellect2.next()){
                System.out.println(sellect2.getInt("ID") + "\t"+ sellect2.getString("Name") + "\t"+sellect2.getDouble("Balance"));
                }
            while (sellect2.next()){
                System.out.println(sellect2.getInt(1) + "\t"+ sellect2.getString(2) + "\t"+sellect2.getDouble(3));
                }           
            connect.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
     
        
        try {
            Connection connect = DBconnect.getConnection();
            Statement statement = connect.createStatement();
            ResultSet sellect1 = statement.executeQuery("SELECT * FROM Accounts "+" WHERE ID=1");
            System.out.println("Updated Balance for 3rd Question");
            while (sellect1.next()){
                System.out.println(sellect1.getInt("ID") + "\t"+ sellect1.getString("Name") + "\t"+sellect1.getDouble("Balance"));
                }
            while (sellect1.next()){
                System.out.println(sellect1.getInt(1) + "\t"+ sellect1.getString(2) + "\t"+sellect1.getDouble(3));
                }
            connect.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////\n");    
        
        try {
            String insert1 = "DELETE FROM Accounts WHERE ID=6";
            Connection connect = DBconnect.getConnection();
            Statement statement = connect.createStatement();
            int rc = statement.executeUpdate(insert1);
            ResultSet sellect1 = statement.executeQuery("SELECT * FROM Accounts");
            System.out.println("Verification and updated table for 4th Question as Table field");
            while (sellect1.next()){
                System.out.println(sellect1.getInt("ID") + "\t"+ sellect1.getString("Name") + "\t"+sellect1.getDouble("Balance"));
                }
            while (sellect1.next()){
                System.out.println(sellect1.getInt(1) + "\t"+ sellect1.getString(2) + "\t"+sellect1.getDouble(3));
                }
            connect.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////\n");
        try {
            System.out.println("Enter Account name you want to display Name about: ");
            String sellect3 = "SELECT * FROM Accounts "+"WHERE Name=?";
            Connection con1 = DBconnect.getConnection();
            PreparedStatement ps = con1.prepareStatement(sellect3);
            Scanner scan = new Scanner(System.in);
            String Accounts = scan.nextLine();
            ps.setString(1, Accounts);
            ResultSet rst = ps.executeQuery();
            while(rst.next()) {
                System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3));
            }
            con1.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }

	}
	
	
	
	
	 private Connection getConnection() throws SQLException{
	        String dbURL = "jdbc:sqlite:src\\test15\\JDBCAssign_clnu4_6";
	        Connection connection = DriverManager.getConnection(dbURL);
	        return connection;
	 }
	

}
