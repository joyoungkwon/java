package sec01;
import java.util.*;
public class StudentArrayList {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		//클래스 네게만들기
		List <Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름 학과 학번 학점입력");
		
		for(int i =0; i<student.length; i++) {
			System.out.println("다음");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i]= new Student(name,department,number,grade);
			// 파라미터값이있는 생성자 클래스 i번쨰 방마다 호출 후 리턴
			list.add(student[i]);
			//마지막으로 LIST저장
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println("-");
			Student stu = list.get(i); // Arraylist 객체 생성후 저장.
			System.out.println("이름"+stu.getName());
			System.out.println("학과"+stu.department);
			System.out.println("학번"+stu.number);
			System.out.println("평균"+stu.grade);
		}
		System.out.println("-");
		
		while(true) {
			System.out.println("학생이름을입력");
			String name = s.next();
			if(name.equals("그만")){
				System.out.println("종료");
				break;
			}
			for(int i = 0; i<list.size();i++) {
				Student stu = list.get(i);
				stu.find_student(name);
			}
		}
	}

}
