package sec04;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String password;
		while (true) {
			System.out.println("�������й�ȣ�� �Է��ϼ���");
			password = scanner.nextLine();
			if (password.equals("1234")) {
				System.out.println("ȯ���մϴ�.");
				break;
			}
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
	}
}
