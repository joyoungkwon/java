package src01;

import java.io.*;
import java.util.*;

public class PhoneBuffer {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:/Temp/phone.tex");
		// FileOutputStream ������Ʈ�� ������������ ������ �����Ѵ�.
		Writer w = new OutputStreamWriter(fos);
		// ������ , �۾���
		while (true) {
			System.out.println("��ȭ��ȣ�Է�");
			// ��ȭ��ȣ�� �Է� �޴� ��±���
			String phoneNm = s.nextLine();
			// line���� ���� ���� �б�.
			if (phoneNm.equals("�׸�"))
				break;
			{
				// if �����ڸ� ������ break �ɱ�
				w.write(phoneNm + "\n");
				// �ƴϸ� while �� ����.
			}
			w.flush();
			//��������
			w.close();

		}
		Reader reader = new FileReader("C:/Temp/phone.tex");
		// FileOutputStream �� ������ ������ reader�� �о��ֱ�
		// Writer �� �������б�
		BufferedReader br = new BufferedReader(reader);
		// ��������½�Ʈ�� buffer�� reader������.

		while (true) {
			// ��������
			String data = br.readLine();
			// wirter�� ���ڿ��� ���پ� readLine �޼ҵ�� �б�

			if (data == null)
				break;
			// ���ǹ�. data�� ���̾����� ����.
			System.out.println(data);
			//�׸������
		}
		br.close();
		//�ݱ�.

	}

}
