package sec01;

public class ����� {

	public static void main(String[] args) {
		SupersoicAirplaneExample  sa = new SupersoicAirplaneExample();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersoicAirplaneExample.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersoicAirplaneExample.NORMAL;
		sa.fly();
	}

}
