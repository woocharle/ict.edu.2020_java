package com.ict.edu01;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathName1 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test.txt";
		File file = new File(pathName1);
		try {
			boolean res = file.createNewFile();
			
			if(res) {
				System.out.println("파일 생성 성공");
			}
			else {
				System.out.println("파일 생성 실패");
			}
			
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			System.out.println("파일경로가 틀렸습니다.");
		}
		
		System.out.println();
		System.out.println("폴더 만들기");
		
		String pathName2 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test";
		File file2 = new File(pathName2);
		
		boolean res2 = file2.mkdir();
		if (res2) {
			System.out.println("폴더 생성 성공");
		} 
		else {
			// 경로가 틀리거나 같은 디렉토리가 있으면, 실패.
			System.out.println("폴더 생성 실패");
		}
		
		System.out.println();
		System.out.println("삭제");
		
		
		String pathName3 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test.txt";
		File file3 = new File(pathName3);
	
		boolean res3 = file3.delete();
		if (res3) {
			System.out.println("파일 삭제 성공");
		} 
		else {
			// 경로가 틀리거나 같은 디렉토리가 있으면, 실패.
			System.out.println("파일 삭제 실패");
		}
			
		String pathName4 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test";
		File file4 = new File(pathName4);
	
		boolean res4 = file4.delete();
		if (res4) {
			System.out.println("폴더 삭제 성공");
		} 
		else {
			// 경로가 틀리거나 같은 디렉토리가 있으면, 실패.
			System.out.println("폴더 삭제 실패");
		}
		
		
	}
}
