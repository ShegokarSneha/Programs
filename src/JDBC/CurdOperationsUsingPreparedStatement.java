package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.Util.Util;

public class CurdOperationsUsingPreparedStatement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int choice = 0;
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("************ CURD Operation ***************");
		do {
		
		System.out.println("\nEnter Operation : \n1. Insert Operation \n2. Delete Operation"
				+ "\n3. Update Operation \n4. Exit");
		System.out.println("\nEnter Choice : ");
		choice = Util.getInputInteger();
		switch(choice) {
		case 1:
			System.out.println("********** Insert Operation ************");
			insert(con);
			break;
			
		case 2:
			System.out.println("********** Delete Operation ************");
			delete(con);
			break;
			
		case 3:
			System.out.println("********** Update Operation ************");
			update(con);
			break;
		
		case 4:
			System.out.println("Exit Successfully....");
			System.exit(0);
			break;
		}
		}while(choice > 0 && choice <=4);
		
}
	public static void insert(Connection con) throws SQLException {
		int id, age, salary;
		String name;
		int choice = 0;
		String Isertquery = "INSERT INTO Employee" +
		        "  (EMPID, NAME, AGE, SALARY) VALUES " +
		        " (?, ?, ?, ?);";
		PreparedStatement preparedStatement = con.prepareStatement(Isertquery);
		do {
			preparedStatement = con.prepareStatement(Isertquery);
			System.out.println("Enter Employee Id: ");
			id = Util.getInputInteger();
			preparedStatement.setInt(1, id);
			System.out.println("Enter Name of Employee : ");
			name = Util.getInputString();
			preparedStatement.setString(2, name);
			System.out.println("Enter Age Of Employee : ");
			age = Util.getInputInteger();
			preparedStatement.setInt(3, age);
			System.out.println("Enter Salary Of Employee : ");
			salary = Util.getInputInteger();
			preparedStatement.setInt(4, salary);
			preparedStatement.executeUpdate();
			System.out.println("Do You Want To add More Data\n1. Yes \n2. No");
			choice = Util.getInputInteger();
			}while(choice == 1);
		print(preparedStatement);
		
	}
	
	public static void update(Connection con) throws SQLException {
		int age;
		String name;
		
		String Updatequery = "Update Employee set NAME = ? Where  AGE = ?";
		
	    
	    System.out.println("Enter Name of Employee To Set : ");
		name = Util.getInputString();
		System.out.println("Where Employee Age is : ");
		age = Util.getInputInteger();
		PreparedStatement preparedStatement = con.prepareStatement(Updatequery);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, age);
	    preparedStatement.executeUpdate();
	    // Printing table
	    print(preparedStatement);
	 
	}
	
	public static void delete(Connection con) throws SQLException {
		String deletequery = "Delete from Employee where NAME = ? ";
		System.out.println("Enter Name of Employee To Delete :");
		String fname = Util.getInputString();
		PreparedStatement preparedStatement = con.prepareStatement(deletequery);
		preparedStatement.setString(1, fname);
		preparedStatement.executeUpdate();
		print(preparedStatement);
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
