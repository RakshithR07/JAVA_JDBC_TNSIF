package com.tnsif.jdbc;
import java.util.*;
import java.sql.*;
public class jdbcDemo {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jssate","root","Rakshith@2002" );
			System.out.println("Connection Established");
			Statement st =con.createStatement();
			String sql="insert into student"+"(Regno, Name, Mark1, Mark2, Total)"+ "values (1007, Skanda, 90, 98, 188)";

			st.executeUpdate(sql);

			System.out.println("Insert Complete");

			ResultSet rs=st.executeQuery("select * from student");

			while(rs.next())
			{	
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(5));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
