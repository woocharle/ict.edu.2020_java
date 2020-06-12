package com.ict.edu03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void listPrn(ArrayList<VO> list) {
		System.out.println();
		System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
		for(VO k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getM_id() + "\t");
			System.out.print(k.getM_pw() + "\t");
			System.out.print(k.getM_name() + "\t");
			System.out.print(k.getM_age() + "\t");
			System.out.println(k.getM_reg() + "\t");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		System.out.println("선택하시오.");
		System.out.println("1. 테이블 보기 ");
		System.out.println("2. 테이블 삽입");
		System.out.println("3. 테이블 삭제");
		System.out.println("4. 테이블 갱신");
		System.out.print(">>>> ");
		int su = sc.nextInt();
		
		try {
			String sql, idx, age;
			
			switch (su) {
			case 1: 
				list = DAO.getInstance().getSelect(); 
				listPrn(list);
				break;
			case 2: 
				list = DAO.getInstance().getSelect(); 
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
				
				
				list = DAO.getInstance().getIDU(sql);
				listPrn(list);
				break;
				
			case 3: 
				list = DAO.getInstance().getSelect();
				listPrn(list);
				DAO.getInstance().getSelect();
				System.out.print("삭제할 IDX: ");
				System.out.println();
				idx = sc.next();
				sql = "delete from members where idx = " + idx;
				
				list = DAO.getInstance().getIDU(sql);
				listPrn(list);
				break;
				
			case 4: 
				list = DAO.getInstance().getSelect(); 
				DAO.getInstance().getSelect();
				System.out.print("갱신할 IDX: ");
				idx = sc.next();
				System.out.print("갱신할 나이 : ");
				age = sc.next();
				
				sql = "UPDATE members\n" +
					  "SET m_age =" + age + "\n" + 
					  "where idx = " + idx;
				
				list = DAO.getInstance().getIDU(sql);
				listPrn(list);
				break;
			}
			
			System.out.println("수고 하셨습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
