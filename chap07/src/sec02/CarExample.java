package sec02;

public class CarExample {

	public static void main(String[] args) {
		   Car car = new Car(); //car ��ü
		   //car ��ü�� Car Ŭ������ �ʵ� �޼ҵ� ��밡�� 
		   
		   for(int i =1; i<=5; i++) { // 1���� 5���� 5���ݺ�
			   int problemLocation =car.run();
			   switch(problemLocation) {
			   case 1:
				   System.out.println("�տ��� �ѱ� Ÿ�̾�� ��ü");
				   car.frontLeftTire = new HankookTire("�տ���", 15);
				   break;
			   case 2:
				   System.out.println("�տ����� ��ȣ Ÿ�̾�� ��ü");
				   car.frontRightTire = new KumhoTire("�տ�����", 13);
				   break;
			   case 3:
				   System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				   car.backRightTire = new HankookTire("�ڿ���", 14);
				   break;
			   case 4:
				   System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				   car.backRightTire = new KumhoTire("�ڿ�����", 17);
				   break;
			   }
			   System.out.println("----------------------------");
		   }
		   
	}

}
