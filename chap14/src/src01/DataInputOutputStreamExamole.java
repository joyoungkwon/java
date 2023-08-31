package src01;
import java.io.*;
public class DataInputOutputStreamExamole {

	public static void main(String[] args) throws Exception{
		
		// File�� out , put �ް����� �ʱ�
		//out �� ���� put �� red�ؼ� �б�
		FileOutputStream  fos = new FileOutputStream("C:/Temp/primitive.db");
		// ���ϻ���.
		DataOutputStream dos = new DataOutputStream(fos);
		// ������Ʈ������.
		dos.writeUTF("ȫ�浿");
		// String Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		dos.writeDouble(95.5);
		// double Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		dos.writeInt(1);// int Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		
		dos.writeUTF("���ڹ�");
		// String Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		dos.writeDouble(95.2);
		// double Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		dos.writeInt(2);// int Ÿ���� �����ϴ� ������Ʈ�� dos�� �޼ҵ�
		
		// ���� write�� �� Ÿ�Կ� �������ϴ� Ÿ�Ը��Է�
		
		dos.flush();
		//��������
		dos.close();
		//�ݱ�
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		// OutputStream���θ��� ���� �Է¹ޱ�
		DataInputStream dis = new DataInputStream(fis);
		//dis �� , ���� ����� ���α׷� ���� �ϱ�.
		
		for(int i = 0 ; i<2 ; i++) {
			// �ι� �ݺ��ϴ� ����
			String name = dis.readUTF();
			// utf - String Ÿ��
			Double scroe =dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":"+scroe+":"+order);
			//�ι����
		}
		dis.close();
		//����� ��Ʈ�� �ݱ�
	}

}
