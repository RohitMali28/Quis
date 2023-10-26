package com.QuisCompition;

import java.sql.SQLException;
import java.util.Scanner;

public class ProjectMain extends UserRegistration {
	public static void main(String[] args) throws SQLException {
		System.out.println("Pleas select User or Admin option:-");
		Scanner sc =new Scanner(System.in);
		System.out.println("1. User Operation");
		System.out.println("2. Admin Operation");
		int a = sc.nextInt();
			if (a==1) {
			System.out.println("Please Select from beow option:-");
			System.out.println("1.User Registration");
			System.out.println("2.User Login");
			int b = sc.nextInt();
			if (b==1) {
		userRegistration();
		} else {
			UserLogin userLogin	= new UserLogin();
			userLogin.userLogin();
			}
		
	}else {
		Adminlogin admin= new Adminlogin();
		admin.adminLogin();
	}
		System.out.println("closde");
	}
}
