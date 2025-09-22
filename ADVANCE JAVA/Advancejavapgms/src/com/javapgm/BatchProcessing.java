package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) throws SQLException {
		//step1 load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection between java and sql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root","Harini@123");
			
			
			Statement st=con.createStatement();
			String sql1="insert into employee values(201,'2004-11-14',23)";
			st.addBatch(sql1);
			int[] r=st.executeBatch();
			
			String sql2="update employee set id=205 where id =201";
			st.addBatch(sql2);
			int[] r1=st.executeBatch();
			
			//String sql3="delete from employee where id=199";
			//st.addBatch(sql3);
			//int[]r2=st.executeBatch();
			
            //Execute the batch
			System.out.println("Operation Done");
	   }catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
}
}
