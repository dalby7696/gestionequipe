package com.gestionequipe.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysqlconnect {

	
	 Connection conn=null;
	    public static Connection ConnectDB()
	    {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        Connection   conn =DriverManager.getConnection("jdbc:mysql://localhost/dbgestionequipe", "root", "rootpasswordgiven");
	            // 
	            return conn;
	            
	        }
	        catch (Exception e) 
	        {
	        System.out.print("error conection");
	        }return null;
	    }
}
