package sec01;
import java.util.*;
public class StudentArrayList2 {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		//Ŭ���� �װԸ����
		Map<String, Student>map = new HashMap<>();
		// ���׸� studentŸ�� ���ιޱ�
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸� �а� �й� �����Է�");
		
		for(int i =0; i<student.length; i++) {
			System.out.println("����");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i]= new Student(name,department,number,grade);
			// �Ķ���Ͱ����ִ� ������ Ŭ���� i���� �渶�� ȣ�� �� ����
			map.put(name, student[i]);
			//���������� LIST����
		}
		Set<String> keySet = map.keySet();// Ű�ҷ�����
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Student value = map.get(key);
			System.out.println("---------------");
			System.out.println(value.name);
			System.out.println(value.department);
			System.out.println(value.number);
			System.out.println(value.grade);
		}
		System.out.println("---------------");
		
		while(true) {
			System.out.println("�л��̸����Է�");
			String name = s.next();
			if(name.equals("�׸�")){
				System.out.println("����");
				break;
			}
			for(int i = 0; i<map.size();i++) {
				Student stu = map.get(name);
				stu.find_student(name);
			}
		}
	}

}
