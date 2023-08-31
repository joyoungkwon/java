package sec02.exam06;

public class InstanceofExample {

	
	public static void main(String[] args) {
		Parent parentA = new Child();
		methood1(parentA);
		
		Parent parentB = new Parent();
		methood1(parentB);
		

	}
	
	
	public static void methood1(Parent parent) {
		
	
	if(parent instanceof Child) {
		Child child = (Child)parent;
		System.out.println("강제 변환 성공");
	}else {
		System.out.println("강제변환실패");
	}
}
}
