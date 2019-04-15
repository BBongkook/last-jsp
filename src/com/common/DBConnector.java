package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	private static final String CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	private static Connection con = null;
	public static void setDriver(){
		try {
			Class.forName(CLASS_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		/*
		 * if(CLASS_NAME.indexOf("oracle")==-1){ throw new
		 * Exception("해당 서버는 오라클드라이버만 지원합니다."); }
		 */
	}
	/*
	 * public static void setDriver2() { try { Class.forName(CLASS_NAME); } catch
	 * (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	public static void open() {
		setDriver();
		try {
			con = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		open();
		return con;
	}
}
