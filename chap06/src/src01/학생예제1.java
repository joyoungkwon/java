package src01;

public class 학생예제1 {

	public static void main(String[] args) {
		student s1 = new student(); // student 클래스의 s1이라는 인스턴트생성
			student s2 = new student(); // student 클래스의 s2이라는 인스턴트생성
			
			//s1.age;
			//s1.setAge(40);
			if(s1==s2) {
				System.out.println("같은참조");
			}else {
				System.out.println("다른참조");
			}

	} 

}
