package study02;

public class For3 {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) { // �ٹٲ� for ����� �������� i �� 0�϶�
//			for (int j = 4; j > i; j--) { // 1�࿡�� ������ �װԷ� ���� �ϰ� �׵ڷ� �پ���
//				// ���� ����ϴ� j �� ���� �� j�� i���� ������ ���� ������ ��� �ϰ�, i�� ������ ���ߴ� for
//				System.out.print("s"); // ���� ���
//				// 2������ ��.
//			}
//			for (int c = 0; c <= i; c++) { // ù�� ° �����ȿ� �ִ� ����. ���� i �� 0
//				// ���ο� c ���� ����� �ʱ�ȭ 0, i�� ���� �� �� �ϳ� ����.
//				System.out.print("*"); 
//			}
//			System.out.println();
//		}

		
		for(int i =0 ; i<5; i++) {
			for(int j =4 ; j>i; j--) {
				System.out.print(" ");
			}
			for(int c = 0; c<=i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
