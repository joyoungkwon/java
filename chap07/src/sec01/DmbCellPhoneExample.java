package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println(dmbCellPhone.model); // ��ӹ��� �ʵ� ���.
		dmbCellPhone.turnOnDmb(); // ��� x 
		dmbCellPhone.bell(); // DmbCellPhone ���� CellPhone �� �ִ� �޼ҵ� (���)

		System.out.println("��"+dmbCellPhone.model);
		System.out.println("����"+dmbCellPhone.color);
		
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sedVoice("��������");
		
	}

}
