package com.itech.librarymanagement.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_Util_Library {
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/library_management_system";
	static final String USER="root";
	static String PASS="admin";
	Statement stmt=null; 
	static Connection conn=null;
	static Connection connect;
	Db_Util_Library()
	{
	}
	    public static void connectDB()throws Exception
	    {

				Class.forName(JDBC_DRIVER);
				conn= DriverManager.getConnection(DB_URL,USER,PASS);
	}
		public static void update(String sql) throws Exception
		{
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.executeUpdate();
			}
		public static ResultSet select(String sql) throws SQLException
		{
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery(); 
			return rs;
		}
		
		 public static void closeDB() throws Exception {
		        conn.close();
		    }

	}

