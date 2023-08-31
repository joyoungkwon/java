package sec06;

import java.util.Scanner;

public class Student {
	Scanner s = new Scanner(System.in);

	private String name = "홍길동"; // 이름
	
	private String code = "A123";
	private int age; // 나이
	private int middleScore; // 중간고사 성적
	private int finalScore; // 기말고사 성적
	private double avg;
	final String id = "admin";
	final int pasword = 1234;
	// 생성자 만들기 usingFild
	// 만들지 않으면 기본생성자 자동생성
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
		System.out.println("아이디 입력");
		String id = s.next();
		System.out.println("비밀번호를 입력하세요");
		int password = s.nextInt();
		
		if(this.id.equals(id)&&this.pasword==password) {
			return true;
		}else {
			return false;
		}
	}
	 
	 
	 public void inputExam() {
		 System.out.println("중간점수 입력해주세요");
		 setMiddleScore(s.nextInt());
		 System.out.println("기말점수를 입력해주세요");
		 setFinalScore(s.nextInt());
		 double avg = (double)(getMiddleScore()+getFinalScore())/2;
		 
		 setAvg(avg);
		 System.out.println(getName()+"님의 평균점수는"+getAvg());
	 }
		
}	
		
	

	
	


