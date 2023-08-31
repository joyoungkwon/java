package sec01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		
		
		// true 
		if(obj1.equals(obj2)) {
			System.out.println("1과 2는 같아요");
		}else {
			System.out.println("1과 2는 달라요");
		}
		
		//false
		if(obj1.equals(obj3)) {
			System.out.println("1과 3는 같아요");
		}else {
			System.out.println("1과 3는 달라요");
		}
		if(obj2.equals(obj3)) {
			System.out.println("2과 3는 같아요");
		}else {
			System.out.println("2과 3는 달라요");
		}
	}

}
