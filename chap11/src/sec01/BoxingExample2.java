package sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		
		// Integer obj = new Integer(100); 정식코드
		// 대잆값이 int 타입이면 자동으로 박싱해줌 
		// 같은 타입일때.
		Integer obj = 100;
		System.out.println(obj);
		
		
		//int value = obj.intValue();
		// 대입값이 같은 타입이면 자동으로 언박싱해줌.
		int value = obj;
		System.out.println(value);
		
		Integer obj2 = new Integer("100");
//		int value2 = Integer.parseInt(obj2);
//		Integer.parseInt는 String 타입을 Integer 타입으로 변경
//		obj2가 String 타입이 아니므로 사용이 불가능
		int value2 = Integer.valueOf(obj2);
//		wrapper 는 포장클래스 이므로 안에있는값을 변경하는게아님
//		valueOf로 값을 꺼내오는거임.
		
		
		//자동boxing
		int value3 = Integer.parseInt("300");
		System.out.println(value3);
		
	}

}
