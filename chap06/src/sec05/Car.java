package sec05;

public class Car {
	String model;
	int speed;
	
	Car(){ // �⺻������ 
		
	}
		
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) { // ���ϰ� ����
		this.speed = speed;
	}
	void run() { // void ���ϰ� ����
		// 10���� 50���� �ݺ� �ؼ� 5�� �ӵ��� �����ϰ� ���
		for(int i = 10; i <=50; i+=10) {
			this.setSpeed(i);
			System.out.println("����ӵ���"+ this.speed);
		}
	}
	public static void main(String[]ags) {
		Car myCar = new Car("������"); // �ν���Ʈ �޼ҵ�
		myCar.run();
		// ���� ====static ����
		Car yourCar = new Car();
		yourCar.speed= 60;
		// �����޼ҵ� �� Ŭ����. ��� ���ٷ� ��� ����
		
	}
}
