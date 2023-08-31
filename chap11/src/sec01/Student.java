package sec01;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) { // equals 메소드 오버라이드
		if (obj instanceof Student) { // instanceof 로 같은 객체인지참조.
			Student student = (Student) obj;
			if (studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;

	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
