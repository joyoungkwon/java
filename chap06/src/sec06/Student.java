package sec06;

import java.util.Scanner;

public class Student {
	Scanner s = new Scanner(System.in);

	private String name = "ȫ�浿"; // �̸�
	
	private String code = "A123";
	private int age; // ����
	private int middleScore; // �߰���� ����
	private int finalScore; // �⸻��� ����
	private double avg;
	final String id = "admin";
	final int pasword = 1234;
	// ������ ����� usingFild
	// ������ ������ �⺻������ �ڵ�����
	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		
		this.avg = avg;
}
	
	
	
	 boolean checkLogin() {
		System.out.println("���̵� �Է�");
		String id = s.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int password = s.nextInt();
		
		if(this.id.equals(id)&&this.pasword==password) {
			return true;
		}else {
			return false;
		}
	}
	 
	 
	 public void inputExam() {
		 System.out.println("�߰����� �Է����ּ���");
		 setMiddleScore(s.nextInt());
		 System.out.println("�⸻������ �Է����ּ���");
		 setFinalScore(s.nextInt());
		 double avg = (double)(getMiddleScore()+getFinalScore())/2;
		 
		 setAvg(avg);
		 System.out.println(getName()+"���� ���������"+getAvg());
	 }
		
}	
		
	

	
	


