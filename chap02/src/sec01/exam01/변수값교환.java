package sec01.exam01;

public class ��������ȯ {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x +",y:" + y);
		// ���� x �� ���� 3
		
		int temp = x; // ����x 3�� ���� temp�� ����
			
		x = y ;
		// x ������ �� ���� ���� ���Խ�Ŵ x= 5;
		y = temp;
		//���� y�� ���� temp���� ���Խ�Ŵ y = 3;
		//�ش籸���� ���� x �� y���� ���� ��ü�ϴ� ����
		System.out.println("x:"+ x +",y:"+ y);
	}

}
