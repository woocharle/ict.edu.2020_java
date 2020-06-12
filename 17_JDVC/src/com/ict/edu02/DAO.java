package com.ict.edu02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*  DAO (Data Access Object)란?
	DataBase의 data에 접근하기 위한 객체
    CRUD (insert, update, delete, select) 작업을 처리하는 메소드를 만들어서 제동한다.
	
	싱글톤 패턴: 하나의 인스턴스만을 생성하고, 사용할 수 있다.
	하나의 객체만 생성하고 사용해야 할 때, 
 
 */
public class DAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	int result;
	
	
	
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
		return dao;
	}
	
	// 접속
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.86";
			String user = "c##jwc";					
			String password = "1112";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	
	// select 
	public void getSelect() {
		
		try {
			conn = getConnection();
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getString(4)+ "\t");
				System.out.print(rs.getInt(5)+ "\t");
				System.out.println(rs.getString(6).substring(0, 10));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void getIDU(String sql) {
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("성공");
				getSelect();
			} else {
				System.out.println("실패 1");
			}
		} catch (Exception e) {
			System.out.println("실패 2");
			System.out.println(e);
		}
	}
	
}
