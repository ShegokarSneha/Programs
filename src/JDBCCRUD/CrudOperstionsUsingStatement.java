package JDBCCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bridgelabz.Util.Util;

public class CrudOperstionsUsingStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Employee";
		String password = "test";
		String user = "root";
		int id, age, salary;
		String fname;
		String lname;
		int choice = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String createquery = "CREATE TABLE Employee.Employee ("
                    + "EMP_ID INT NOT NULL,"
                    + "FNAME VARCHAR(45) NOT NULL,"
                    + "LNAME VARCHAR(45) NOT NULL,"
                    + "AGE INT NOT NULL,"
                    + "SALARY INT NOT NULL,"
                    + "PRIMARY KEY (EMP_ID))";
			stmt.executeUpdate(createquery);
			
			do {
				System.out.println("Enter Employee Id: ");
				id = Util.getInputInteger();
				System.out.println("Enter First Name of Employee : ");
				fname = Util.getInputString();
				System.out.println("Enter Last Name of Employee :");
				lname= Util.getInputString();
				System.out.println("Enter Age Of Employee : ");
				age = Util.getInputInteger();
				System.out.println("Enter Salary Of Employee : ");
				salary = Util.getInputInteger();
				String isertquery = "Insert Into Employee Values ("+"'" +id+"','"+ fname +"','"+ lname +"','"+age +"','"+ salary+"')";
				stmt.executeUpdate(isertquery);
				System.out.println("Do You Want To add More Data\n1. Yes \n2. No");
				choice = Util.getInputInteger();
			}while(choice == 1);
			ResultSet rs = stmt.executeQuery("Select * From Employee");
			System.out.println();
			System.out.println("Id\tFirst Name\tLast Name\tAge\tSalary");
			System.out.println();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+ rs.getString(3)+"\t\t"
					+rs.getInt(4)+"\t"+ rs.getInt(5));
				}
			stmt.executeUpdate("Update Employee set AGE = 30 where FNAME = 'James'");
			 rs = stmt.executeQuery("Select * From Employee");
				
				System.out.println("Id\tFirst Name\tLast Name\tAge\tSalary");
				System.out.println();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+ rs.getString(3)+"\t\t"
							+rs.getInt(4)+"\t"+ rs.getInt(5));
				}
				stmt.executeUpdate("delete from Employee where FNAME = 'Pooja'");
				rs = stmt.executeQuery("Select * From Employee");
				System.out.println();
				System.out.println("Id\tFirst Name\tLast Name\tAge\tSalary");
				System.out.println();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+ rs.getString(3)+"\t\t"
						+rs.getInt(4)+"\t"+ rs.getInt(5));
					}
				con.close();
				}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
