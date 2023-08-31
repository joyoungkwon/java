package src01;
import java.io.*;
public class DataInputOutputStreamExamole {

	public static void main(String[] args) throws Exception{
		
		// File에 out , put 햇갈리지 않기
		//out 로 생성 put 로 red해서 읽기
		FileOutputStream  fos = new FileOutputStream("C:/Temp/primitive.db");
		// 파일생성.
		DataOutputStream dos = new DataOutputStream(fos);
		// 보조스트림연결.
		dos.writeUTF("홍길동");
		// String 타입을 저장하는 보조스트림 dos의 메소드
		dos.writeDouble(95.5);
		// double 타입을 저장하는 보조스트림 dos의 메소드
		dos.writeInt(1);// int 타입을 저장하는 보조스트림 dos의 메소드
		
		dos.writeUTF("김자바");
		// String 타입을 저장하는 보조스트림 dos의 메소드
		dos.writeDouble(95.2);
		// double 타입을 저장하는 보조스트림 dos의 메소드
		dos.writeInt(2);// int 타입을 저장하는 보조스트림 dos의 메소드
		
		// 쓸때 write의 뒤 타입에 쓰고자하는 타입명입력
		
		dos.flush();
		//내보내기
		dos.close();
		//닫기
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		// OutputStream으로만든 파일 입력받기
		DataInputStream dis = new DataInputStream(fis);
		//dis 에 , 보조 입출력 프로그램 설정 하기.
		
		for(int i = 0 ; i<2 ; i++) {
			// 두번 반복하는 포문
			String name = dis.readUTF();
			// utf - String 타입
			Double scroe =dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":"+scroe+":"+order);
			//두번출력
		}
		dis.close();
		//입출력 스트림 닫기
	}

}
