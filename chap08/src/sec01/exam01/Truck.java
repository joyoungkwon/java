package sec01.exam01;

public class Truck implements Car{
	
	int speed; // �ŰԺ��� ���ǵ� 

	public void speedUp(int speed) {
		if(speed>MAX_SPEED) {
			this.speed = Car.MAX_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("����Ʈ���Ǽӵ��� "+ this.speed);
	}

	public void speedDown(int speed) {
		if(speed<MIN_SPEED) {
			this.speed = Car.MIN_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("����Ʈ���Ǽӵ���"+this.speed);
	}

}
