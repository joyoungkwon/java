package src01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception { //예외처리 기분
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		// 파일생성
		
		byte a =10;
		byte b =20;
		byte c =30;
		//byte정도에 abc를 지정
		os.write(a);
		os.write(b);
		os.write(c);
		// file에 저장.
		
		os.flush();
		// 내보내기
		os.close();
		//닫기
	}

}
