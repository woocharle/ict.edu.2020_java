package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.86";
			String user = "c##jwc";					
			String password = "1112";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into members values(members_seq.nextval, ?, ?, ?, ?, SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			
			//바인딩변수 채우기
			pstmt.setString(1, "Joe");
			pstmt.setString(2, "1111");
			pstmt.setString(3, "죠");
			pstmt.setString(4, "26");
			
			
			//insert, delete, update
			result = pstmt.executeUpdate();
			
			
			if(result > 0) {
				System.out.println("삽입성공");
				sql = "SELECT * FROM members order by idx";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
