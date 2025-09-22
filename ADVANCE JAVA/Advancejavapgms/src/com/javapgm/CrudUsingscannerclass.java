package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudUsingscannerclass {

	public static void main(String[] args) throws SQLException {
		//step1 load and register the driver(mysql)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step2 establish connection between java and mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root","Harini@123");
			System.out.println("Connection Successfully");
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Enter the sid");
			int sid=sc.nextInt();
			System.out.println("Enter the dob(yyyy-mm-dd)");
			String dob=sc.next();
			sc.nextLine();
			int age = sc.nextInt();
			//step3 create the statement (writing the queries)
			Statement stmt=con.createStatement();
			String sql = "insert into employee values(" + sid + ", " + dob +","+age+")";
           
			
			int res=stmt.executeUpdate(sql); //ddl and dml commands
			System.out.println("exceuted");
			
            
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

