package sec01;

import java.util.ArrayList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime; //�ʱ�ð�
		long endTime; // �������ð�.
		
		startTime = System.nanoTime(); // ��ŸƮ �ð��� ���� �ð����� ����
		for(int i =0; i<10000; i++) { // 10000�� ���ư��� �ð�.
			list1.add(0,String.valueOf(i));// list �� ���� �游���.
		}
		endTime = System.nanoTime(); // end Ÿ�� ������ �ð�.
		System.out.println("�ɸ��ð�"+(endTime-startTime)+"ns");
		//end Ÿ�Կ��� startŸ�� �� ���� ���ð� ��

	}

}
