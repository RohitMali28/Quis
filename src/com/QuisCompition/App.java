package com.QuisCompition;
	
import java.util.Scanner;

public class App {

		public static void main(String[] args) {
		   
			String R1 = " 1 What is the extension of java code files ? \n "
			          +"(a) Guido van Rossum\n(b) James Gosling\n(c) Dennis Ritchie\n(d) Bjarne Stroustrup\n" ;
	        String R2 = " 2 What is the extension of java code files ? \n "
	        		 + "(a).js\n(b).txt\n(c).class\n(d).java\n";
	        String R3 = " 3 Which environment variable is used to set the java path ? \n"
	        		 + "(a)maven path\n(b)java path\n(c)java\n(d)Java home\n";
	        String R4 = " 4 Which of these are selection statements in Java ? \n"
	       		     + "(a)Break\n(b)continue\n(c)for()\n(d)if()\n";
	        String R5 = " 5  Which of these keywords is used to define interfaces in Java ? \n"
	       		    + "(a)intif\n(b)Intif\n(c)interface\n(d)Interface\n";
	        String R6 = " 6 Which of the following is a superclass of every class in Java ? \n"
	            	+ "(a)Arraylist\n(b)Absract list\n(c)Object class\n(d)String\n";
	        String R7 = " 7 Which of the below is not a Java Profiler ? \n"
	       		    + "(a)Jprofiler\n(b)Eclipse Profiler\n(c)JVM\n(d)jconsole\n";
	        String R8 = " 8 Which of these packages contains the exception Stack Overflow in Java ? \n"
	       		    + "(a)java.io\n(b)java.system\n(c)java.lang\n(d)java.util\n";
	        String R9 = " 9 Which one of the following is not an access modifier ? \n"
	       		    + "(a)Protected\n(b)void\n(c)public\n(d)Private\n";
	        String R10 = " 10 Which of these keywords is used to define packages in Java ? \n"
	                + "(a)pkg\n(b)Pkg\n(c)package\n(d)Package\n";
	        Question [] Questions = {
	        		new Question(R1,  "b"),
	        		new Question(R2,  "d"),
	        		new Question(R3,  "d"),
	        		new Question(R4,  "d"),
	        		new Question(R5,  "d"),
	        		new Question(R6,  "c"),
	        		new Question(R7,  "c"),
	        		new Question(R8,  "c"),
	        		new Question(R9,  "b"),
	        		new Question(R10, "c"),
	        };
	        takeTest(Questions);
	        }
		public static void takeTest(Question [] Questions) {
			int score = 0 ;
			Scanner sc = new Scanner (System.in);
			for(int i = 0; i < Questions.length ; i++) {
				System.out.println(Questions[i].Question1);
				String Answare = sc.nextLine();
				if(Answare.equals(Questions[i].Answare)) {
					score++;
				}
			}
			System.out.println("Your scoreb " + score +"/"+ Questions.length);
		}
	}


