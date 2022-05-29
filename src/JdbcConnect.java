import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	public static void main(String[] args) {
		
		try {
			// 1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Establish the connection with database
			// url - url of database with which application needs to get connected
			// username - username to access database
			// password - password for the username
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mytrgdb", 
					"root", 
					"root");
			System.out.println("Connected to Database");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
