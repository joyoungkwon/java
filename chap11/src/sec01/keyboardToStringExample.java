package sec01;

import java.io.IOException;

public class keyboardToStringExample {

	public static void main(String[] args) throws IOException{ // 예외 처리 throws
		
		
		byte[] bytes = new byte[100]; // 읽은 바이트를 저장하기위한 배열
		System.out.println("입력하세요"); // 출력구문
		int readByteNo = System.in.read(bytes); // 배열의 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		
		String str = new String(bytes,0,readByteNo-2); // 배열을 문자열로 변환. -2인 이유 ( enter 값과 줄값 넘어감.)
		System.out.println(str);
		
	}

}
