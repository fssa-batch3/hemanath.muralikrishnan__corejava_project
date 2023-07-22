package day12.practice;

import java.sql.*;
import java.util.*;

import day11.practice.DAOException;
import day11.practice.Task;

public class TaskCRUD {

//	method which will insert the records on the table name called tasks
	public static void createTask(Task task) throws DAOException {

		// validate the task not equal to null

		if (task == null) {

			throw new DAOException("Task cannot be null");
		}

//		query to insert the task on the table
		String insertInto = "INSERT INTO tasks " + "(task_name, tast_status) " + "VALUES (?,?)";

		try {

//			creating connection with database
			Connection con = ConnectionUtil.getConnection();

//			creating prepare statement to execute the query on the database with create connection

			PreparedStatement preparedStatement = con.prepareStatement(insertInto);

//			inserting the task records on the task table
			preparedStatement.setString(1, task.getName());
			preparedStatement.setString(2, task.getStatus());
			int rows = preparedStatement.executeUpdate();

			System.out.println("Number of rows affected: " + rows);

			ConnectionUtil.close(con, null, preparedStatement, null);

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DAOException(e.getMessage());

		} finally {

			System.out.println("Task creating process");
		}

	}

//	method which will update the records on the table 
	public static void updateTask(int task_id) throws DAOException {

		if (task_id <= 0) {

			throw new DAOException("Task id cannot be zero or lesser than zero");
		}

//		query to update the task on the table

		try {

			Connection con = ConnectionUtil.getConnection();

			// Update query to change to change the task
			String updateSQL = "UPDATE tasks SET tast_status = ? WHERE task_id = ?";

			PreparedStatement preparedStatement = con.prepareStatement(updateSQL);

			// Set the new email and the user name in the update query
			preparedStatement.setString(1, "Completed");
			preparedStatement.setInt(2, task_id);

			int rows = preparedStatement.executeUpdate();

			System.out.println("Number of rows updated: " + rows);

			preparedStatement.close();
			ConnectionUtil.close(con, null, preparedStatement, null);
		} catch (SQLException e) {

			e.printStackTrace();
			throw new DAOException(e.getMessage());

		} finally {

			System.out.println("Task updating process");
		}
	}

//	method which delete the task
	public static void deleteTask(int task_id) throws DAOException {

		if (task_id <= 0) {

			throw new DAOException("Task id cannot be zero or lesser than zero");
		}

//		query to update the task on the table

		try {

			Connection con = ConnectionUtil.getConnection();

			// delete query to remove the task from the db
			String deleteSQL = "DELETE FROM tasks WHERE task_id = ?";

			PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);

			// Set the new email and the user name in the update query
			preparedStatement.setInt(1, task_id);

			int rows = preparedStatement.executeUpdate();

			System.out.println("Number of rows updated: " + rows);

			preparedStatement.close();
			ConnectionUtil.close(con, null, preparedStatement, null);
		} catch (SQLException e) {

			e.printStackTrace();
			throw new DAOException(e.getMessage());

		} finally {

			System.out.println("Task deleting process");
		}
	}

//	method which will return the task as arraylist
	public static List<Task> getAllTasks() throws DAOException {

		try {

			Connection con = ConnectionUtil.getConnection();

			String selectSQL = "SELECT * FROM tasks";

			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(selectSQL);

			List<Task> tasksList = new ArrayList<>();

			while (result.next()) {

				int taskid = result.getInt("task_id");
				String taskname = result.getString("task_name");
				String taskstatus = result.getString("tast_status");

				Task task = new Task(taskid, taskname, taskstatus);
				tasksList.add(task);
			}

			ConnectionUtil.close(con, stmt, null, result);

			return tasksList;

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DAOException(e.getMessage());

		} finally {

			System.out.println("Task retriving process");
		}
	}

}
