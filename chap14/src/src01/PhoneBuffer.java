package src01;

import java.io.*;
import java.util.*;

public class PhoneBuffer {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:/Temp/phone.tex");
		// FileOutputStream 오브젝트는 무조건적으로 파일을 생성한다.
		Writer w = new OutputStreamWriter(fos);
		// 라이터 , 글쓰기
		while (true) {
			System.out.println("전화번호입력");
			// 전화번호를 입력 받는 출력구문
			String phoneNm = s.nextLine();
			// line으로 띄어쓰기 까지 읽기.
			if (phoneNm.equals("그만"))
				break;
			{
				// if 한줄자리 가독성 break 걸기
				w.write(phoneNm + "\n");
				// 아니면 while 문 실행.
			}
			w.flush();
			//내보내기
			w.close();

		}
		Reader reader = new FileReader("C:/Temp/phone.tex");
		// FileOutputStream 로 생성한 파일을 reader로 읽어주기
		// Writer 로 쓴문자읽기
		BufferedReader br = new BufferedReader(reader);
		// 보조입출력스트림 buffer의 reader를연결.

		while (true) {
			// 무한으로
			String data = br.readLine();
			// wirter로 문자열을 한줄씩 readLine 메소드로 읽기

			if (data == null)
				break;
			// 조건문. data의 값이없으면 멈춤.
			System.out.println(data);
			//그리고출력
		}
		br.close();
		//닫기.

	}

}
