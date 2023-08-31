package sec01;

public class ArrayL {
	//17개 문자 
	//노가다로다 만들어야하나
	
	String Eng ; //영어 문자열
	String Kor; //한국어 문자열
	
	
	//파라미터 두개를 받는 생성자
	public ArrayL(String Eng, String Kor) {
		this.Eng=Eng;
		this.Kor=Kor;
	}
	// eng를 저장
	public String getEng() {
		return Eng;
	}
	// eng를 가지고있는값
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
