package sec01;

public class ExitExample {

	public static void main(String[] args) {
		// 1���� 100���� ¦���� ����ϵ�, ���� ���ڰ� 50�� ������ ���� �ض�
		// ���� ���ٿ� �ް������ʱ�.
		// �Ф� ���ߴµ� ��¥�� ���� �ް����� ���ߴ�..
		// if ���� �ް������ʱ�
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println("����");
				System.exit(0);
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
