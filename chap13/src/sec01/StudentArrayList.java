package sec01;
import java.util.*;
public class StudentArrayList {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		//Ŭ���� �װԸ����
		List <Student> list = new ArrayList<>();
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
			list.add(student[i]);
			//���������� LIST����
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println("-");
			Student stu = list.get(i); // Arraylist ��ü ������ ����.
			System.out.println("�̸�"+stu.getName());
			System.out.println("�а�"+stu.department);
			System.out.println("�й�"+stu.number);
			System.out.println("���"+stu.grade);
		}
		System.out.println("-");
		
		while(true) {
			System.out.println("�л��̸����Է�");
			String name = s.next();
			if(name.equals("�׸�")){
				System.out.println("����");
				break;
			}
			for(int i = 0; i<list.size();i++) {
				Student stu = list.get(i);
				stu.find_student(name);
			}
		}
	}

}
