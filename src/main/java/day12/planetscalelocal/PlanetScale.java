package day12.planetscalelocal;

import java.sql.*;
import java.util.*;

public class PlanetScale {

//	create table method
	public static void createTable() throws SQLException {

		Connection con = null;
		Statement statement = null;

		// SQL query to create a new table
		String createTableQuery = "CREATE TABLE users (" + "id INT NOT NULL," + "name VARCHAR(50) NOT NULL,"
				+ "age INT NOT NULL," + "email VARCHAR(100) NOT NULL PRIMARY KEY" + ")";

		try {

//			creating new connection using connection util
			con = ConnectionUtil.getConnection();

			statement = con.createStatement();

			// Execute the query to create the table
			statement.executeUpdate(createTableQuery);

			System.out.println("User Table created successfully");

		} catch (SQLException e) {

			throw new SQLException("Failed to create the table: " + e.getMessage());
		} finally {

			ConnectionUtil.close(null, statement, null, con);
		}

	}

//	select all the records from the database
	public static List<User> selectRecords() throws SQLException {

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String selectQuery = "SELECT * FROM users";

		try {

//			creating new connection using connection util
			con = ConnectionUtil.getConnection();

			statement = con.createStatement();
			resultSet = statement.executeQuery(selectQuery);

//			creating new arraylist to store the user records
			List<User> usersList = new ArrayList<>();

//			iterate through the resultset
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String email = resultSet.getString("email");

				User user = new User(id, name, age, email);
				usersList.add(user);
			}

			System.out.println("User records retrived successfully");

//			return the usersList
			return usersList;

		} catch (SQLException e) {

			throw new SQLException("Failed to retrive the user records: " + e.getMessage());
		} finally {

			ConnectionUtil.close(resultSet, statement, null, con);
		}
	}

//	insert the user in the table
	public static void insertUser(User user) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;

		String insertSQL1 = "INSERT INTO users (id, name, age, email) VALUES (?,?,?,?)";

	}
}
