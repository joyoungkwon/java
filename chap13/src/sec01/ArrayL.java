package sec01;

public class ArrayL {
	//17�� ���� 
	//�밡�ٷδ� �������ϳ�
	
	String Eng ; //���� ���ڿ�
	String Kor; //�ѱ��� ���ڿ�
	
	
	//�Ķ���� �ΰ��� �޴� ������
	public ArrayL(String Eng, String Kor) {
		this.Eng=Eng;
		this.Kor=Kor;
	}
	// eng�� ����
	public String getEng() {
		return Eng;
	}
	// eng�� �������ִ°�
	public void setEng(String eng) {
		Eng = eng;
	}
	
	public String getKor() {
		return Kor;
	}

	public void setKor(String kor) {
		Kor = kor;
	}
}
