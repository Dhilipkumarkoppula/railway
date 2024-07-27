package com.railway.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			conn = DriverManager.getConnection("jdbc:derby:C:\\Users\\Hemanth\\MyDB;create=true");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	public static void closeConnection() {
		try {
			if (!conn.isClosed()) {
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
