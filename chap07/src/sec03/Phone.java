package sec03;

public abstract class Phone { // abstract - �߻� Ŭ���� ����
	
	public String owenr;
	
	
	public Phone( String owenr) {
		this.owenr = owenr;
	}
	public void turnOn() {
		System.out.println("����Ŵ");
	}
	public void turnOff() {
		System.out.println("������");
	}

}
