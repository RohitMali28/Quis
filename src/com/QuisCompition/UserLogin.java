package com.QuisCompition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLogin {
	static Connection connection = null;
	protected static void userLogin() {

		try {		
			Connections connectionTest = new Connections();
			connection = connectionTest.getConnectionDetails();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your Login details:-");

			System.out.println("Enter Login id:-");
			String userid = sc.next();
			System.out.println("Enter Password:-");
			String userpw = sc.next();

			String sql = "SELECT * FROM registration WHERE UserName = ? AND Password =?"; //Compare User login information
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, userid);
            ps.setString(2, userpw);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                System.out.println("Login Sucessful!");// Data found in the database
                System.out.println("enter Object for quetions prepared");
            } else {
            	// No matching data found in the database
                System.out.println("User id or Password incorrect");
            }

            resultSet.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
    		e.printStackTrace();
        }
	}
}
