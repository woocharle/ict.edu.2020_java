package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
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
			
			// PrepareStatement에서는 변경 가능한 변수를 바인딩변수라고 한다. ?로 표시한다.
			String sql = "select * from members where idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			//pstmt.setString(? 순서, ?에 들어갈 data);
			pstmt.setString(1, "6");
			
			rs = pstmt.executeQuery();
			
			//바인딩 변수 
		
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getString(4)+ "\t");
				System.out.print(rs.getInt(5)+ "\t");
				System.out.println(rs.getString(6).substring(0, 10));
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
