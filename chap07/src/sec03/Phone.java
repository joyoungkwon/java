package sec03;

public abstract class Phone { // abstract - 추상 클래스 선언
	
	public String owenr;
	
	
	public Phone( String owenr) {
		this.owenr = owenr;
	}
	public void turnOn() {
		System.out.println("전원킴");
	}
	public void turnOff() {
		System.out.println("전원끔");
	}

}
