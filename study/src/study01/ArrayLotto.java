package study01;

public class ArrayLotto {

	public static void main(String[] args) {
		
		int ball[]= new int [45]; // 45��ŭ ������ �迭 ����
		
		for(int i =0; i<ball.length; i++) { //�迭�� ���̸�ŭ 45 �� ���� ����
			ball[i] = i+1; // ball�� i���� �渶�� i + 1 �� ���� i�� 0�ϋ� 1
			// 1�϶� 2
			//3 �϶� 4
		}
		int tmp =0; // int Ÿ�� ���� ����� �ʱ�ȭ ���� ������ ����ϱ�����.
		int j =0;
		
		for (int i =0; i<6; i++) { // for �� 6�� �ݺ���. 
			j = (int)(Math.random()*45);// int j �� ���� ���� ����.
			tmp =ball[i]; // tmp�� ball �迭�� i���� ���� ����.
			ball[i]=ball[j]; // i ��° �濡 ������ ����.
			ball[j]=tmp; // j�� �ٽ� ������ ����.
		}
		for(int i =0; i<6; i++) {
			System.out.println("ball"+"["+i+"]"+"="+ball[i]);
		}
	}

}
