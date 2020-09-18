package com.KOPO.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import org.sqlite.SQLiteConfig;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB {
	private Connection connection;
	private String dbFileName;
	private String dbTableName;
	static {
		try {
			Class.forName("org.sqlite.JDBC");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public DB(String databaseFileName, String dbTableName) {
		this.dbFileName = databaseFileName;
		this.dbTableName = dbTableName;
	}
	public boolean open() {
		try {
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/" + 
			this.dbFileName, config.toProperties());
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean close() {
		if(this.connection == null) {
			return true;
		}
		try { 
			this.connection.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void insertData(Test test) {
		String query = "INSERT INTO " + this.dbTableName + " (name, kor, eng, math) VALUES(?, ?, ?, ?);";
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setString(1, test.name);
			preparedStatement.setInt(2, test.kor);
			preparedStatement.setInt(3, test.eng);
			preparedStatement.setInt(4, test.math);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			System.out.println(query);
			System.out.println("@@@@@@@@@@@@@@@" + test.name);
			System.out.println(test.kor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Test selectData(int idx) throws SQLException {
		String query = "SELECT * " + this.dbTableName + " (idx) VALUES(?);";
		PreparedStatement preparedStatement = this.connection.prepareStatement(query);	// PreparedStatement를 이용해 접속 엔진을 연다.
		preparedStatement.setString(1, name);	// 1번째 물음표에 name을 넣는다.

		int result = preparedStatement.executeUpdate();	// 엔진을 이용해 쿼리를 보낸다.
		preparedStatement.close();		// 접속 엔진을 닫는다.

		return result;
	}
	
	

}