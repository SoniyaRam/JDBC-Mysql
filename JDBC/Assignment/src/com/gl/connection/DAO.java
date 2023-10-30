package com.gl.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static  Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/gl";
		String username = "root";
		String password = "Laison@2001";
		return DriverManager.getConnection(url, username, password);

	}
}
