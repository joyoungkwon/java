package sec01;

public class Student {
	String name; // 이름
	String department;// 학과
	String number; // 학번
	double grade; // 학점
	// 필드
	
	// 생성자.
	public Student(String name, String department, String number, double grade) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.grade = grade;
	}
	// 파라미터값 필드

	// get메소드
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public double getGrade() {
		return grade;
	}

	// 파라미터 이름값 메소드
	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name +"\n"+ this.department+"\n" + this.number+"\n" + this.grade);
		}else {
			System.out.println("이름이없다");
		}
	}

}
