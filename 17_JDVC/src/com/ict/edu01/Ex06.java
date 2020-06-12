package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Ex06 {
	// 선택창 만들기
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static int result = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("member 테이블에 하고 싶은 기능을");
		System.out.print("선택하시오. (1.보기 2.추가 3.삭제 4.수정) ");
		int ch = sc.nextInt();
		String key;
		String id;
		String pw;
		String name;
		String age;
		String str;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.86";
			String user = "c##jwc";					
			String password = "1112";
			conn = DriverManager.getConnection(url, user, password);
			
			if (ch == 1) {
				method1();
			} 
			else if (ch == 2) {
				System.out.println("데이터를 추가하시오.");
				System.out.print("아이디: ");
				id = sc.next();
				id = add(id);
				System.out.print("패스워드: ");
				pw = sc.next();
				pw = add(pw);
				System.out.print("이름: ");
				name = sc.next();
				name = add(name);
				System.out.print("나이: ");
				age = sc.next();
				
				str = "INSERT INTO members " + 
					  "values(members_seq.nextval, "+ id + ", "+ pw +", " + name +", "+ age + ", SYSDATE)";
				
				method2(str);
				
				
			}
			else if (ch == 3) {
				method1();
				System.out.print("삭제하고 싶은 튜플의 아이디: ");
				id = sc.next();
				id = add(id);
				
				System.out.print("삭제하고 싶은 튜플의 이름: ");
				name = sc.next();
				name = add(name);
				
				str = "delete from members\n" + 
					  "where m_id = "+ id + " or m_name =" + name;
				
				method2(str);
				
			}
			else if (ch == 4) {
				method1();
				System.out.print("갱신하고 싶은 튜플의 기본키를 선택하시오.");
				key = sc.next();
			
				System.out.print("아이디를 바꾸겠습니까? (1.yes, 2.no) ");
				ch = sc.nextInt();
				if (ch == 1) {
					id = sc.next();
					id = "m_id = " + add(id);
				}
				else {
					id ="";
				}
				
				System.out.print("패스워드를 바꾸겠습니까? (1.yes, 2.no) ");
				ch = sc.nextInt();
				if (ch == 1) {
					pw = sc.next();
					if(id.equals("")) {
						pw = "m_pw = " + add(pw);
					}
					else {
						pw = ", m_pw = " + add(pw);
					}
				}
				else {
					pw ="";
				}

				System.out.print("이름을 바꾸겠습니까? (1.yes, 2.no) ");
				ch = sc.nextInt();
				if (ch == 1) {
					name = sc.next();
					if(pw.equals("") && id.equals("")) {
						name = "m_name = " + add(name);
					}
					else {
						name = ", m_name = " + add(name);
					}
				}
				else {
					name ="";
				}
				
				System.out.print("나이를 바꾸겠습니까? (1.yes, 2.no) ");
				ch = sc.nextInt();
				if (ch == 1) {
					age = sc.next();
					if(pw.equals("") && id.equals("") && name.equals("")) {
						age = "m_age = " + age;
					}
					else {
						age = ", m_age = " + age;
					}
				}
				else {
					age ="";
				}
				
				str = "UPDATE members\n" + 
					  "SET " + id + pw + name + age + "\n"+
					  "where idx = " + key;
				
				System.out.println(str);
				
				method2(str);
			}
					
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
	public static String add(String ch) {
		return "\'" + ch + "\'";
	}
	
	
	public static void method1() {
		try {
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("번호\t아이디\tPW\t이름\t나이\t날짜");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getString(4)+ "\t");
				System.out.print(rs.getInt(5)+ "\t");
				System.out.println(rs.getString(6).substring(0, 10));
			}
			
		} catch (SQLException e) {
	
		}
		
	}
	
	public static void method2(String str) {
		try {	
		
			String sql = str;

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("성공");
				method1();
			}
			else {
				System.out.println("실패 1");
			}

		} catch (SQLException e) {
			System.out.println("실패 2");
		}
		
	}

}
