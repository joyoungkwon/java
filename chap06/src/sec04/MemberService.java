package sec04;

public class MemberService {
	//������� ���̵� ��й�ȣ ����
	// ������ �� �⺻ ������.
	// boolean true , false ,   
	
	String id ;
	String password;
	
	boolean login(String id , String password) {
		if(id.equals("id") && password.equals(password)){
			return true;
		}else {
			return false;
		}
	}
	void logout() {
		System.out.println("�α׾ƿ�");
	}
}
