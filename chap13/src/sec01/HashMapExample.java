package sec01;
import  java.util.*;

public class HashMapExample {


	public static void main(String[] args) {
		// �� �ȿ� ���׸� ��Ʈ�� Ű Integer key��
		// HasMap���� ������ map
		Map<String ,Integer> map = new HashMap<>();
		map.put("a", 75);
		map.put("b", 33); // �������
		map.put("c", 65);
		map.put("b", 85); // ����(Ű��) ������ ���� �����.
		
		System.out.println("�� ����\t"+ map.size());
		System.out.println("b��������\n"+map.get("b"));
		//�Ǹ��������� ���� ���� �� b�� ������ ���
		
		Set<String> keySet = map.keySet(); //���� ����Ǿ��ִ� Ű�� ��� �ҷ�����
		
		Iterator<String> keyiter = keySet.iterator(); // 
		// Iterator �ݺ��� <���׷��� Ÿ�� (Ű���� String)�̶� >
		while(keyiter.hasNext()) {
			String key  = keyiter.next();
			// �ݺ��ؼ� Ű�� ������
			Integer value = map.get(key);
			//�ݺ��ؼ� Ű�� ���� ���� ������
			System.out.println(key + " "+ value);
		}
		System.out.println();
		
		map.remove("b"); // (����Ű a,c)
		System.out.println("�Ѱ�����:\n"+map.size());
		
		System.out.println();
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryiter = entrySet.iterator();
		while(entryiter.hasNext()) {
			Map.Entry<String, Integer> entry = entryiter.next();
			String key = entry.getKey();
			// �ݺ��ؼ� Ű�� ������
			Integer value = entry.getValue();
			//�ݺ��ؼ� Ű�� ���� ���� ������
			System.out.println(key + " "+ value);
		
	}

}
}