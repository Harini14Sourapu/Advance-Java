package com.javapgm;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crudoperationsusingstatement {

	public static void main(String[] args) throws SQLException {
		//step1 load and register the driver(mysql)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step2 establish connection between java and mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root","Harini@123");
			System.out.println("Connection Successfully");
			Statement stmt=con.createStatement();
			//step3 create the statement (writing the queries)
			Statement stmt1=con.createStatement();
			//String sql="create database jdbcclass";
			//String sql="create table Employee(id int,dob date)";
			//String sql="alter table Employee add age int";
			//String sql="alter table Employee drop age";
			//String sql="alter table Employee rename column id to sid";
			//String sql="alter table Employee modify sid varchar(10)";
			//String sql="insert into Employee values(10,'1998-03-28', 22)(20,'2006-08-27', 21)";
			//String sql="update Employee set sid='1000'";
			//String sql="delete from employee";
			//String sql="select*from employee";
			//String sql="insert into employee values(12,'2003-11-14')";
			String sql="select*from employee";
            ResultSet rs=stmt1.executeQuery(sql);
            while(rs.next()) {
            	System.out.println(rs.getInt("id"));
            	System.out.println(rs.getInt("dob"));
            	System.out.println(rs.getInt("age"));
            }
			
			//int res=stmt1.executeUpdate(sql); //ddl and dml commands
			//System.out.println("exceuted");
			
            
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

