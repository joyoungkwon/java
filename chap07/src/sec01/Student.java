package sec01;

public class Student extends Human {
	int studentCode ; // �й�
	String studentDept; // �а�
	
	
	Student(int width,int height,int studentCode){ // �θ� ������ �ҷ����� ȣ��
		super(width,height);
		this.studentCode = studentCode;
	}

	
	Student(int studentCode , String gender , int height){
		this.gender = gender;        	//���
		this.height = height;        	//���
	}
	void study(String place) {
		System.out.println(place+"���� �����մϴ�.");
	}
	void dressOn() {
		System.out.println("������ �Խ��ϴ�.");
	}
	void dressOff() {
		System.out.println("������ �����ϴ�.");
	}
	// StudentExamle ���� (���α��� ) Student ��ü ���� �ŰԺ��� 3�� �Ѱ��ֱ�
	// �ڱ� �޼ҵ� 1��ȣ��
	// �θ� �޼ҵ� 2��ȣ��
	
	
	
	@Override // ���� ���̵� source �� override
	String eat(String food) {
		String result = food+"�� ���� �Ծ��";
		return result;
	}
	
}
