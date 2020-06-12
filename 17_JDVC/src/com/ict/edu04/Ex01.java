package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/* PreparedStatement 
	Statement와 달리 PreparedStatement는 sql을 넣는 절차가 다름. 

*/

public class Ex01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;    // select 이용할 때
		int result = 0;	        // select를 제외한 나머지를 이용할 때.
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@203.236.220.86";	//String url = "jdbc:oracle:thin:@[자기 ip주소]"
			String user = "c##jwc";					
			String password = "1112";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from members";
			
			// 바로 sql을 담는다.
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getString(4)+ "\t");
				System.out.print(rs.getInt(5)+ "\t");
				System.out.println(rs.getString(6));
				/*
				System.out.print(rs.getInt("idx"));
				System.out.print(rs.getString("m_id"));
				System.out.print(rs.getString("m_pw"));
				System.out.print(rs.getString("m_name"));
				System.out.print(rs.getInt("m_age"));
				System.out.println(rs.getString("m_reg"));
				*/
			}

			
		} catch (Exception e) {
			

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
