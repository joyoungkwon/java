package study02;

public class For2 {

	public static void main(String[] args) {
		for(int i =0; i<5; i++) { // i ��  5 ���� �ݺ� �ϴ� for �� ���� �� ���° ���� ��ڴ�. (����)
			for(int j = 5; j> i ;j--) {// (�� �� �ȿ� ���� ��� ���� ��, ��� ������ 
				// j �� ù�ٿ� 5��, �� ����, 
				System.out.print("*"); 
			}
			System.out.println(" ");
		}

	}

}
