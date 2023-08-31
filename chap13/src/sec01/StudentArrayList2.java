package sec01;
import java.util.*;
public class StudentArrayList2 {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		//클래스 네게만들기
		Map<String, Student>map = new HashMap<>();
		// 제네릭 student타입 으로받기
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
			map.put(name, student[i]);
			//마지막으로 LIST저장
		}
		Set<String> keySet = map.keySet();// 키불러오기
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Student value = map.get(key);
			System.out.println("---------------");
			System.out.println(value.name);
			System.out.println(value.department);
			System.out.println(value.number);
			System.out.println(value.grade);
		}
		System.out.println("---------------");
		
		while(true) {
			System.out.println("학생이름을입력");
			String name = s.next();
			if(name.equals("그만")){
				System.out.println("종료");
				break;
			}
			for(int i = 0; i<map.size();i++) {
				Student stu = map.get(name);
				stu.find_student(name);
			}
		}
	}

}
