package src01;
import java.io.*;

public class PrintStreamExample {

	public static void main(String[] args)  throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/temp/printstream.txt");
		// ���� ������������ ����.
		PrintStream ps = new PrintStream(fos);
		// PrintStrem�̶�� ���� ����� �޼ҵ� ����.(fos)
		
		ps.println("[�����ͺ�����Ʈ��]");
		// ����Ʈ ���� ����� �޼ҵ� ln ���� �ٹٲ�.
		ps.print("��ġ");
		//  ������ ������.
		ps.println("���");
		ps.println("���");
	}

}
