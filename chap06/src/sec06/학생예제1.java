package sec06;

import java.util.Scanner;

public class �л�����1 {

	public static void main(String[] args) {
			
		Student student = new Student();
		Scanner s = new Scanner (System.in);
		boolean run = true;
		
		
		while(run) {
			boolean check = student.checkLogin(); // �α������˸޼ҵ�
			if(check) {
				System.out.println("�۾��� �������ּ���");
				System.out.println("1���� �α׾ƿ� 2���� ���� �Է�");
				int choice =s.nextInt();
				
				if(choice==1) { 
					run=false;
				}else if(choice==2) {
					student.inputExam(); // ���� �Է� �޼ҵ� �ۼ�
					run=false;
				}
	
			} else {
				System.out.println("�α��ν���");
			}
		}

	}
}
