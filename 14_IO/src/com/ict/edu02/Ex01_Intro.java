package com.ict.edu02;

/*
   Stream(��Ʈ��)
   	- �����͸� ���������� �Է�, ����ϱ� ���� ���
   	- �Է½�Ʈ��: ��Ʈ������ �����͸� �д� ���
   	- ��½�Ʈ��: ��Ʈ������ �����͸� ���� ���
   	
   ��Ʈ���� ����
    1) byte Stream
       - ��� ó���� 1byte��ó��
       - ���: 1byte�� �̷��� ��� ����(����, �Ҹ�, ���� �� ��� ����, ������ ����.)
       - �ֻ��� Stream: InputStream, OutputStream
       
       - Ex02: FileOutputStream
	         write(int b): int b => �ƽ�Ű�ڵ��ϳ� ���� �ִ�. 
	  				�ѱ��� ����, int b ��� char �ϳ��� ����� �� �ִ�. 
	  				������ ��ҹ���, ����, �Ϻ�Ư�����ڸ� ���� ����
	  				��� �� ������ ���ڴ� ���Ұ�.
			 write(byte[] b) : byte �迭����� �� �� ����.
			 flush(): write�� �ݵ�� ���, ���� ������ �� �ִ�.
			 close(): open �� ��Ʈ���� �ݱ�(finally�� ó��)
       - Ex03: FileInputStream
       		 read(): int(�ƽ�Ű�ڵ�) => char(����ȯ) , read(byte[] b)
       		 
       
       - Ex07: Buffered�� ���̽Ἥ �ӵ� ��� ��Ű�� ��
       
       
       - DataInputStream�� DataOutputSteam  (com.ict.edu3)
 		 �⺻�ڷ����� �ְ� ���� �� ���. �ݵ�� �Է¼����� ��� ������ ����� �Ѵ�.
 		 �⺻ �����ڰ� ��� BufferedInputStream�� BufferedOutputStreamó��
 	  	 ȥ�ڼ� �����ϰ� FileInputStream�� FileOutputStream ���.
 	
	   - PrintStream�� ��� �ڷ����� ����� �� �ִ�.
         ������ ȭ���̳� ���Ͽ� ����Ѵ�. (�������)
       
    2) character Stream (com.ict.edu4)
       - ��� �߽�
       - ��� ó���� 2byte�� ó��
       - ���: ������ ��� ���� ������ ���� ������ ������� �� ���
       - �ֻ��� ��Ʈ��: Reader(�Է�), Writer(���)
       - FileOutputStream : 1byteó��, write(�ƽ�Ű�ڵ�), write(byte[] b) 
       - FileWriter       : 2byteó��, write(�����ڵ�), *ó�� �ӵ� ����� ���ؼ� BufferedWrite�� �Բ� ���. 	
       - FileInputSteam   : byte Stream ����
       - FileReader       : read(), int(�����ڵ�) => char(����ȯ) , read(byte[] b)		
       - BufferedReader: �ӵ����, readLine();	
       - �ƽ�Ű�ڵ�, �����ڵ� : int.
       - PrintWriter : Bytestream, charcter Stream ��� ���ڷ� ���� �� �ִ�.
       
    3) byte-char Stream (com.ict.edu5)
  	   - ��踦 ���� ��/����� ������ ����� ����� �� �ֵ��� ��/���
  	   - �ش� Ŭ����: InputStreamReader(�Է�), OutputStreamWriter(���)
  	   	 InputStreamReader : InputStream => Reader (����Ʈ��Ʈ�� => ���� ��Ʈ��)
  	   	 InputStream => InputStreamReader => Reader => BufferedReader
  	   		
  	   	 OutputStreamWriter : OutputStream => Writer (byteStream = > chracter Stream)
  	   	 OutputStream => OutputSteamWriter => Writer => BufferedWriter
  	   
    4) Object Stream (com.ict.edu6 ~ 9)
       - ��ü�� ����ȭ�� �� ��ü ������ ��/���
       - �ش� Ŭ����:
         ObjectInputStream(readObject() :��ü ����ȭ), ObjectOutputStream(writeObject() :��ü ������ȭ)
       - Serializable: �������̽��� ����ȭ�� �� �ִ�.
         * ����ȭ ���� ��Ű�� ���: ���� �տ� transient ���� ���.
	   - Serializable �� ���: Externalizable
	     writeExternal() => ����ȭ , readExternal() => ������
	     transient���� ������ �� ����.
	     writeExternal�� readExternal() �ȿ� �ִ� ����� ���ÿ� ���ܽ�Ų��.

 */
public class Ex01_Intro {

}
