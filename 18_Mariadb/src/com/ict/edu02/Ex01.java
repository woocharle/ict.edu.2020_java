package com.ict.edu02;

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
		System.out.println("5. 로그인");
		System.out.print(">>>> ");
		int su = sc.nextInt();
		int num = 0;
		int cnt;
		
		try {
			String sql;
			
			switch (su) {
				case 1: 
					list = DAO.getInstance().getSelect(); 
					listPrn(list);

					
				break;
				case 2: 
					list = DAO.getInstance().getSelect(); 
					listPrn(list);
					
					for(VO k : list) {
						num++;
						if(num != Integer.parseInt(k.getIdx())) {
							break;
						}
	
					}


					sql = "insert into member01 \n"+
						  "values(?, ?, ?, ?, ?, null)";

					list = DAO.getInstance().getIDU(2 ,sql, num);
					listPrn(list);
				break;
				
				case 3: 
					list = DAO.getInstance().getSelect();
					listPrn(list);
					DAO.getInstance().getSelect();
	
					sql = "delete from member01 where idx = ?";
					
					list = DAO.getInstance().getIDU(3, sql, 0);
					listPrn(list);
				break;
			
			
				case 4: 
					list = DAO.getInstance().getSelect(); 
					listPrn(list);
					DAO.getInstance().getSelect();
	
					sql = "UPDATE member01\n" +
						  "SET age = ?\n" + 
						  "where idx = ?";
					
					list = DAO.getInstance().getIDU(4, sql, 0);
					listPrn(list);
				break;
				
				case 5:
					sql = "SELECT * from member01 \n" +
						  "where id = ? and pw = ?";
					
					list = DAO.getInstance().getLogin(sql);
					
					if(list.size()==1) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					
				break;
				
				
			}
			
			System.out.println("수고 하셨습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
