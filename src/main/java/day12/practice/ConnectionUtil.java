package day12.practice;

import java.sql.*;
import day11.practice.DAOException;

public class ConnectionUtil {

	public static Connection getConnection() throws DAOException {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/core_java";
		String userName = "root";
		String passWord = "123456";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DAOException("Unable to connect to the database");
		}
		return con;
	}

	public static void close(Connection conn, Statement stmt, PreparedStatement pst, ResultSet rs) throws DAOException {

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
			throw new DAOException(e.getMessage());
		}
	}
}
