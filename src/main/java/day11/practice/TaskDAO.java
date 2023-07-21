package day11.practice;

import java.sql.*;
import java.util.*;

public class TaskDAO {

	static String url = "jdbc:mysql://localhost/core_java";
	static String userName = "root";
	static String passWord = "123456";

//	method to create table on the already created db name called corejava
	public static void createTable() throws DAOException {

//		query to create task table
		String createTableSQL = "CREATE TABLE tasks (" + "task_id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "task_name VARCHAR(100) NOT NULL," + "tast_status VARCHAR(100) NOT NULL" + ")";

		try {

//			creating connection with database
			Connection con = DriverManager.getConnection(url, userName, passWord);

//			creating statement to execute the query on the database with created connection
			Statement statement = con.createStatement();

//			after executing the query that we wrote
			statement.executeUpdate(createTableSQL);

			System.out.println("Task table created successfully");

			statement.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e.getMessage());
		} finally {

			System.out.println("Process Completed");
		}
	}

//	method which will insert the records on the table name called tasks
	public static void createTask(Task task) throws DAOException {
		
		
//		validate the task not equal to null
		
		if(task == null) {
			
			throw new DAOException("Task cannot be null");
		}

//		query to insert the task on the table
		String insertInto = "INSERT INTO tasks " + "(task_name, tast_status) " + "VALUES (?,?)";

		try {

//			creating connection with database
			Connection con = DriverManager.getConnection(url, userName, passWord);

//			creating prepare statement to execute the query on the database with create connection

			PreparedStatement preparedStatement = con.prepareStatement(insertInto);

//			inserting the task records on the task table
			preparedStatement.setString(1, task.getName());
			preparedStatement.setString(2, task.getStatus());
			int rows = preparedStatement.executeUpdate();

			System.out.println("Number of rows affected: " + rows);

			preparedStatement.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DAOException(e.getMessage());
		} finally {

			System.out.println("Process Completed");
		}

	}
}
