package sec01;

public class 학생실행구문 {

	public static void main(String[] args) {
		Student stu = new Student(12345,"남",173);
		String result = stu.eat("햄버거");
		System.out.println(result);

	}

}
