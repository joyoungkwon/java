package sec01;

import java.util.*;

public class VectorExample1 {

	public static void main(String[] args) {

		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);
		boolean start = true;
		

		System.out.println("���� ������ �Է��ϼ��� -1 �� ������ ����ϴ�.");
		while (start) {
			int key = s.nextInt();
			if (key == -1) {
				System.out.println("�����մϴ�.");
				start = false;
			} else {
				list.add(key); // ���ö������ݺ�
			}
			
			int max = list.get(0);
			for (int i = 1; i < list.size(); i++) {

				// �Էµ� ����ū�� ����ϱ�.
				if (max<list.get(i)) {
					max = list.get(i);
				}
				
			}
			System.out.println("����ū��"+ max);
		}
	}

}
