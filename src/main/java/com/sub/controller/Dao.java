package com.sub.controller;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Vector;

public class Dao {
	
	public static Connection mycon()
	{
		Connection con=null;
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\vinee\\OneDrive\\Desktop\\Java\\Practice\\Collections Frame Works\\com.spring_project1\\jdbc.properties");
			Properties p=new Properties();
			p.load(fi);
			
			Class.forName(p.getProperty("jdbc.driver")).newInstance();
			con=DriverManager.getConnection(p.getProperty("jdbc.url"), p.getProperty("jdbc.username"), p.getProperty("jdbc.password"));
			
			System.out.println(con);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;		
	}
	
	public int register_logics(Data d)
	{
		int res=0;
		Connection con=Dao.mycon();
		try {
			PreparedStatement pst=con.prepareStatement("insert into criclive values(?,?,?,?,?)");
			pst.setString(1, d.getPhoneno());
			pst.setString(2, d.getFirstname());
			pst.setString(3, d.getLastname());
			pst.setString(4, d.getEmail());
			pst.setString(5, d.getPassword());
			
			res=pst.executeUpdate();
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		
		
		return res;
	}

}
