package src01;

public class �ζ���÷ {

	public static void main(String[] args) {

		int num = 0; // ��ȣ����
		int[] lotto = new int[6];// �ζ� ��ȣ �迭����
		boolean[] cheak = new boolean[46]; // ��ȣ�� ������ �Ǵ��ϴ� �迭
		// 1~45 �ʿ������� �迭�� 0���� ���� �ϹǷ� �� 46�� ����
		for (int i = 0; i < lotto.length; i++) { // (2�� ��ȣ ���� ��)�� 6���� ���� ����
			num = (int) (Math.random() * 45) + 1; // ���� ���� ����

			if (cheak[num] == false) {
				// boolean �� �ʱⰪ�� false �� �Ǿ����� (0)
				// ���� ���� �ڸ��� �������� ������ �ش� ���� �����ϰ�
				// �ش� �ڸ� ���� true�� ������
				lotto[i] = num;
				cheak[num] = true;
			} else {
				i--;
			}
		}
		for (int j = 0; j < lotto.length; j++) {
			System.out.println(lotto[j] + " "); //�̾��� ���� ���
		}

	}

}
