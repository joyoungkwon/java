package sec01;

public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company= company;
		this.os= os;
	}


	@Override
	public String toString() {
		return company + ","+os;
		// 오브젝트 오버라이드는 오브젝트 타입 변수가 옴(?)
		//모징..
	}
	
}
