package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// throws Exception 은 예외 상황을 화면에 출력함 (예외처리)//
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("키코드 :"+ keyCode);
			
			if(keyCode==113) {
				break;
			}
			System.out.println("종료");
			
		}
		

	}

}
