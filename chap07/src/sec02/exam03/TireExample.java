package sec02.exam03;

public class TireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); // ����� Ÿ�̾��� ��ü ����
		snowTire.run(); // ����� Ÿ�̾� �޼ҵ� ȣ��
		snowTire.stop(); // ����� Ÿ�̾� �޼ҵ� ȣ��
		
		Tire tire = snowTire; // ���� ��ü�� �ڽ� ��ü Ÿ�Ժ�ȯ
		 // �θ� �� Ŭ������ ����, �������̵� �� �ڽ��� �޼ҵ带 ������ ��
		
		System.out.println(tire.company); // ����ȸ��. �Ѵ� ��ȣ Ÿ�̾� (�ʱⰪ ��ȣŸ�̾�)
		System.out.println(snowTire.company);// ����ȸ��. �Ѵ� ��ȣ Ÿ�̾� (�ʱⰪ ��ȣŸ�̾�)
		System.out.println(snowTire.Design); // ����� Ÿ�̾��� �ʵ尪 ��� (����� Ÿ�̾�)
		System.out.println(tire.Design); // �θ�� ���ڿ��� �⺻���� null ���
		
		tire.run(); // Ŭ������ Ÿ�Ժ�ȯ ���� ����� Ÿ�̾� �������̵� �� ����
		snowTire.run(); // �������̵� �� �޼ҵ� ���
		
		
		snowTire.stop(); // ����� Ÿ�̾� �������̵� �� �� ���.
//		tire.stop(); //  �̰Ŵ� ȣ�� �Ұ��� �θ�� �ڽ� ȣ�� �Ұ���
		tire.stop2(); // �޼ҵ� �̸��� ������ ��� ���� �϶� �ڵ����� ���� ���̵��� �Ǵ°���
		// �ް����� �ʱ� ���ؼ� @Override ��� �ּ� �� �� ����
										
		
	}

}
