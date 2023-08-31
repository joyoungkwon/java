package sec1;

public class 배열범위예외 {

	public static void main(String[] args) {

		String[] a = new String[10];
		a[0] = "가나다";
		String data1 = a[0];

		System.out.println(data1);
		
		
		String data2 = args[0];
		System.out.println(data2);
		//valueOf, to String 모두 object 타입의 값을 String으로 변환
		
		// 단 toString 은 null 처리 안됨
		// Object 담긴 값이 String 아니여도 출력
		
		// Valueof 는 null 값 처리 됨
		// Object 값이 String 아니면 출력 안됌.
		
		
	}

}
