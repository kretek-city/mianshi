package com.jdbc.unit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UnitMysql {

	public static final  String URL="jdbc:mysql://localhost:3306/itcast";
	public static final String DREIVER = "com.mysql.jdbc.Driver"; 
	public static final String NAME = "root";
	public static final String PASSWORD = "root";
	
	static{
		try {
			 //加载驱动器 
			 Class.forName(DREIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		try {
			////创建与数据库的链接
			return  DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void Close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
