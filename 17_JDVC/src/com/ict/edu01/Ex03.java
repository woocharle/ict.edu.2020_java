package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.86";
			String user = "c##jwc";					
			String password = "1112";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into members values(members_seq.nextval, 'kkkk', '1111', '치즈루', 30, SYSDATE)";
			stmt = conn.createStatement();
			
			//insert, delete, update
			result = stmt.executeUpdate(sql);
			
			
			if(result > 0) {
				System.out.println("삽입성공");
				sql = "SELECT * FROM members";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2)+ "\t");
					System.out.print(rs.getString(3)+ "\t");
					System.out.print(rs.getString(4)+ "\t");
					System.out.print(rs.getInt(5)+ "\t");
					System.out.println(rs.getString(6).substring(0, 10));
				}
			
			}
			else {
				System.out.println("삽입실패 1");
				
			}

		} catch (Exception e) {
			System.out.println("삽입실패 2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
