import java.sql.*;

public class Connect {
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3333/" + databaseName;
	static String userName = "root";
	static String passWord = "1234";

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, userName, passWord);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO `studentdatabase`.`student` (name) VALUES ('Harish');");
		int status = ps.executeUpdate();
		
		if(status !=0) {
			System.out.println("Databse is Connected");
		}
	}

}
