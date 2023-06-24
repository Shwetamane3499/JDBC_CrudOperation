package com.Student.Manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
	static Connection con;
	public static Connection CreateC()
	{
		
		
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the conection
			String user="root";
			String password="Raje@3499";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			con=DriverManager.getConnection(url,user,password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
}
