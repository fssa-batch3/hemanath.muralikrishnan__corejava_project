package day11.solved;

import java.sql.*;
import java.util.*;

import day11.plantscale.User;

public class TestMySqlConnectionDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "123456";

		String query = "SELECT * FROM users";

		try {
			Connection con = DriverManager.getConnection(url, userName, password);

			System.out.println("Connection created...");

			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);

			List<User1> users = new ArrayList<>();

			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("first_name");
				String email = result.getString("email_id");

				User1 user = new User1(id, name, email);
				users.add(user);
			}

			// Now the `users` list contains the records as objects
			for (User1 user : users) {
				System.out.println(user);
			}

			// Close the connections
			result.close();
			statement.close();
			con.close();

			insertRecords(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertRecords(String url, String userName, String password) throws SQLException {

		String query = "INSERT INTO users (first_name,last_name,email_id,password,github_username) VALUES (?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, userName, password);

		PreparedStatement preparedStatement = con.prepareStatement(query);

		String first_name = "aakash";
		String last_name = "balamurugan";
		String email_id = "aaksh@gmail.com";
		String password1 = "12345";
		String github_username = "aakash205";

		preparedStatement.setString(1, first_name);
		preparedStatement.setString(2, last_name);
		preparedStatement.setString(3, email_id);
		preparedStatement.setString(4, password1);
		preparedStatement.setString(5, github_username);
		int rows = preparedStatement.executeUpdate();

		System.out.println("Number of rows affected: " + rows);

		con.close();

	}
}
