package sec01;

import java.io.IOException;

public class keyboardToStringExample {

	public static void main(String[] args) throws IOException{ // ���� ó�� throws
		
		
		byte[] bytes = new byte[100]; // ���� ����Ʈ�� �����ϱ����� �迭
		System.out.println("�Է��ϼ���"); // ��±���
		int readByteNo = System.in.read(bytes); // �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
		
		
		String str = new String(bytes,0,readByteNo-2); // �迭�� ���ڿ��� ��ȯ. -2�� ���� ( enter ���� �ٰ� �Ѿ.)
		System.out.println(str);
		
	}

}
