package study01;

public class Array {

	public static void main(String[] args) {
		int score [ ] = new int [5]; // �迭�� ����� ������ ���ÿ���
		// integer Ÿ���� score �̸��� ���� �迭 �� �����Ű��,
		// integer Ÿ���� ���ο� �迭�� ���� �ټ����� ������.
		
		score[3] = 100;
		// 5���� ���� �� ���ھ� ���� index��ȣ 3����,
		// 100 �̶�� integer ���� ��. (���� �������� ���� Ÿ���� ������ ���� ��Ŵ)
		// �ȱ׷��� ������.
		
		// ��±���
		System.out.println("int score[0]"+score[0]);
		System.out.println("int score[1]"+score[1]);
		System.out.println("int score[2]"+score[2]);
		System.out.println("int score[3]"+score[3]);
		System.out.println("int score[4]"+score[4]);
		
//		integer Ÿ���� a ������ integer �� ���� ��Ű�� ���� �� score 3���� �氪�� ���� ��Ŵ
		// score 3�� �� ���� 100;
		int a = score[3];
		System.out.println("a =" + a);
	// �ñ��� �׷��� integer a = ��ȿ� score index 3���� ���� ��Ű��, ������ 3���� �ִ� 
		// 100�� ���� �������?
		System.out.println(score[3]);
		// ���� �ִ°� �˰ԉ�.
		
		
		
	}

}
