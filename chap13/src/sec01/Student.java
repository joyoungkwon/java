package sec01;

public class Student {
	String name; // �̸�
	String department;// �а�
	String number; // �й�
	double grade; // ����
	// �ʵ�
	
	// ������.
	public Student(String name, String department, String number, double grade) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.grade = grade;
	}
	// �Ķ���Ͱ� �ʵ�

	// get�޼ҵ�
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

	// �Ķ���� �̸��� �޼ҵ�
	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name +"\n"+ this.department+"\n" + this.number+"\n" + this.grade);
		}else {
			System.out.println("�̸��̾���");
		}
	}

}
