package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println(dmbCellPhone.model); // 상속받은 필드 출력.
		dmbCellPhone.turnOnDmb(); // 상속 x 
		dmbCellPhone.bell(); // DmbCellPhone 말고 CellPhone 에 있는 메소드 (상속)

		System.out.println("모델"+dmbCellPhone.model);
		System.out.println("색상"+dmbCellPhone.color);
		
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sedVoice("여보세요");
		
	}

}
