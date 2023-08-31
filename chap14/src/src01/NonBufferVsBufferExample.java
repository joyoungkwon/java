package src01;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		// 파일경로 그림파일경로 
		String targetFilePath1 = "C:/Temp/targetFile.jpg";
		// 끌어옴

		FileInputStream fis = new FileInputStream(originalFilePath1);
		//불러오는거
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("orginalFile2.jpg").getPath();
		// String 타입으로 NonBufferVsBufferExample.class.의 getResource의 메소드로 파일의 경로를 저장
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		//	String 문자열 변수에 c드라이브 템프에 타켓 파일 2jpg를 저장.
		
		FileInputStream fis2 = new FileInputStream(originalFilePath1);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath1);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		//copy메소드호출
		System.out.println("버퍼를 사용하지않았을때 :\t" + nonBufferTime + "ns");
		long BufferTime = copy(fis2, fos2);
		//copy메소드호출
		System.out.println("버퍼를 사용하지않았을때 :\t" + BufferTime + "ns");

		fis.close();
		fos.close();
		// 첫번쨰 버퍼 안썻을떄 닫기
		fis2.close();
		fos2.close();
		// 두번째 버퍼 썻을떄 메소드 닫기.

	}

	static int data = -1;
	//데이터의 마지막값.

	public static long copy(InputStream is, OutputStream os) throws Exception {
		//copy메소드
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}

}
