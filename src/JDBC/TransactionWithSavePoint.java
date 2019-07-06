package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.bridgelabz.Util.Util;

public class TransactionWithSavePoint {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		int choice = 0;
		int count = 0;
		Savepoint savepoint = null;
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
			    count++;
			    if(count == 2) {
			    savepoint = con.setSavepoint();
			    }
			    System.out.println("\nWant to add more Records:\n1. Yes \n2. No");  
			    choice = Util.getInputInteger();
			    }while(choice == 1);
			print(prepareStatement);
			con.rollback(savepoint);
			    con.commit();
			    print(prepareStatement);
			    System.out.println("\nTransaction is commited successfully.");
			    
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
