package sec02;

public class Car {
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("�޿���",3);
	Tire backRightTire = new Tire("�޿�����",4);
	
	
	int run() {
		System.out.println("�ڵ����޸�");
		
		if(frontLeftTire.roll()==false) {
			stop(); 
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop(); 
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop(); 
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop(); 
			return 4;
		}
		
		
		return 0;	
	
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�");
	}
}
