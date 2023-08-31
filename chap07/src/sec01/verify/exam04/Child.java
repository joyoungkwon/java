package sec01.verify.exam04;

public class Child extends Parent { // 상속 받을때 Parent 의 생성자가 String name 을 가지고 있어서 같은 생성자 를 가지고 있어야 상속함
	private int studentNo;
	
	public Child(String name , int studentNo) {
		super(name); // 부모 메소드 호출
		this.name = name;
		this.studentNo = studentNo;
		
	}
	
	




}
