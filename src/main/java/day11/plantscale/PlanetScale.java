package day11.plantscale;

import java.sql.*;
import java.util.*;

import day11.solved.User1;

public class PlanetScale {

	public static void main(String[] args) {

//		dropTable();
//		createTable();
//		insertInto();
//		selectUserRecords();
//		updateRecords();
//		deleteRecord();
		selectUserRecords();

	}

//	create table method
	public static void createTable() {

		try {

//			creating new connection using connection util
			Connection con = ConnectionUtil.getConnection();

			// SQL query to create a new table
			String createTableSQL = "CREATE TABLE users (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "name VARCHAR(50) NOT NULL," + "age INT," + "email VARCHAR(100)" + ")";

			Statement statement = con.createStatement();

			// Execute the query to create the table
			statement.executeUpdate(createTableSQL);

			System.out.println("Table created successfully.");

			ConnectionUtil.close(con, statement, null);

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

//	insert the values into the table user
	public static void insertInto() {

		int rows = 0;

		try {

//			creating new connection using connection util
			Connection con = ConnectionUtil.getConnection();

			String insertSQL1 = "INSERT INTO users (name, age, email) VALUES ('John Doe', 30, 'john.doe@example.com')";
			String insertSQL2 = "INSERT INTO users (name, age, email) VALUES ('Jane Smith', 28, 'jane.smith@example.com')";
			String insertSQL3 = "INSERT INTO users (name, age, email) VALUES ('Michael Johnson', NULL, 'michael.johnson@example.com')";
			String insertSQL4 = "INSERT INTO users (name, age, email) VALUES ('Emily Brown', 22, NULL)";
			String insertSQL5 = "INSERT INTO users (name, age, email) VALUES ('Robert Lee', 35, 'robert.lee@example.com')";

			ArrayList<String> bulkCommand = new ArrayList<>();
			bulkCommand.add(insertSQL1);
			bulkCommand.add(insertSQL2);
			bulkCommand.add(insertSQL3);
			bulkCommand.add(insertSQL4);
			bulkCommand.add(insertSQL5);

			for (String insert : bulkCommand) {

				PreparedStatement preparedStatement = con.prepareStatement(insert);
				rows += preparedStatement.executeUpdate();
				preparedStatement.close(); // Close the PreparedStatement after executing

			}

			System.out.println("Number of rows affected: " + rows);

			ConnectionUtil.close(con, null, null);

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

//	update the user table records
	public static void updateRecords() {

		try {
			Connection con = ConnectionUtil.getConnection();

			// Update query to change the email of the user "John Doe"
			String updateSQL = "UPDATE users SET email = ? WHERE name = ?";

			PreparedStatement preparedStatement = con.prepareStatement(updateSQL);

			// Set the new email and the user name in the update query
			preparedStatement.setString(1, "john.doe.new@example.com");
			preparedStatement.setString(2, "John Doe");

			int rows = preparedStatement.executeUpdate();

			System.out.println("Number of rows updated: " + rows);

			preparedStatement.close();
			ConnectionUtil.close(con, null, null);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

//	delete specific records from the table

	public static void deleteRecord() {

		try {
			Connection con = ConnectionUtil.getConnection();

			// DELETE query to delete a record based on name
			String deleteSQL = "DELETE FROM users WHERE name = ?";

			PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);

			// Set the name of the user you want to delete
			String userNameToDelete = "Jane Smith";
			preparedStatement.setString(1, userNameToDelete);

			int rowsDeleted = preparedStatement.executeUpdate();

			System.out.println("Number of rows deleted: " + rowsDeleted);

			preparedStatement.close();
			ConnectionUtil.close(con, null, null);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

//	select the user table records
	public static void selectUserRecords() {

		try {
			Connection con = ConnectionUtil.getConnection();

			// SELECT query to retrieve user information by name
			String selectSQL = "SELECT * FROM users";

			PreparedStatement preparedStatement = con.prepareStatement(selectSQL);

			// Set the name of the user you want to retrieve
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(selectSQL);

			List<User> users = new ArrayList<>();

			// Process the result set if needed
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String email = resultSet.getString("email");

				User user = new User(id, name, age, email);
				users.add(user);
			}
			preparedStatement.close();
			ConnectionUtil.close(con, null, resultSet);

			// Now the `users` list contains the records as objects
			for (User user : users) {
				System.out.println(user);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

//	drop the user table
	public static void dropTable() {

		try {

//			creating new connection using connection util
			Connection con = ConnectionUtil.getConnection();

			String dropTableSQL = "DROP TABLE users";

			Statement statement = con.createStatement();

			// Execute the query to create the table
			statement.executeUpdate(dropTableSQL);

			System.out.println("Table dropped");
			ConnectionUtil.close(con, statement, null);

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}
}
