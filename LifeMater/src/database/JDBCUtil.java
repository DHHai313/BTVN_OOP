package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		try {
			// dang ky driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//thong tin database
			String url = "jdbc:mysql://localhost:3306/nhasach";
			String username = "root";
			String password = "";
			//ket noi
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
