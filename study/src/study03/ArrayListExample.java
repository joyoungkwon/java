package study03;

import java.util.List;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// List ArrayList �����
		// Ŭ���� �̸��� ArrayList �� ����� �ȉ�.
		list.add("java");
		list.add("�迹��");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
