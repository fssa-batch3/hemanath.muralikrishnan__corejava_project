package day12.planetscalelocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {

		Connection con = null;
		String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java";
		String userName = "61yxq5x4d2kzv7760yuh";
		String passWord = "pscale_pw_PTrN1IcnFouBgRTbiJACu7mYsPvxtXKhNjaw3nV1VsB";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, passWord);
			System.out.println("Connection successful to the database");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect to the database");
		}
		return con;
	}

	public static void close(ResultSet rs, Statement stmt, PreparedStatement pst, Connection conn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pst != null) {
				pst.close();
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
