package com.ict.edu02;

/*
   코드 변경 수정...
   Stream(스트림)
   	- 데이터를 목적지까지 입력, 출력하기 위한 방법
   	- 입력스트림: 스트림에서 데이터를 읽는 경우
   	- 출력스트림: 스트림에서 데이터를 쓰는 경우
   	
   스트림의 종류
    1) byte Stream
       - 모두 처리를 1byte씩처리
       - 대상: 1byte로 이뤄진 모든 파일(영상, 소리, 사진 등 모든 파일, 영문자 포함.)
       - 최상위 Stream: InputStream, OutputStream
       
       - Ex02: FileOutputStream
	         write(int b): int b => 아스키코드하나 쓸수 있다. 
	  				한글자 쓰기, int b 대신 char 하나를 사용할 수 있다. 
	  				영문자 대소문자, 숫자, 일부특수문자만 쓰기 가능
	  				영어를 뺀 나머지 글자는 사용불가.
			 write(byte[] b) : byte 배열사용을 할 수 없다.
			 flush(): write후 반드시 사용, 빨리 저장할 수 있다.
			 close(): open 된 스트림을 닫기(finally로 처리)
       - Ex03: FileInputStream
       		 read(): int(아스키코드) => char(형변환) , read(byte[] b)
       		 
       
       - Ex07: Buffered와 같이써서 속도 향상 시키는 법
       
       
       - DataInputStream과 DataOutputSteam  (com.ict.edu3)
 		 기본자료형을 주고 받을 때 사용. 반드시 입력순서와 출력 순서를 맞춰야 한다.
 		 기본 생성자가 없어서 BufferedInputStream과 BufferedOutputStream처럼
 	  	 혼자서 사용못하고 FileInputStream과 FileOutputStream 사용.
 	
	   - PrintStream은 모든 자료형을 출력할 수 있다.
         보통은 화면이나 파일에 출력한다. (출력전용)
       
    2) character Stream (com.ict.edu4)
       - 사람 중심
       - 모든 처리를 2byte씩 처리
       - 대상: 세계의 모든 언어로 구성된 문서 파일을 입출력할 때 사용
       - 최상위 스트림: Reader(입력), Writer(출력)
       - FileOutputStream : 1byte처리, write(아스키코드), write(byte[] b) 
       - FileWriter       : 2byte처리, write(유니코드), *처리 속도 향상을 위해서 BufferedWrite도 함께 사용. 	
       - FileInputSteam   : byte Stream 참조
       - FileReader       : read(), int(유니코드) => char(형변환) , read(byte[] b)		
       - BufferedReader: 속도향상, readLine();	
       - 아스키코드, 유니코드 : int.
       - PrintWriter : Bytestream, charcter Stream 모두 인자로 받을 수 있다.
       
    3) byte-char Stream (com.ict.edu5)
  	   - 기계를 통해 입/출력한 정보를 사람이 사용할 수 있도록 입/출력
  	   - 해당 클래스: InputStreamReader(입력), OutputStreamWriter(출력)
  	   	 InputStreamReader : InputStream => Reader (바이트스트림 => 문자 스트림)
  	   	 InputStream => InputStreamReader => Reader => BufferedReader
  	   		
  	   	 OutputStreamWriter : OutputStream => Writer (byteStream = > chracter Stream)
  	   	 OutputStream => OutputSteamWriter => Writer => BufferedWriter
  	   
    4) Object Stream (com.ict.edu6 ~ 9)
       - 객체를 직렬화한 후 객체 단위로 입/출력
       - 해당 클래스:
         ObjectInputStream(readObject() :객체 직렬화), ObjectOutputStream(writeObject() :객체 역직렬화)
       - Serializable: 인터페이스로 직렬화할 수 있다.
         * 직렬화 제외 시키는 방법: 변수 앞에 transient 예약어를 사용.
	   - Serializable 외 방법: Externalizable
	     writeExternal() => 직렬화 , readExternal() => 역직렬
	     transient으로 제외할 수 없다.
	     writeExternal과 readExternal() 안에 있는 멤버를 동시에 제외시킨다.

 */
public class Ex01_Intro {

}
