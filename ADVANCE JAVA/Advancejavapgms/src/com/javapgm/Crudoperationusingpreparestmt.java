package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crudoperationusingpreparestmt {

	public static void main(String[] args) throws SQLException {
		//step1 load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection between java and sql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root","Harini@123");
			
			
			//create the statement 
			PreparedStatement pst2=con.prepareStatement("insert into employee values(?,?,?)");
			pst2.setInt(1, 101);//prepared the parameterized queries
			pst2.setString(2, "2004-11-14");
			pst2.setInt(3, 23);
			//execute the queries
			int a=pst2.executeUpdate();
			System.out.println("inserted");
			
			
			
			PreparedStatement pst = con.prepareStatement("update employee set dob=? where id=?");
			pst.setString(1, "2001-04-20"); 
			pst.setInt(2, 191);            
			int b = pst.executeUpdate();
			System.out.println("updated");

			// Delete Operation
			PreparedStatement pst1 = con.prepareStatement("delete from employee where id=?");
			pst1.setInt(1, 101);
			int c = pst1.executeUpdate();
			System.out.println("deleted");
			
			
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}
}






