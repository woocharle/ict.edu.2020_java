package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream
  write(int b): int b => �ƽ�Ű�ڵ��ϳ� ���� �ִ�. 
  				�ѱ��� ����, int b ��� char �ϳ��� ����� �� �ִ�. 
  				������ ��ҹ���, ����, �Ϻ�Ư�����ڸ� ���� ����
  				��� �� ������ ���ڴ� ���Ұ�.
  write(byte[] b) : byte �迭����� �� �� ����.
  flush(): write�� �ݵ�� ���, ���� ������ �� �ִ�.
  close(): open �� ��Ʈ���� �ݱ�(finally�� ó��)
							
*/
public class Ex02 {
	public static void main(String[] args) throws IOException {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
						  + File.separator + "io01.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		
		try {
			 //�̾��
			 //fos = new FileOutputStream(file, true);
			 //�����
			 fos = new FileOutputStream(file, false);
			 
			 fos.write(97);
			 fos.write(65);
			 fos.write(97);
			 // ���ڴ�ſ� char���
			 fos.write('j');
			 fos.write('a');
			 fos.write('v');
			 fos.write('a');
			 
			 //�ٺ���
			 fos.write(13);
			 fos.write(10);
			 
			 //�迭�� �̿�
			 byte[] b = {'f', 'u', 'c', 'k', ' ', 'y', 'o', 'u', 13, 10};
			 fos.write(b);
	
			 //String�� �̿�
			 String str = "��^_^��.\n���� �׸�.";
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
