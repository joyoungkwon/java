package src01;
import java.io.*;

public class PrintStreamExample {

	public static void main(String[] args)  throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/temp/printstream.txt");
		// 파일 무조건적으로 생성.
		PrintStream ps = new PrintStream(fos);
		// PrintStrem이라는 보조 입출력 메소드 연결.(fos)
		
		ps.println("[프린터보조스트림]");
		// 프린트 보조 입출력 메소드 ln 으로 줄바꿈.
		ps.print("마치");
		//  옆으로 나오게.
		ps.println("출력");
		ps.println("출력");
	}

}
