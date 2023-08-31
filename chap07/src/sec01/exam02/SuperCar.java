package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed; // 속도
	String engine; // 엔진


	public SuperCar(String model, String company, int maxSpeed, String engine) {
		super(model, company);
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}

}
