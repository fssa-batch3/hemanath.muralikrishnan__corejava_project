package day11.plantscale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {

		Connection con = null;
		String url = "jdbc:mysql://aws.connect.psdb.cloud/demo_db?sslMode=VERIFY_IDENTITY";
		String userName = "gi4n223pidlw5uyi4miz";
		String passWord = "pscale_pw_4lVDWLWzGEhcWksR9EtF0IE20fMHdga24NvtJoYcX8P";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect to the database");
		}
		return con;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// No need re throw the exception.
		}
	}
}
