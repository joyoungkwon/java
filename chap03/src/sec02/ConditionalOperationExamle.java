package sec02;

import java.util.Scanner;

public class ConditionalOperationExamle {

	public static void main(String[] args) {
		int score =85;
		char grade =(score>90)? 'A':((score>80)?'B':'C');
		System.out.println(score +"����"+grade+"����Դϴ�");
		//����� ���� �Է�
		// ������ 90�� �̻��̸� "��" 80 �� �̻��̸� "��" �������� "��"
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a=s.nextInt();
		char grade2=(a>=90)?'��':((a>=80)?'��':'��');
		System.out.println(grade2);
		

	}

}
