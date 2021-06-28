package com.java.learn.basics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JdbcSelectQuery {
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String password = "system";
	static String user = "system";
	static Connection con;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JdbcSelectQuery obj = new JdbcSelectQuery();
		System.out.println("*************SELECT ALL USERS***********");
		obj.selectAll();
		System.out.println("\n*************DELETE ONE USER***********");
		obj.deleteUser();
		System.out.println("\n*************ADD ONE USER***********");
		obj.addUser();
		System.out.println("\n*************SELECT SPECIFIC USER***********");
		obj.selectSpecificUser();//prepare statement for sql injection
		System.out.println("\n*************UPDATE SPECIFIC USER***********");
		obj.updateSpecificUser();
		if (con != null) {
			con.close();
		}
	}

	public static void closeStatement(Statement statement) throws SQLException {
		if (statement != null) {
			statement.close();
		}
	}
	private void selectAll() throws SQLException {
		String query = "select * from users";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			System.out.println("{user id:" + rs.getInt(1) + ", Name:" + rs.getString(2) + " " + rs.getString(3)
					+ ", Type:" + rs.getString(4) + ", creation date:" + rs.getDate(5) + "}");
		}
		JdbcSelectQuery.closeStatement(statement);
	}
	private void selectSpecificUser() throws SQLException {
		String sql = "select * from users where id=?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, 113753);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			System.out.println("{user id:" + rs.getInt(1) + ", Name:" + rs.getString(2) + " " + rs.getString(3)
					+ ", Type:" + rs.getString(4) + ", creation date:" + rs.getDate(5) + "}");
		}
		JdbcSelectQuery.closeStatement(statement);
	}
	private void addUser() throws SQLException {
		String query = "insert into users VALUES (?, ?, ?, ?, TO_DATE(sysdate))";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, 113753);
		statement.setString(2, "Poushali");
		statement.setString(3, "Laskar");
		statement.setString(4, "Learning");
		int count = statement.executeUpdate();
		System.out.println("No of inserted row: "+count);
		JdbcSelectQuery.closeStatement(statement);
	}
	private void deleteUser() throws SQLException {
		String query = "DELETE FROM USERS where Id=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, 113753);
		int count = statement.executeUpdate();
		System.out.println("No of deleted row: "+count);
		JdbcSelectQuery.closeStatement(statement);
	}
	private void updateSpecificUser() throws SQLException {
		String query = "update USERS set LAST_NAME=? where Id=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, "Sribasbanikam");
		statement.setInt(2, 113753);
		int count = statement.executeUpdate();
		System.out.println("No of updated row: "+count);
		JdbcSelectQuery.closeStatement(statement);
	}
}
