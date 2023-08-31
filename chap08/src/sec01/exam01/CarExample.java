package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Truck();

		car.speedUp(30);
		car.speedDown(300);

		// 만약 Car를 구현한 SportCar 클래스가 있다면
		// car = new SportCar();
		// Car 인터페이스하나로 두객체 접근 가능.
		car = new SportCar();
		car.speedUp(50);
		car.speedDown(20);
	}

}
