package sec01;

public class FindAndReplaecExample {

	public static void main(String[] args) {
		String str ="모든 프로그램 언어는 자바로 개발 할수 있다"; // index값.
		int index = str.indexOf("자바");
		
		String newstr = str.replace("자바", "Java"); // 문자열바꾸기
		
		System.out.println(newstr);
	}

}
