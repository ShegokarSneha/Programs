package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.Util.Util;

public class CrudOperstionsUsingStatement {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		Class.forName("com.mysql.jdbc.Driver");
		int choice = 0;
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		System.out.println("************ CURD Operation ***************");
		
		do {
			System.out.println("\nEnter Operation : \n1. Create New TAble \n2. Insert Operation \n3. Delete Operation"
					+ "\n4. Update Operation \n5. Exit");
			System.out.println("\nEnter Choice : ");
			choice = Util.getInputInteger();
			switch(choice) {
			
			case 1:
				System.out.println("*********** Creating New Table *************");
				createTable(stmt);
				break;
				
			case 2:
				System.out.println("*********** Inserting Operation *************");
				insert(stmt);
				break;
				
			case 3:
				System.out.println("*********** Deleting Operation *************");
				delete(stmt);
				break;
				
			case 4:
				System.out.println("*********** Updating Operation *************");
				update(stmt);
				break;
				
			case 5:
				System.out.println("Exit Successfully");
				System.exit(choice);
				break;
				
			default:
				System.out.println("Invalid Input");
			}
		}while(choice > 0 && choice <= 5);
					
			
}

	private static void update(Statement stmt) throws SQLException {
		String updatequery = "Update Employee set AGE = 30 where NAME = 'pooja'";
		stmt.executeUpdate(updatequery);
		print(stmt);
	}

	private static void delete(Statement stmt) throws SQLException {
		String deletequery = "delete from Employee where NAME = 'pooja'";
		stmt.executeUpdate(deletequery);
		print(stmt);
		
	}

	private static void insert(Statement stmt) throws SQLException {
		int choice = 0;
		do {
			System.out.println("Enter Employee Id: ");
			int id = Util.getInputInteger();
			System.out.println("Enter Name of Employee : ");
			String name = Util.getInputString();
			System.out.println("Enter Age Of Employee : ");
			int age = Util.getInputInteger();
			System.out.println("Enter Salary Of Employee : ");
			int salary = Util.getInputInteger();
			String isertquery = "Insert Into Employee Values ("+"'" +id+"','"+ name +"','"+age +"','"+ salary+"')";
			stmt.executeUpdate(isertquery);
			System.out.println("Do You Want To add More Data\n1. Yes \n2. No");
			choice = Util.getInputInteger();
		}while(choice == 1);
		print(stmt);
		
	}

	private static void createTable(Statement stmt) throws SQLException {
		
		System.out.println("Enter Table Name:");
		String tablename = Util.getInputString();
		String createquery = "CREATE TABLE Employee."+tablename +"("
                + "EMPID INT NOT NULL,"
                + "NAME VARCHAR(45) NOT NULL,"
                + "AGE INT NOT NULL,"
                + "SALARY INT NOT NULL,"
                + "PRIMARY KEY (EMPID))";
		stmt.executeUpdate(createquery);
		print(stmt);
		
	}
	
	public static void print(Statement stmt) throws SQLException {
		
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
