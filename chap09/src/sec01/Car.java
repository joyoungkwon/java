package sec01;

public class Car {
	String company;//����ȸ��
	int speed; // �ӵ�
	int cost;  // ����
	static String color;//����
	
	// default ������.
	Car(){
		System.out.println("Car ȣ��");
	}
	
	// ���ϰ��� ���� void �޼���
	void speedUp(int speed) {
		this.speed += speed;
		System.out.println(speed);
	}
	
	void stop() {
		System.out.println("Car ����");
	}
	
	static void stop2() {
		System.out.println("Car ����");
	}

	
	
	// Car Ŭ���� �ȿ��� OldCar Ŭ���� ����.
	class OldCar{ //��ø Ŭ���� (�ν��Ͻ� ��� Ŭ����)
		int speed;
		int cost;
		
		
		OldCar(){
			System.out.println("OldCar ȣ��");
		}
		
		
		void speedUp(int speed) {
			this.speed += speed;
		}
		
		void carCall() {
			// �ν��Ͻ� �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������.
			company ="����";
			stop();
		}
		
	}
	
	// CarŬ���� �ȿ��� Truck �޼ҵ� ����� �ʵ尪 speed cost , ������ - default ������. ��� ���� �޼ҵ� speedUp
	static class Truck{
		int speed;
		int cost;
		
		Truck(){
			System.out.println("Truck ȣ��");
		}
		
		void speedUp(int speed) {
			this.speed += speed;
		}
		void speedDown(int speed) {
			this.speed -= speed;
		}
		
		void carCall() {
			// �ν��Ͻ� �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������.
			//company ="����";
			//stop();
			color="����";
			stop2();
		}
		
	}
}
