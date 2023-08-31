package sec01;

public class ClassExample {

	public static void main(String[] args) {

		Key key = new Key(50); // 객체 생성
		Class calzz = key.getClass(); // 객체 생성 변수에 getClass

		System.out.println(calzz.getName());
		// 패키지와 클래스 이름 출력

		Class clazz = Member.class;
		System.out.println(clazz.getSimpleName());
		// 클래스 이름 출력

	}

}
