package study01;

public class Array3 {

	public static void main(String[] args) {
		int score [] = {79,88,91,33,55,100,101}; // �迭�� ���� �� ���̵� ���� 
		int max =score[0]; // int max �� score 0 ��° ���� ����  79 �� ����
		int min =score[0]; // �� ���� ����
		
		for(int i = 1; i<score.length ; i++) { //for ���ε� i �� �迭�� �ε��� ��ŭ ���� �ݺ���
			if(score[i]>max) { // score �迭�� i ���� �溸�� ��ó���� 0��° ������ 79 ���� ������ max��
				// ������ score i ��° ���� ���� ����
				max= score[i];
			}else if(score[i]<min) { //���������� ���� �������ϰ�, �Ʒ��� �����ö� scroe i ��° �溸�� ��ó����
				// score �� 0�� ° �溸�� min ���� �� ũ�� �����Ű�� ���� �׷��� ������ �����
				min = score[i];
			}
		}
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}

}
