package sec01.exam01;

public class Truck implements Car{
	
	int speed; // 매게변수 스피드 

	public void speedUp(int speed) {
		if(speed>MAX_SPEED) {
			this.speed = Car.MAX_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("현재트럭의속도는 "+ this.speed);
	}

	public void speedDown(int speed) {
		if(speed<MIN_SPEED) {
			this.speed = Car.MIN_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("현재트럭의속도는"+this.speed);
	}

}
