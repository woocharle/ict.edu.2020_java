package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
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
			String sql = "update members " + 
						 "set m_pw = ?" + 
						 "where idx  = ?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "5555");
			pstmt.setString(2, "2");
			
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("수정성공");
				sql = "select * from members order by idx";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2)+ "\t");
					System.out.print(rs.getString(3)+ "\t");
					System.out.print(rs.getString(4)+ "\t");
					System.out.print(rs.getInt(5)+ "\t");
					System.out.println(rs.getString(6));
				}
			}
			else {
				System.out.println("수정실패");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} 
			
		}
	
	}
	
}
