package sec01;

import java.util.HashMap;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // �ؽ��� ��ü ����.
		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {

			for (int i = 0; i < 3; i++) {
				System.out.println("�����Է�");
				map.put(s.next(), s.nextInt());
			}
			System.out.println("ã���� �ϴ� ����˻�");
			String country = s.next();
			if (country.equals("�׸�")) {
				System.out.println("����");
				start = false;
			}

			if (map.containsKey(country)) {
				System.out.println("�ش糪�� �α�����" + map.get(country));
			} else {
				System.out.println("�������");
			}

		}

	}

}
