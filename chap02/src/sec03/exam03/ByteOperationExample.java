package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 =10 + 20;
		System.out.println(result1);
		
		byte x= 10;
		byte y= 20;
		//byte result2 = x+y; // 컴파일 에러 발생 (int 타입을 byte타입으로 변환 불가)//
			int result2 = x+y;
		System.out.println(result2);
		

	}

}
