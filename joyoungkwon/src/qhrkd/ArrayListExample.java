package qhrkd;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		List <String>list = new ArrayList<>();
		//���׷� <> ����Ÿ�Ը���.
		//�⺻������ ����ϴ� �迭��, ���ڱ����� ���� �����Ǿ��ְ� �⺻������ �迭�� ���̸�
		//�����ϰ� �߰��ϴ� ���̶� �������� ����.
		// �̷��� ���� �����ϰ��� List �������̽��� ������ ArrayList �� ����ϴ°�
		//�ٸ����� �߰��Ҷ����� ���μ��������ʾƵ� �ڵ����� ���̰��� �߰��ǰų� �þ
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//List�� ������ ArrayList�� �߰� �ϴ� �޼ҵ�
		//add
		
		list.remove(1); //intŸ�� �޼ҵ� �����
		list.remove("e"); // obj ������Ʈ ��ü���ؼ� ���� obj����
		//list.clear - ArrayList �� ��� ������ ����.
		
		
		for(int i = 0; i<list.size(); i++) { // �⺻ Ÿ���� �迭�� �ٸ��� leght����
			// ArrayList�� �迭�� size�� �Էµ� �迭�� ���̰��� ����
			String str = list.get(i);
			
			//get���κҷ��� Ư�������� ����
			System.out.println(str);
		}
		
		System.out.println();
		
		for(String str : list) { //��������. 
			//��������ϴ°�ü ,����� 
			System.out.println(str);
		}
	}

}
