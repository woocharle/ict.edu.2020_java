package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06_Sol {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	
	public static void getSelect() {
		try {
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("번호\t아이디\t패스워드\t이름\t나이\t날짜");
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
		}
		
	}
	
	public static void getInsert(Scanner sc) {
		try {
			System.out.println("정보를 입력하시오.");
			System.out.print("아이디: ");
			String id = sc.next();
			System.out.print("패스워드: ");
			String pass = sc.next();
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			String age = sc.next();
			
			String sql = "insert into members \n"+
						 "values(members_seq.nextval, "+ id + ", "+ pass + ", "+ name +"," + age +", SYSDATE)";
			 
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				getSelect();
			} else {
				System.out.println("삽입실패 1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입실패 2");
			System.out.println(e);
		}
		
	}
	
	
	public static void getDelete(String idx) {
		try {
			String sql = "delete from members where idx = " + idx;
			
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				getSelect();
			} else {
				System.out.println("삽입실패 1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입실패 2");
			System.out.println(e);
		}
	}
	
	public static void getUpdate(String idx, String age) {
		try {
			String sql = "UPDATE members\n" +
						 "SET m_age =" + age + "\n" + 
						 "where idx = " + idx;
			
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				getSelect();
			} else {
				System.out.println("삽입실패 1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입실패 2");
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {		
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.86";
			String user = "c##jwc";					
			String password = "1112";
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("선택하시오.");
			System.out.println("1. 테이블 보기 ");
			System.out.println("2. 테이블 삽입");
			System.out.println("3. 테이블 삭제");
			System.out.println("4. 테이블 갱신");
			int su = sc.nextInt();
			
			switch (su) {
				case 1: getSelect(); break;
				case 2: getInsert(sc); break;
				case 3: 
					getSelect(); 
					System.out.print("삭제할 IDX: ");
					String idx = sc.next();
					getDelete(idx);
					break;
					
				case 4: 
					getSelect(); 
					System.out.print("갱신할 IDX: ");
					String idx2 = sc.next();
					System.out.print("갱신할 나이 : ");
					String age = sc.next();
					getUpdate(idx2, age);
					break;
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	}
	
}
	
