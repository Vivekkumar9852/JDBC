import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			int val = 0;
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mistu", 
					"root", 
					"root");
			Statement statement = connection.createStatement();
//			String query = "insert into studentdata values(106, 'Neeta', 'Verma', 10, 'B')";
//			val = statement.executeUpdate(query);
//			if(val > 0)
//				System.out.println("record inserted");
//			else
//				System.out.println("Record not inserted");
			
//			String query = "update studentdata set standard = 11 where roll_no = 104";
//			val = statement.executeUpdate(query);
//			if(val > 0)
//				System.out.println("record updated");
//			else
//				System.out.println("Record not updated");
			
			String query = "delete from studentdata where roll_no = 106";
			val = statement.executeUpdate(query);
			
			if(val > 0)
				System.out.println("record deleted");
			else
				System.out.println("Record not deleted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
