package src01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception { //����ó�� ���
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		// ���ϻ���
		
		byte a =10;
		byte b =20;
		byte c =30;
		//byte������ abc�� ����
		os.write(a);
		os.write(b);
		os.write(c);
		// file�� ����.
		
		os.flush();
		// ��������
		os.close();
		//�ݱ�
	}

}
