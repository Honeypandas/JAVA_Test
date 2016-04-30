package model;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCtest {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/ywq";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static java.sql.Connection con = null;

	static {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static java.sql.Connection getConnection() {
		
		return con;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection(URL, USER,
				PASSWORD);
		
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select user_name,age  from ywq_goddess");

		while (rs.next()) {
			System.out.println(rs.getString("user_name") + rs.getInt("age"));
		}

	}

}
