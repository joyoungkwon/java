package sec05;

public class Person {
	final String nation ="Korea";
	final String SSN;
	String name;
	
	
	public Person(String ssn, String name) {
		this.SSN=ssn;
		this.name=name;
	}
	
	public static void main(String[]args) {
		Person p1 = new Person("123456-1234567","È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		
		// p1.NATION "usa" ; final Àº °´Ã¼ º¯°æ ¾ÈµÊ
	}
}
