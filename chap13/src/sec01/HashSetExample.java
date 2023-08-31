package sec01;
import  java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("�ڹ�"); // x. add ��
		set.add("���̵��");
		set.add("����");
		set.add("���̹�Ƽ��");
		set.add("���̵��"); // ArrayList �� ���� Object �� �ߺ� �ؼ� ���������
		// HashSet�� �ߺ� �����̾ȉ�
		
		Iterator<String> iter = set.iterator(); // HashSat ���� �ݺ���.
		// �̿��ҋ� while �� 
		while(iter.hasNext()) { // while ���� iter. hasNext()
			// hasNext() HashSet�� �޼ҵ�.
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println();
		
		
		iter = set.iterator();
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println();
		
		set.clear(); // set �� ����Ǿ��ִ� ��� �����͸� �����ϴ� �޼���
		if(set.isEmpty()) { // isEmpty -�÷����� ����ִ��� Ȯ���ϴ� �޼���
			System.out.println("�������.");
		}
	}
}
