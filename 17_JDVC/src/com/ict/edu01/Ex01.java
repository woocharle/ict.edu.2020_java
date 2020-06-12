package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//자바와 오라클을 연결하기 위한 라이블러리를 프로젝트에 등록하기
public class Ex01 {
	public static void main(String[] args) {
		//1. java를 오라클에 접속할 수 있도록 도와주는 
		Connection conn = null;
	
		//2. SQL 작성, 구분생성
		Statement stmt = null;
		
		//3. select문을 사용할 때 결과를 받는 클래스
		//   select문의 결과는 항상 테이블 상태이다. 나머지는 숫자로 받는다.
		ResultSet rs = null;    // select 이용할 때
		int result = 0;	        // select를 제외한 나머지를 이용할 때.
		
		//4. jdbc 드라이버 로딩: 오라클, MySQL 각 DBMS 마다 내용이 다르다.
				
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@203.236.220.86";	//String url = "jdbc:oracle:thin:@[자기 ip주소]"
			String user = "c##jwc";					
			String password = "1112";
			
			//5. 오라클 접속
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 6. sql 작성
			
			String sql = "select * from members";
			
			// 7. sql을 담아서 보낼 구분 생성 
			stmt = conn.createStatement();
			
			// 8. 구분에 SQL을 담아서 보내고 결과를 받는다. 
			// SQL 구문이 select일 때
				rs = stmt.executeQuery(sql);
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
			
			// SQL 구문이 select 문 외의 문장일 때
			
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
	
}
