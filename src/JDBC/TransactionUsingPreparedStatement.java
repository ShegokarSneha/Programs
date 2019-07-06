package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bridgelabz.Util.Util;

public class TransactionUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		int choice = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement prepareStatement = con.prepareStatement("Insert into Employee values(?, ?, ?, ?)");
		try{
			con.setAutoCommit(false);
			do {
				System.out.println("\nEnter Employee Id :");
				int id = Util.getInputInteger();
				
				System.out.println("\nEnter Employee Name :");  
			    String name = Util.getInputString();
			
			    System.out.println("\nEnter Age Of Employee :");   
			    int age = Util.getInputInteger();
			  
			    System.out.println("\nEnter Salary Of Employee :");  
			    int salary = Util.getInputInteger();  
			  
			    prepareStatement.setInt(1, id);  
			    prepareStatement.setString(2, name);
			    prepareStatement.setInt(3, age); 
			    prepareStatement.setInt(4, salary);  
			    prepareStatement.executeUpdate();
			    
			    System.out.println("\nWant to add more Records:\n1. Yes \n2. No");  
			    choice = Util.getInputInteger();
			    }while(choice == 1);
			con.commit();
			System.out.println("\nTransaction is commited successfully.\n");
			print(prepareStatement);
			}
		catch(SQLException se){
			System.out.println("Error Occurs...");
			con.rollback();
		}   

	}

	private static void print(PreparedStatement prepareStatement) throws SQLException {
		ResultSet rs = prepareStatement.executeQuery("Select * From Employee");
		System.out.println();
		System.out.println("************ Print Table ************");
		System.out.println("\n===================================");
		System.out.println("Id\tName\tAge\tSalary");
		System.out.println("=====================================");
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"
				+rs.getInt(3)+"\t"+ rs.getInt(4));
			}
		
	}

}
