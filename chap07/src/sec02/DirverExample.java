package sec02;

import java.sql.Driver;

public class DirverExample {

	public static void main(String[] args) {
		
		
		Dirver driver = new Dirver(); // dirver ��ü ���� 
		Bus bus = new Bus(); //Bus��ü ����
		Taxi taxi = new Taxi(); // taxi ��ü ����
		
		bus.run();
		
		//driver.dirver(); drive �޼ҵ�� �Ķ���� ���� �־���� �Ķ���� ���� Ŭ������.
		 driver.dirver(taxi); // �Ķ���� ���� Ŭ������ ���ϴ� �޼ҵ� ���� �޼ҵ�� ��
		 
		 // int x = 3
		 // int y = 5
		 // double t = x/y  �ȉ�
		 // double t = (double)x/y; �� ���� ��������ȯ ó�� �޼ҵ嵵 Ÿ�Ժ�ȯ�� �̷����
		 // Vehicle �� ��� ���� taxi �� bus Ŭ������ Vehicle vehicle = new Taxi();��
		 // Vehicle vehicle = Taxi �� ǥ�� �Ҽ� ����
		 
		 // ��� �Ǿ��ٰ� ��� ����� Ŭ���� ���� Ÿ�Ժ�ȯ ����
		 
	}

}
