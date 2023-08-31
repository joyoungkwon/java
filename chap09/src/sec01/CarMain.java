package sec01;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();// Car 생성자
		Car.OldCar oldcar = car.new OldCar();// 상위 생성자, 하위 생성자. A.B b = aa.new B
		Car.Truck truck = new Car.Truck(); // 정적필드는 A.B b = new A.B();
		// 인스턴스 - 스태틱 
		car.cost=3000;
		car.speedUp(50);
		
		oldcar.cost=5000;
		oldcar.speedUp(30);
		
		truck.cost=6000;
		truck.speedUp(70);
		
		System.out.println(car.cost);
		System.out.println(car.speed);
		
		
		System.out.println(oldcar.cost);
		System.out.println(oldcar.speed);
		
		System.out.println(truck.cost);
		System.out.println(truck.speed);
		
		speed();
	}
	
	static void speed() {
		
	}

}
