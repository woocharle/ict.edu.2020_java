package com.ict.edu02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	Scanner sc = new Scanner(System.in);
	
	
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
		return dao;
	}
	
	// 접속
	public Connection getConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://203.236.220.86:3306/mydb?autoReconnect=true";
			String user = "jwc";
			String password = "1111";
			
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
			String sql = "select * from member01 order by idx";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	public ArrayList<VO> getIDU(int su, String sql, int n_idx) {
		ArrayList<VO> list = null;
		String idx, id, pass, name, age;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			switch (su) {
				case 2:
					System.out.println("정보를 입력하시오.");
					System.out.print("아이디: ");
					id = sc.next();
					System.out.print("패스워드: ");
					pass = sc.next();
					System.out.print("이름: ");
					name = sc.next();
					System.out.print("나이: ");
					age = sc.next();
					
					idx = Integer.toString(n_idx);
					
					pstmt.setString(1, idx);
					pstmt.setString(2, id);
					pstmt.setString(3, pass);
					pstmt.setString(4, name);
					pstmt.setString(5, age);
					
				break;
				
				case 3:
					System.out.print("삭제할 IDX: ");
					idx = sc.next();
					
					pstmt.setString(1, idx);
				
				break;
				
				case 4:
					System.out.print("갱신할 IDX: ");
					idx = sc.next();
					System.out.print("갱신할 나이 : ");
					age = sc.next();
					
					pstmt.setString(1, age);
					pstmt.setString(2, idx);
					
				break;
				
			}
			
			
			int result = pstmt.executeUpdate();
			
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
		
	}
	
	public ArrayList<VO> getLogin(String sql) {
		ArrayList<VO> list = new ArrayList<VO>();
	
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
		
			System.out.print("ID: ");
			String log_id = sc.next();
			System.out.print("PW: ");
			String log_pw = sc.next();
			System.out.println();
			
			pstmt.setString(1, log_id);
			pstmt.setString(2, log_pw);
			rs = pstmt.executeQuery();
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
			
		} catch (Exception e) {
			System.out.println("코드에러");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

			
	
		return list;
		
	}
}
