package src01;

public class student {
	// 학생이 가지고 있는 속성 (필드)

	int age; // 나이
	String gender; // 성별
	String name; // 이름

	public student() { // student 객체의 생성자. 객체 생성시 초기화 작업.
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
