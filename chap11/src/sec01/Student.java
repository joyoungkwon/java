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
	public boolean equals(Object obj) { // equals �޼ҵ� �������̵�
		if (obj instanceof Student) { // instanceof �� ���� ��ü��������.
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
