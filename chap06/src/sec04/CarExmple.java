package sec04;

public class CarExmple {

	public static void main(String[] args) {
		Car car = new Car();
		car.powerOn();
		int result1 = car.speedUp(30);
		System.out.println("현재속도는 "+result1+"입니다.");
		int result2 = car.speedUp(20);
		System.out.println("현재속도는 "+result2+"입니다.");
		int result3 = car.speedDown(70);
		System.out.println("현재속도는 "+result3+"입니다.");
		int result4 = car.breakZero(0);
		System.out.println("현재속도는 "+result4+"입니다.");
		car.powerOff();
	}

}
