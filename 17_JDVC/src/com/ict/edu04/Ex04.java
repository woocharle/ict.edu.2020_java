package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
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
			
			String sql = "delete from members where idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "221");
			
			//insert, delete, update
			result = pstmt.executeUpdate();
			System.out.println(rs);
			
			if(result > 0) {
				System.out.println("삭제성공");
				sql = "SELECT * FROM members";
				rs = pstmt.executeQuery(sql);
				
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
				System.out.println("삭제실패 1");
				
			}
			
		} catch (Exception e) {
			System.out.println("삭제실패 2");
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
