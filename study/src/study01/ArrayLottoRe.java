package study01;

public class ArrayLottoRe {

	public static void main(String[] args) {
		int lotto [ ] = new int [6]; // int Ÿ�� �迭 �����.
		
		for(int i = 0 ; i <lotto.length ;i++) { //for �迭�� ��� ���� 
			lotto[i] = (int)(Math.random()*45)+1; // ���� �Լ� �� lotto �迭 i ���� �����Ű��,
			for(int j = 0; j<i; j++) { // ���� �������� j�� i ���� ���� ���ߴ� ������ �����Ѵ�.
				if(lotto[i]== lotto[j]) { // if looto [i] �� lotto[j] 
					i--; // i-- ? �̰� ���������� �����.
					break; // ��ž.
				}
			}
		}
		System.out.print("�ζ� ��� ��ȣ��"+" "); 
		for(int i =0; i<lotto.length; i++) { 
			System.out.print(lotto[i]+" ");
		}
	}
}