package sec03;

public abstract class Animal {
	
	
	public String Kind; // 동물종류
	
	
	// 리턴 x 메소드
	public void breathe() {
		System.out.println("숨을쉽니다");
	}
	public abstract void sound(); // 추상 메소드
}
