package com.ebrain.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnectivity {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.jdbc.Driver");//the driver is registered in the JDBC driver manager since the registration process is inside the static initializer of the driver class
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/dbms_april_2023","dbms_april_2023", "Ebrain@20");
		
		return connection;
	}
}
