package sec01.exam02;

public class Student extends People{
	public int studentNo;
	// 클래스에 서 다른 메소드를 호출 할때 상속 여부 확인 후
	// 부모 부터 올라가서, 자식으로 내려오는 읽음을함
	// 부모로부터 올라가는 중에 생성자중 맨처음으로 찾는 default 를 찾는데
	// 임의로 지정해놓은 생성자가 없으면 default가 되고 아니면 안됌
	//
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); // 상속 받은 부모 생성자 호출 super(임의 생성자 순서,타입 맞추기)
		this.studentNo = studentNo;
	}
	

}
