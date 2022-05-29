import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mytrgdb", 
					"root", 
					"root");
			
			String query = "insert into studentdata values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 110);
			preparedStatement.setString(2, "Radha");
			preparedStatement.setString(3, "Sinha");
			preparedStatement.setInt(4, 10);
			preparedStatement.setString(5, "A+");
			
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				System.out.println("record inserted");
			else
				System.out.println("Record not inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
