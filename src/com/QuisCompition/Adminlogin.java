package com.QuisCompition;

import java.util.Scanner;

public class Adminlogin {
	public static void adminLogin() { 
		String id ="GroupA";
		String pw = "Admin@1234";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Login details:-");

		System.out.println("Enter Login id:-");
		String adminid = sc.next();

		System.out.println("Enter Password:-");
		String adminpw = sc.next();
		
		if (id.equals(adminid) && pw.equals(adminpw)) {
			System.out.println("Define user operation here");
		}		
	}
}
