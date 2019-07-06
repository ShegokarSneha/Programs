package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.Util.Util;

public class TransactionUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		int choice = 0;
		int age = 0, salary = 0, id = 0;
		String name = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		try{
			con.setAutoCommit(false);
			do {
			System.out.println("Enter Employee Id: ");
			id = Util.getInputInteger();
			System.out.println("Enter Name of Employee : ");
			name = Util.getInputString();
			System.out.println("Enter Age Of Employee : ");
			age = Util.getInputInteger();
			System.out.println("Enter Salary Of Employee : ");
			salary = Util.getInputInteger();
			String isertquery = "Insert Into Employee Values ("+"'" +id+"','"+ name +"','"
					+age +"','"+ salary+"')";
			stmt.executeUpdate(isertquery);
			 System.out.println("Do want to continue ?\n1. Yes \n2.No");
			 choice = Util.getInputInteger(); 
			}while(choice ==1);
			con.commit();
			System.out.println("\nTransaction is commited successfully.\n");
			print(stmt);
		}catch(SQLException se){
		   System.out.println("Error Occurs...");
		   con.rollback();
		}
	}

	private static void print(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("Select * From Employee");
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
