package com.ict.edu02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("선택하시오.");
			System.out.println("1. 테이블 보기 ");
			System.out.println("2. 테이블 삽입");
			System.out.println("3. 테이블 삭제");
			System.out.println("4. 테이블 갱신");
			int su = sc.nextInt();
			String sql;
			String idx;
			String age;
			
			switch (su) {
			case 1: DAO.getInstance().getSelect(); break;
			case 2: 
				System.out.println("정보를 입력하시오.");
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("패스워드: ");
				String pass = sc.next();
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				age = sc.next();
				
				sql = "insert into members \n"+
					  "values(members_seq.nextval, "+ id + ", "+ pass + ", "+ name +"," + age +", SYSDATE)";
				
				
				DAO.getInstance().getIDU(sql);
				break;
				
			case 3: 
				DAO.getInstance().getSelect();
				System.out.print("삭제할 IDX: ");
				idx = sc.next();
				sql = "delete from members where idx = " + idx;
				
				DAO.getInstance().getIDU(sql);
				break;
				
			case 4: 
				DAO.getInstance().getSelect();
				System.out.print("갱신할 IDX: ");
				idx = sc.next();
				System.out.print("갱신할 나이 : ");
				age = sc.next();
				
				sql = "UPDATE members\n" +
					  "SET m_age =" + age + "\n" + 
					  "where idx = " + idx;
				
				DAO.getInstance().getIDU(sql);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
