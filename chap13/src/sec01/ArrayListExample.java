package sec01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		
		list.add("Java");  // 0
		list.add("JDBC"); // 1
		list.add("Servlet/JSP"); // 2
		list.add(2,"Database"); //3
		list.add("iBATIS"); // 4
		// 2���� ���� database�� �߰��ϸ� �����ִ� Servlet �̹з��� 3���̉�
		// �ٷ� �ڷ� �и��°� Ư¡.
		int size = list.size();
		System.out.println("ArrayList �� list ��\n ����Ǿ��ִ�\n ��ü�� ����"+ size);
		
		String skill = list.get(2);
		System.out.println(skill);
		// list�� ����Ǿ� �ִ� 2��° ���� skill�� ������
		// ȣ��
		
		for(int i =0 ; i<list.size(); i++) {
			//�ٸ��ſ� �ٸ��� size.
			String str = list.get(i);
			// 	str�� list �� ��ü���� ArrayList �� �޼ҵ� get���� 
			// i��° �迭�� ����� ���� str�� ������
			
			System.out.println(i+":"+str);
		}
		list.remove(2); // 2��° �濡 �ִ� database���� ����.
		list.remove(2); // �����Ǹ� ���ʴ�� �ڿ��ִ� ���� ������ ����
		list.remove("iBATIS"); // ���� ������ ��������.
		// obj Ÿ�� ���� ���� ��ġ�ϴ� ���ڿ��̳� obj����
		
//		System.out.println(list.get(2));
//		// �����Ǽ� iBatis���.
	}

}
