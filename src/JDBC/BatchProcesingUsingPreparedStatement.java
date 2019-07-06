package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.Util.Util;

public class BatchProcesingUsingPreparedStatement {

	public static void main(String[] args) {
		try{  
			int choice = 0;  
			String url = "jdbc:mysql://localhost:3306/Employee";
			String password = "test";
			String user = "root";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);  
			  
			PreparedStatement prepareStatement = con.prepareStatement("Insert into Employee values(?, ?, ?, ?)");  
			  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			do {  
			  
			System.out.println("\nEnter Employee Id :");  
			String s1 = br.readLine();  
			int id = Integer.parseInt(s1);  
			  
			System.out.println("\nEnter Employee Name :");  
			String name = br.readLine();
			
			System.out.println("\nEnter Age Of Employee :");  
			String s2 = br.readLine();  
			int age = Integer.parseInt(s2);
			  
			System.out.println("\nEnter Salary Of Employee :");  
			String s3 = br.readLine();  
			int salary=Integer.parseInt(s3);  
			  
			prepareStatement.setInt(1, id);  
			prepareStatement.setString(2, name);
			prepareStatement.setInt(3, age); 
			prepareStatement.setInt(4, salary);  
			  
			prepareStatement.addBatch();  
			System.out.println("\nWant to add more Records:\n1. Yes \n2. No");  
			choice = Util.getInputInteger();
			  
			}while(choice == 1);  
			prepareStatement.executeBatch();  
			  
			System.out.println("Record Successfully Saved");  
			print(prepareStatement);  
			con.close();  
			}
		catch(Exception e) {
				System.out.println(e);
				}  
			  
			

	}
	public static void print(PreparedStatement preparedStatement) throws SQLException {
		
		ResultSet rs = preparedStatement.executeQuery("Select * From Employee");
		System.out.println();
		System.out.println("************ Print Table ************");
		System.out.println("\n=================================");
		System.out.println("Id\tName\tAge\tSalary");
		System.out.println("===================================");
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"
				+rs.getInt(3)+"\t"+ rs.getInt(4));
			}
	}

}
