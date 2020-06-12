package com.ict.edu03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	public ArrayList<VO> getSelect() {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 데이터를 VO에 담는다.
			
			while(rs.next()) {
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setM_id(rs.getString(2));
				vo.setM_pw(rs.getString(3));
				vo.setM_name(rs.getString(4));
				vo.setM_age(rs.getString(5));
				vo.setM_reg(rs.getString(6).substring(0, 10));
				list.add(vo);
			}
			
			// 출력은 메인 메소드에서 하기
			
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
		return list;
	}
	
	public ArrayList<VO> getIDU(String sql) {
		ArrayList<VO> list = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("성공");
				list = getSelect();
			} else {
				System.out.println("실패 1");
			}
		} catch (Exception e) {
			System.out.println("실패 2");
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
		
	}
	
}
