package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream
  write(int b): int b => 아스키코드하나 쓸수 있다. 
  				한글자 쓰기, int b 대신 char 하나를 사용할 수 있다. 
  				영문자 대소문자, 숫자, 일부특수문자만 쓰기 가능
  				영어를 뺀 나머지 글자는 사용불가.
  write(byte[] b) : byte 배열사용을 할 수 없다.
  flush(): write후 반드시 사용, 빨리 저장할 수 있다.
  close(): open 된 스트림을 닫기(finally로 처리)
							
*/
public class Ex02 {
	public static void main(String[] args) throws IOException {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
						  + File.separator + "io01.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		
		try {
			 //이어쓰기
			 //fos = new FileOutputStream(file, true);
			 //덮어쓰기
			 fos = new FileOutputStream(file, false);
			 
			 fos.write(97);
			 fos.write(65);
			 fos.write(97);
			 // 숫자대신에 char사용
			 fos.write('j');
			 fos.write('a');
			 fos.write('v');
			 fos.write('a');
			 
			 //줄변경
			 fos.write(13);
			 fos.write(10);
			 
			 //배열을 이용
			 byte[] b = {'f', 'u', 'c', 'k', ' ', 'y', 'o', 'u', 13, 10};
			 fos.write(b);
	
			 //String을 이용
			 String str = "凸^_^凸.\n이제 그만.";
			 b = str.getBytes();
			 fos.write(b);
			 
			 fos.flush();
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
