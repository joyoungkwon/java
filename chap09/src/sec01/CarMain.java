package sec01;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();// Car ������
		Car.OldCar oldcar = car.new OldCar();// ���� ������, ���� ������. A.B b = aa.new B
		Car.Truck truck = new Car.Truck(); // �����ʵ�� A.B b = new A.B();
		// �ν��Ͻ� - ����ƽ 
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
