package sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "아이폰");
		
		String  strObj = myPhone.toString();
		System.out.println(strObj); // 객체 자체가.오버라이드.

	}

}
