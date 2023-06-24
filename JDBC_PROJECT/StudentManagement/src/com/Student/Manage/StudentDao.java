package com.Student.Manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{
	public static  boolean insertStudentToDB(Student st)
	{
		//JDBC code...
		boolean f=false;
		try
		{
			Connection con= ConnectionProvider.CreateC();
			String query="insert into Student(sname,sphone,scity) values(?,?,?)";
			
			//prepared statement
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//set value of parameters
			
			pstmt.setString(1, st.getStudentname());
			pstmt.setString(2, st.getStudentphone());
			pstmt.setString(3, st.getStudentcity());
			
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) 
	{
		// delete record
		boolean f=false;
		try
		{
			Connection con=ConnectionProvider.CreateC();
			
			String query="delete from Student where sid=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, userId);
			
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}

	public static void DisplayStudent() 
	{
		// Show all student Data
		//boolean f=false;
		try
		{
			Connection con=ConnectionProvider.CreateC();
			
			String query="select * from student";
			
			Statement stmt=con.createStatement();
			
			//stmt.executeQuery(query);
			
			ResultSet set=stmt.executeQuery(query);
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("\n---------------------\n");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static boolean UpdateRecord(String Name,int Id) 
	{
		// Tupdate record
		boolean f=false;
		try 
		{
			Connection con=ConnectionProvider.CreateC();
		
			String query="update student set sname=? where sid=?";
		
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, Name);
			pstmt.setInt(2,Id);
			pstmt.executeUpdate();
			f=true;
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
	}
	
}
