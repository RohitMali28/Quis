package com.QuisCompition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserOperation {
	static Connection connection = null;
	static PreparedStatement ps = null;
	protected static void userOperation(String firstname, String lastname, String username, String password,String city,String email, String mobile) throws SQLException { // to load the registration details
		try {		
		Connections connectionTest = new Connections();
		connection = connectionTest.getConnectionDetails();
		ps = connection.prepareStatement("insert into registration (Firstname,LastName,UserName,Password,City,Emailid,MobileNumber)values(?,?,?,?,?,?,?)");
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ps.setString(3, username);
		ps.setString(4, password);
		ps.setString(5, city);
		ps.setString(6, email);
		ps.setString(7, mobile);
		int j = ps.executeUpdate();
	}
	catch (SQLException e) {
		e.printStackTrace();
	} 
	finally { 					//Connection closed
	connection.close();
	ps.close();
	}
		}
}
